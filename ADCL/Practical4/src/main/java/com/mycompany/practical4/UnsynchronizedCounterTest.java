/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practical4;

import java.util.Scanner;

/**
 *
 * @author ninad
 */
public class UnsynchronizedCounterTest {
    static class Counter {
        int count;
        void inc() {
            count = count+1;
            System.out.println(count);
        }
        int getCount() {
            return count;
        }
    }
    static Counter counter;
    static int numberOfIncrements;
    static class IncrementerThread extends Thread {
        public void run() {
            for (int i = 0; i < numberOfIncrements; i++) {
                counter.inc();
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("How many threads do you want to run from 0 to N?");
            int numberOfThreads = in.nextInt();
            if (numberOfThreads <= 0)
                break;
            do {
                System.out.println();
                System.out.println("How many times should each thread increment the counter?");
                numberOfIncrements = in.nextInt();
                if (numberOfIncrements < 1) {
                    System.out.println("Number of increments must be positive.");
                    numberOfIncrements = 1;
                }
            }
            while (numberOfIncrements <= 0);
            System.out.println();
            System.out.println("Using " + numberOfThreads + " threads.");
            System.out.println("Each thread increments the counter " + numberOfIncrements + " times.");
            System.out.println();
            System.out.println("Working...");
            System.out.println();
            IncrementerThread[] workers = new IncrementerThread[numberOfThreads];
            counter = new Counter();
            for (int i = 0; i < numberOfThreads; i++)
                workers[i] = new IncrementerThread();
            for (int i = 0; i < numberOfThreads; i++) {
                workers[i].start();
                System.out.println("Currenet Thread no. "+i);
            }
            for (int i = 0; i < numberOfThreads; i++) {
                try {
                    workers[i].join();
                }
                catch (InterruptedException e) {}
            }
            System.out.println("Final value of counter is: " + counter.getCount());
        }
    }
}
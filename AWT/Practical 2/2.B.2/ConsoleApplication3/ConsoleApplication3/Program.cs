using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication3
{
    class Test<T>
    {
        T[] value1;
        public Test(T[] t)
        {
            this.value1 = t;
        }
        public void Write()
        {
            Console.Write("Before sorting of an array : ");
            foreach(T a in value1)
            Console.Write(a+" ");
            Array.Sort(value1);
            Console.Write("\nAfter sorting of an array : ");            
            foreach (T B in value1)
            Console.Write(B + " ");
            Console.WriteLine();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            int[] a = { 31, 35, 32, 34, 33 };
            double[] b = { 12.20,12.16,12.12 };
            string[] c = { "Red","Blue","Yellow"};
            Test<int> test1 = new Test<int>(a);
            Console.WriteLine("Integer Sorting");
            test1.Write();
            Test<double> test2 = new Test<double>(b);
            Console.WriteLine("\nDouble Sorting");
            test2.Write();
            Test<string> test3 = new Test<string>(c);
            Console.WriteLine("\nString Sorting");
            test3.Write();
            Console.ReadKey();
        }
    }
}

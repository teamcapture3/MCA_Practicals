using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int day, month, year, result;
            Console.WriteLine("Enter Day:");
            day = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter month:");
            month = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter year:");
            year = int.Parse(Console.ReadLine());
            result = month * day;
            if (result == year)
            {
                Console.WriteLine(day + "/" + month + "/" + year + " is a magic date");
            }
            else
            {
                Console.WriteLine(day + "/" + month + "/" + year + " is not a magic date");
            }
            Console.ReadLine();
        }
    }
}

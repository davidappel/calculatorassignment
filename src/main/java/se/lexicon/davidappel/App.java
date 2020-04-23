package se.lexicon.davidappel;

import java.util.Scanner;

class Calculator
{
    public static void main(String args[])
    {
        int a, b, result;
        char ch;
        Scanner scan = new Scanner(System.in);

        System.out.print("First Number : ");
        a = scan.nextInt();
        System.out.print("Second Number : ");
        b = scan.nextInt();
        System.out.print("Operator (+, -, *, /) : ");
        ch = scan.next().charAt(0);

        if(ch == '+')
        {
            result = a + b;
            System.out.print("Result = " +result);
        }
        else if(ch == '-')
        {
            result = a - b;
            System.out.print("Result = " +result);
        }
        else if(ch == '*')
        {
            result = a * b;
            System.out.print("Result = " +result);
        }
        else if(ch == '/')
        {
            result = a / b;
            System.out.print("Result = " +result);
        }
        else
        {
            System.out.print("Wrong Operator !!!");
        }

    }
}
package com.company;

import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        Random r = new Random();
        for (int i = 0; i < 20; i++)
        { int day = r.nextInt(7);
            switch (day)
            {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                 default:
                     System.out.println("I don't know what you're talking about");
            }
        }
    }
}

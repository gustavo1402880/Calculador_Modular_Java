package Ferramentas;

import  java.util.Scanner;

public class Reader
{
    static Scanner sc = new Scanner(System.in);

    public static String rdString()
    {
        return sc.nextLine();
    }
    public static int rdInt()
    {
        int num = sc.nextInt();
        sc.nextLine();

        return num;
    }
    public static double rdDouble()
    {
        double num = sc.nextDouble();
        sc.nextLine();

        return num;
    }
}

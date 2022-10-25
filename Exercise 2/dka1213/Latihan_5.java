package dka1213;

// Tajuk : Output Statements & Variables

import java.util.Scanner;
import java.text.DecimalFormat;

public class Latihan_5 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat DF;
        DF = new DecimalFormat("#");
        
        DecimalFormat DF2;
        DF2 = new DecimalFormat("#.##");
        
        System.out.println("--------------------------------------");
        
        int total_sub = 9;
        int total_stdnt = 20;
        
        System.out.println("The number of subjects = " + total_sub);
        
        System.out.println("The number of students = " + total_stdnt);
        
        System.out.println("--------------------------------------");
        
        double height = 165;
        char gender = 'M';
        
        System.out.println("My height is " + DF.format(height) + "cm and my gender is " + gender);
        
        System.out.println("--------------------------------------");
        
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        
        System.out.print("Enter your weight : ");
        double weight = scan.nextDouble();
        
        System.out.println("\nMy name is " + name + " and my weight is " + weight + "kg");
        
        System.out.println("--------------------------------------");
        
        System.out.print("Enter your character : ");
        char c = scan.next().charAt(0);
        
        System.out.print("Enter your number of books : ");
        int total = scan.nextInt();
        
        System.out.println("\nThe first character of my hobby is " + c + " and I have read " + total + " books");
        
        System.out.println("--------------------------------------");
        
        double pi = 3.142;
        double r = 4.5;
        
        System.out.println("Circle area = " + DF2.format(pi * r * r) + "cm");
        
        System.out.println("--------------------------------------");
        
    }
}

package base;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter a noun: " );
        Scanner input1 = new Scanner(System.in);
        String noun = input1.nextLine();
        System.out.println( "Enter a verb: " );
        Scanner input2 = new Scanner(System.in);
        String verb = input2.nextLine();
        System.out.println( "Enter an adjective: " );
        Scanner input3 = new Scanner(System.in);
        String adjective = input3.nextLine();
        System.out.println( "Enter an adverb: " );
        Scanner input4 = new Scanner(System.in);
        String adverb = input4.nextLine();

        System.out.println( "Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}

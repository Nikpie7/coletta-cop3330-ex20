/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the order amount? " );
        int order = Integer.parseInt( scan.nextLine() );
        System.out.print( "What state do you live in? " );
        String state = scan.nextLine();
        System.out.print( "What country do you live in? " );
        String county = scan.nextLine();

        double tax = 0.0;

        if( state.toUpperCase().equals("WISCONSIN") ){
            tax = 0.05;
            if ( county.toUpperCase().equals("EAU CLAIRE") ) {
                tax += 0.005;
            }
            else if ( county.toUpperCase().equals("DUNN COUNTY") ) {
                tax += 0.004;
            }
        }
        if( state.toUpperCase().equals("ILLINOIS") ){
            tax = 0.08;
        }

        if( state.toUpperCase().equals("ILLINOIS") || state.toUpperCase().equals("WISCONSIN") ) {
            System.out.println("The tax is $" + String.format("%.2f", tax) + ".");
        }
        System.out.println("The total is $" + String.format("%.2f", order * (1 + tax)) + ".");

    }
}

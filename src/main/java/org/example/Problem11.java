/*
 *  UCF COP3330 Summer 2021 Assignment 11 Solution
 *  Copyright 2021 Sabirah Salau
 */

package org.example;

import java.util.Scanner;

public class Problem11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging?");
        double euros = input.nextDouble();

        System.out.println("What is the exchange rate?");
        double exchangeRate = input.nextDouble();

        double rate = exchangeRate * euros;

        System.out.printf(euros + " euros at an exchange rate of " + exchangeRate + " is: \n%.2f U.S. dollars.", rate);
    }
}

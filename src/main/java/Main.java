/*
 *  UCF COP3330 Summer 2021 Assignment 13 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the principal: ");
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        System.out.print("Enter the rate of interest: ");
        double rate100 = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = input.nextInt();
        double rate = rate100 / 100;
        double amount = principal * Math.pow(1 + (rate / compound), compound * years);
        BigDecimal total = new BigDecimal(Double.toString(amount));
        total = total.setScale(2, RoundingMode.UP);
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", principal, rate100, years, compound, total.doubleValue());
    }
}
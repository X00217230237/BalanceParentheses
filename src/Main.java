package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your expression");
        String expression =scanner.nextLine();
        BalanceParentheses balance = new BalanceParentheses();
         balance.balanceParentheses(expression);
scanner.close();

    }
}
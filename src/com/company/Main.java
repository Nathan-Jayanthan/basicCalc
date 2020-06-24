package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = test.nextDouble();
        System.out.println("Enter second num: ");
        snum = test.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);


    }
}

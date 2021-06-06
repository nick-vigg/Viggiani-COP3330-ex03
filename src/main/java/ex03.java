/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = input.nextLine();
        System.out.println("Who said it?");
        String author = input.nextLine();
        String output = author + " says, " + '"' + quote + '"';
        System.out.println(output);
    }
}

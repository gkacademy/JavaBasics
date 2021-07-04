package com.qa.gkacademy;

import java.util.Scanner;

public class ifElseIfLadder {
    public static void main(String[] args) {
        char grade;
        Scanner mark= new Scanner(System.in);
        mark.hasNext();
        grade = mark.next().charAt(0);
        if (grade=='A'| grade =='a'){
            System.out.println("You scored more than 80%");}
        else if (grade=='B')
            System.out.println("You scored between 70-80%");
        else if (grade=='C')
            System.out.println("You scored between 60-70%");
        else if (grade=='D')
            System.out.println("You scored below 60%");
        else
            System.out.println("Sorry, you failed");
    }

}

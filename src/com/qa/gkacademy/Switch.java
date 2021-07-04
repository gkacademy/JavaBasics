package com.qa.gkacademy;

public class Switch {
    public static void main(String[] args) {
        char grade ='D';

        switch(grade){
            case 'A':
                System.out.println("You scored more than 80%");
                break;
            case 'B':
                System.out.println("You scored between 70-80%");
                break;
            case 'C':
                System.out.println("You scored between 60-70%");
                break;
            case 'D':
                System.out.println("You scored below 60%");
                break;
            default:
                System.out.println("Sorry, you failed");
        }
    }
}

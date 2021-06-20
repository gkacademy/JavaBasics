package com.qa.gkacademy;

import java.util.Scanner;

public class VariablesAndScopes {

    public static void main(String args[]){
      /*  System.out.println ("My fav icecream is "+"chocolate");
        System.out.println ("My fav icecream is" +"\n"+ "chocolate");
        System.out.println ("My fav icecream is \nchocolate");
        System.out.println ("My fav icecream is \t \t \tchocolate");
        System.out.println ("My fav icecream is \rchocolate");
        System.out.println ("My fav icecream is \r\nchocolate");
        System.out.println ("My fav icecream is \fchocolate");
        */

        Scanner sc = new Scanner(System.in);
        System.out.println ("Please enter the icecream flavour");
        if(!sc.hasNext()) {
            String icecream = sc.nextLine();
            System.out.println("Your selected flavour is " + icecream);

            if (icecream == "chocolate") {
                int scoops = 3;
                System.out.println("Get " + scoops + " icecream scoops");
                System.out.println("Get " + icecream + " icecream scoops");
            } else {
                int scoops = 30000;
                System.out.println("Get " + scoops + " icecream scoops");
                System.out.println("Get " + icecream + " icecream scoops");
            }
        }

    }



}

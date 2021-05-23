package com.qa.gkacademy;

public class Loops {
    public static void main(String[] args) {
       /*major loops
        --while
        --for
        --do while
        */

        //print numbers 1 to 5
        //while  //1 2 3 4 5
        int i=1;
        while(i <=5){
            System.out.println(i);
          //  i=i+1; //i=1+1   i=2+1 i=3+1 i=4+1 i=5+1
            i++;
        }
        System.out.println("*********************************");

        //for //5 4 3 2 1
        for(i=5;i>0;i--){
            System.out.println(i);
        }

        System.out.println("*********************************");

        //do while   // 1 2 3 4 5
        int x =1;
        do{
            System.out.println(x);
            x++;
        }while(x<=5);

    }

    /*
    Implement the below items;
    1)  i++
    2)  ++i
    3)  i--
    4)  --i
     */



}

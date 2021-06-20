package com.qa.gkacademy;

public class Incrementers {
    public static void main(String[] args) {
      int a=1;
        System.out.println("Value of a is "+a);
        int b=a++;
        //int b=++a;
        //int b =a--;
        //int b =--a;

        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
        a*=b;  //a=a*b
        a+=b;  //a=a+b
        a-=b;
        a/=b;
        a%=b;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);

    }
}

package com.qa.gkacademy;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int x=4;
        int i[]= new int[6];
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;
        i[4]=50;
        i[5]='A';

    /*    char c[]=new char[2];
        boolean b[]=new boolean[4];
        String s[]=new String[3];*/

        System.out.println(i[2]);
        System.out.println(i[5]);
        System.out.println(i.length);

        for(int j=0;j<(i.length);j++)
            System.out.println(i[j]);

        int y [][]= new int[3][3];
        y[0][0]=10;
        System.out.println(y[0][0]);


       /*
       Difference between 1D and 2D arrays
       1D Declaration -int i[]=new int[4]
       2D Declaration - int j[][]=new int [4][4]

        1D Assignment -i[0]=10;
        2D Assignment -j[0][0]=10;

        1D Print out values -Print i[0];
        2D Print out values -Print i[0][0];

        1D length -len=i.length;
        2D length
        -total no:of rows
        -total no: of columns*/

    }
}

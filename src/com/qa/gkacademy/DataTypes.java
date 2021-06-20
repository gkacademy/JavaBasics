package com.qa.gkacademy;

/*
        This class explains the below;
        --Datatype declarations
        --Printing them
        --Concatenation
*/

public class DataTypes {
    public static void main(String[] args){
        //Primitive Datatypes
        int i=10;
        int j=20;
        double d =8;
         d =8.89;
         char c ='$';
         boolean b =true;

         String str ="100";

/*        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(str);
        System.out.println("The value of i is:"+i);

 */
        System.out.println(i+j);
        System.out.println(i+j+d);
        System.out.println(c+i+j+d);
        System.out.println(str+i+j+d);
        System.out.println(str+(i+j+d));
        System.out.print("New statement");    //just prints
        System.out.println("Result is: "+str+i+(j+d)); //prints and moves the cursor to the new line
    }


}

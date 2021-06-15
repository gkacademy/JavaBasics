public class JavaBasics {

    public static void main(String[] args) {
//The following below are 8 primitive datatypes
        int i=10;
        double d=8.299;
        char c='A';
        boolean b =true;
        short e=32000;
        long f=333332000;
        byte g=120;
        float z=1.2f; //value of "f" has to be added to the end to distinguish between float and double

        //Reference data types - String, Class, Array, Interface, Annotation and enumeration
        String abc="hello";
        int[] mynum={21,31,41};//this is an array which stores multiple values instead of seperate variables

        //This is looking at i++,++i,i-- and --i - these are postfix and prefix operators - prefix operators i.e. ++i will increment the value  before storing.
        int v=0;
        int w=0;
        int x=0;
        int y=0;


        System.out.println(i);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(z);
        System.out.println(abc);
        System.out.println(mynum [2]);
        System.out.println(v--);
        System.out.println(--w);
        System.out.println(x++);
        System.out.println(++y);




    }
}

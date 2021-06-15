import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.javafx.image.BytePixelSetter;

public class JavaHomework {
    public static void main(String[] args) {
        //These are the variables included in the program below
        int x = 3;
        int y = 3;
        int z = 2;

//Lines 12 and 13 check if x is equal or greater than y and z
        if (x >y && x >z) {
            System.out.println("Largest number is " +x);
        } else if (y > x && y > z) { //This checks if y is greater than x or z
            System.out.println("Largest number is " +y);
        }else if  (z > x && y > z){ //This checks if z greater than x or y
            System.out.println("Largest number is " +z);
        }else {
            System.out.println("numbers are equal");
        }

    }
}

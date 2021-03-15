package practice5;

import com.sun.deploy.util.SyncAccess;

import java.util.Arrays;
import java.util.Scanner;

public class soru04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime gir: ");
        String str = scan.next();
        char [] arr = str.toCharArray();
        //System.out.println(Arrays.toString(arr));
        String ters = "";
        for (int i = str.length()-1; i>=0; i--) {
            ters += str.charAt(i);
        }
        System.out.println("Kelimenin tersi: " + ters);

    }
}

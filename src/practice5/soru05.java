package practice5;

import java.util.Scanner;

public class soru05 {
    public static void main(String[] args) {
        //metodla yapalım
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime gir: ");
        String str = scan.next();
        System.out.println(  ters(str)     );
    }
    public static String ters (String a) {
        char [] arr = a.toCharArray();
        String b = "";
        for (int i = a.length()-1; i>=0; i--) {
            b += arr[i];
        }
        System.out.println(b);
        return b;
    }
}

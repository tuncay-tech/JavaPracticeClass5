package practice5;

import java.util.Arrays;
import java.util.Scanner;

public class soru08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phone = scan.nextLine();
        String [] arr = phone.split("");
        //System.out.println(Arrays.toString(arr));
        for(String w: arr) {
            switch (w) {
                case "0" :
                    System.out.print("Sıfır ");break;
                case  "1" :
                    System.out.print("Bir ");break;
                case  "2" :
                    System.out.print("İki ");break;
                case  "3" :
                    System.out.print("Uc ");break;
                case  "4" :
                    System.out.print("Dort ");break;
                case  "5" :
                    System.out.print("Bes ");break;
                case  "6" :
                    System.out.print("Altı ");break;
                case  "7" :
                    System.out.print("Yedi ");break;
                case  "8" :
                    System.out.print("Bir ");break;
                case  "9" :
                    System.out.print("Bir ");break;
            }
        }
    }
}

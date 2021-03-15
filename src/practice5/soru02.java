package practice5;

import java.util.Scanner;

public class soru02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("bir sayı veya kelime giriniz : ");
        String kelime = scanner.next();
        int i =0;
        int j = kelime.length()-1;
        boolean kontrol = true;
        while (i<j){
            if (kelime.charAt(i) != kelime.charAt(j)){
                kontrol =false;
                break;
            }
        i++;
        j--;
        }
        if (kontrol==true){
            System.out.println("polindromik kelime veya sayıdır");
        }else {
            System.out.println("polindromik değildir");
        }

    }
}

package practice5;

public class soru06 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};

        say(nums); // bunu biz metoda atacaz
    }

    public static void say(int[] num) {   // metodumuzu yazıyoruz
        int pozitif = 0;
        int negatif = 0;
        for (int w : num) {
            if (w > 0) {
                pozitif++;
            } else {
                negatif++;
            }
        }
        System.out.println("pozitif sayısı: " + pozitif);
        System.out.println("negatif sayısı: " + negatif);
    }
}

import java.util.Scanner;

public class Main {
    static boolean asal(int sayi, int i) {

        if (i == 1) {
            return true;
        } else if (sayi % i == 0) {
            return false;
        } else {
            return asal(sayi, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi = inp.nextInt();

        if (asal(sayi, sayi / 2)) {
            System.out.println(sayi + " asal sayıdır");
        } else {
            System.out.println(sayi + " asal sayı değildir");
        }
    }
}
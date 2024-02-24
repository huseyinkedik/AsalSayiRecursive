import java.util.Scanner;

public class Main {
    static void asal(int a) {
        boolean asalMi = true;

        if (a < 2) {
            asalMi = false;   // 1 ve 1'den küçükse asal sayı değildir
        } else {

            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    asalMi = false;
                    break;
                }
            }
        }

        if (asalMi) {
            System.out.println(a + " asal sayıdır");
        } else {
            System.out.println(a + " asal sayı değildir");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int a = inp.nextInt();
        asal(a);
    }
}

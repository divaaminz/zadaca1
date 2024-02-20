import java.util.Scanner;
 
public class IspisBrojevaIzmedju{
 
    public static void main(String[] args) {
Scanner skener = new Scanner(System.in);
 
        System.out.print("Unesite broj n: ");
        int n = skener.nextInt();
 
        System.out.println("Brojevi od 1 do " + n + " koji su djeljivi sa sumom svojih cifara su:");
        for (int i = 1; i <= n; i++) {
            if (djeljivi(i)) {
                System.out.print(i + " ");
            }
        }
    }
 
    public static boolean djeljivi(int broj) {
        int sumaCifara = 0;
        int temp = broj;
 
        while (temp > 0) {
            sumaCifara += temp % 10;
            temp /= 10;
        }
 
        return broj % sumaCifara == 0;
    }
}
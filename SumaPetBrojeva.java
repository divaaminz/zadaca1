import java.util.Scanner;
 
public class SumaPetBrojeva {
 
    public static void main(String[] args) {
Scanner skener = new Scanner(System.in);
 
        int suma = 0;
 
        for (int i = 1; i <= 5; i++) {
            System.out.print("Unesite " + i + ". broj: ");
            int broj = skener.nextInt();
            suma += broj;
        }
 
        System.out.println("Suma je: " + suma);
    }
}
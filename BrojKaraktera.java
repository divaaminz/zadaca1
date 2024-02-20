import java.util.Scanner;
public class BrojKaraktera {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
         
                System.out.print("Unesite string: ");
                String dodajString = skener.nextLine();
         
                int brojac = 0;
         
                for (char karakter : dodajString.toCharArray()) {
                    brojac++;
                }
         
                System.out.println("Broj karaktera: " + brojac);
            }
        }

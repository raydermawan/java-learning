import java.util.Scanner;
public class KelilingPersegi {
    public static void main(String[] args) {
        //Deklarasi
        double kll, p, l;

        Scanner keyboard = new Scanner(System.in);

        // -- Input
        System.out.println("== Menghitung Keliling Persegi Panjang");
        System.out.print("P = ");
        p = keyboard.nextInt();
        System.out.print("L = ");
        l = keyboard.nextInt();

        // -- Process
        kll = (2*p) + (2*l);
        System.out.println("Hasil = " + kll);
    }

}

import java.util.Scanner;

public class OperaterAritmatika {
    public static void main(String[] args) {
        int angka1, angka2, hasil;

        Scanner keyboard = new Scanner(System.in);

        //Penjumlahan
        System.out.println("== PENJEMLAHAN ==");
        System.out.print("Input angka 1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka 2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);

        //Pengurangan
        System.out.println("== PENGURANGAN ==");
        System.out.print("Input angka 1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka 2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);

        //Perkalian
        System.out.println("== PERKALIAN ==");
        System.out.print("Input angka 1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka 2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 * angka2;
        System.out.println("Hasil = " + hasil);

        //Pembagian
        System.out.println("== PEMBAGIAN ==");
        System.out.print("Input angka 1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka 2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 / angka2;
        System.out.println("Hasil = " + hasil);

        //Sisa Bagi
        System.out.println("== SISA BAGI == ");
        System.out.print("Input angka 1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka 2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 % angka2;
        System.out.println("Hasil = " + hasil);



    }
}

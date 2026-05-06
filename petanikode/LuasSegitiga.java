import java.util.Scanner;
public class LuasSegitiga {
    public static void main(String[] args){
    // deklarasi
    Double luas;
    float alas, tinggi;

    //membuat scanner baru
    Scanner baca = new Scanner(System.in);

    //input
    System.out.println("== Program hitng luas Segitiga ==");
    System.out.print("Input alas: ");
    alas = baca.nextInt();
    System.out.print("Input tinggi: ");
    tinggi = baca.nextInt();

    //proses
    luas = Double.valueOf((alas * tinggi) / 2);

    //output
    System.out.println("Luas = " + luas);

    }
}

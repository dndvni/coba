import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        float a, b, hasil;
        char operator;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        System.out.println("        Kalkulator Sederhana            ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        System.out.print("Nilai a\t\t: ");
        a = inputScanner.nextFloat();
        System.out.print("Operator\t: ");
        operator = inputScanner.next().charAt(0);
        System.out.print("Nilai b\t\t: ");
        b = inputScanner.nextFloat();

        // Menampilkan semua variabel
        System.out.println("Input user\t: " + a + " " + operator + " " + b);

        // Operator tersedia * / + -
        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil\t\t: " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil\t\t: " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil\t\t: " + hasil);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Nilai b adalah 0 sehingga menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil\t\t: " + hasil);
            }
        } else {
            System.out.println("Operator tidak tersedia");
        }
        inputScanner.close();
    }
}
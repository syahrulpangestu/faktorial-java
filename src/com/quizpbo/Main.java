package com.quizpbo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int key = 1;
        int input_angka;
        Scanner input = new Scanner(System.in);
        Hitung hitung = new Hitung();

        while (key == 1) {
            System.out.print("masukan angka : ");
            input_angka = input.nextInt();

            System.out.print("nilai faktorial " + input_angka + " adalah : " + hitung.faktorial(input_angka));
            System.out.print("\n\npress 1 to retry and any key to stop...");
            key = input.nextInt();
        }
    }
}

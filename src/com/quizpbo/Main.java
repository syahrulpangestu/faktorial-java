package com.quizpbo;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int key = 1;

        while (key == 1) {
            Scanner input = new Scanner(System.in);
            System.out.print("masukan angka : ");
            int input_angka = input.nextInt();
            Hitung hitung = new Hitung();

            System.out.print("nilai faktorial " + input_angka + " adalah : " + hitung.faktorial(input_angka));
            System.out.print("\n\npress 1 to retry and any key to stop...");
            key = input.nextInt();
        }
    }
}

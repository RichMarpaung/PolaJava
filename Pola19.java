package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        jumlah = jumlah*2-1;
        for (int i = 1; i <= jumlah; i++) {
            for (int j = 1; j <= jumlah; j++) {
                if (j == i || j == jumlah - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        for (int i = 1;i<=jumlah;i++){
            for(int j = 1;j<(jumlah-i+1);j++){
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }
}

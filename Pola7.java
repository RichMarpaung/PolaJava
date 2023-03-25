package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        for(int i = 0;i<=jumlah;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k = 1;k<=jumlah-i;k++){
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}

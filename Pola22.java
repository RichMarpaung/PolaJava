package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        int angka = 1;
        for (int i = 1;i<= jumlah;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(angka+" ");
            }
            angka++;
            System.out.println("");
        }
    }
}

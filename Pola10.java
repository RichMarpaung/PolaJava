package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        for (int i = 1;i<=jumlah;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1;i<=jumlah;i++){
            for(int j = 1;j <=jumlah-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

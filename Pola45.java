package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        System.out.print("+");
        for(int z = 0 ;z<jumlah;z++){
            System.out.print("---+");
        }
        System.out.println("");
        for(int i = 0 ;i<jumlah;i++){
            for(int j = 0 ;j<i;j++){
                System.out.print("    ");
            }
            System.out.print("|");
            for(int z = 0 ;z<=jumlah-i-1;z++){
                System.out.print("   |");
            }
            System.out.println("");
            for(int j = 0 ;j<i;j++){
                System.out.print("    ");
            }
            System.out.print("+");
            for(int j = 0 ;j<jumlah-i;j++){
                System.out.print("---+");
            }
            System.out.println("");
        }

    }
}

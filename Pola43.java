package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        System.out.print("+");
        for(int z = 1 ;z<=jumlah;z++){
            System.out.print("---+");
        }
        System.out.println("");
        for(int i = 0 ;i<jumlah;i++){
            System.out.print("|");
            for(int j = 0 ;j<jumlah-i;j++){
                System.out.print("   |");
            }
            System.out.println("");
            System.out.print("+");
            for(int z = 0 ;z<jumlah-i;z++){
                System.out.print("---+");
            }
            System.out.println("");

        }
    }
}


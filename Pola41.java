package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        for(int i = 0 ; i < jumlah;i++){
            System.out.print("+");
            for(int z = 0 ;z<=i;z++){
                System.out.print("---+");
            }
            System.out.println("");

            System.out.print("|");
            for(int j = 0 ;j<=i;j++){
                System.out.print("   |");
            }
            System.out.println("");


        }
        System.out.print("+");
        for(int z = 0 ;z<jumlah;z++){
            System.out.print("---+");
        }
        System.out.println("");
    }
}

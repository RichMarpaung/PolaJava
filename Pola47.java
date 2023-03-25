package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = input.nextInt();
        System.out.print("+");
        for(int z = 0 ;z<jumlah;z++){
            System.out.print("---+");
        }
        System.out.println("");
        for(int i = 0 ;i<jumlah;i++){
            System.out.print("|");
            for(int j = 0 ; j < jumlah-1;j++){
                System.out.print("    ");
            }
            System.out.println("   |");
            if (i<jumlah-1){
                System.out.print("+");
                for(int j = 0 ; j < jumlah-1;j++){
                    System.out.print("    ");
                }
                System.out.println("   +");
            }
        }
        System.out.print("+");
        for(int z = 0 ;z<jumlah;z++){
            System.out.print("---+");
        }

    }
}

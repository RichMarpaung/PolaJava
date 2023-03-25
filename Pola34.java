package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String biner = input.next();
        int panjang = biner.length();
        if (panjang>0){
            System.out.print("+");
            for(int i = 1 ;i<=panjang;i++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for(int i = 0;i<panjang;i++){
                int nilai = Integer.parseInt(String.valueOf(biner.charAt(i)));
                if (nilai==1){
                    System.out.print(" x |");
                }
                else if (nilai == 0){
                    System.out.print(" o |");
                }
                else {
                    System.out.print("   |");

                }
            }
            System.out.println("");
            System.out.print("+");
            for(int i = 1 ;i<=panjang;i++){
                System.out.print("---+");
            }
        }
    }
}

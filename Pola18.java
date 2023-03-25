package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();

        for (int i = 1;i<=jumlah;i++){
            for(int j=0;j<=jumlah-i;j++){
                if (j==jumlah-i){
                    System.out.print("*");
                }
                else{
                    System.out.print("  ");
                }

            }
            for (int j = 2;j<jumlah*2;j++){
                if (j==i){
                    System.out.print("   *");
                }
                else {
                    System.out.print("    ");
                }
            }
            System.out.println("");
        }
    }
}

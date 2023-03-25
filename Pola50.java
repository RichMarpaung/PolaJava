package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = input.nextInt();


        for(int i = 0 ;i<jumlah;i++){
            for(int j= 0;j<jumlah-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int k = 0 ; k<(2*i);k++){
                System.out.print(" ");
            }
            System.out.print("\\");
            System.out.println("");
        }
        for(int i = 0 ;i<jumlah;i++){
            for(int j= 0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int k = 0 ; k<2*(jumlah-i-1);k++){
                System.out.print(" ");
            }
            System.out.print("/");
            System.out.println("");
        }



    }
}

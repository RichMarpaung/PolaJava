package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        if(jumlah>0){
            System.out.print("+");
            for(int i = 1 ;i<=jumlah;i++){
                System.out.print("---+");
            }
            System.out.println("");
            System.out.print("|");
            for(int i = 1 ; i <= jumlah;i++){
                if(i%2==1){

                    System.out.print(" x |");
                }
                else{
                    System.out.print(" o |");
                }
            }
            System.out.println("");
            System.out.print("+");
            for(int i = 1 ;i<=jumlah;i++){
                System.out.print("---+");
            }
        }

    }
}

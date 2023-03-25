package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        jumlah=jumlah*4;
        for(int i = 1;i<=3;i++){
            for(int j = 0;j<=jumlah;j++){
                if(i==1 || i==3){
                    if(j==0 || j%4==0){
                        System.out.print("+");
                    }
                    else{
                        System.out.print("-");
                    }
                }else{
                    if(j==0||j%4==0){
                        System.out.print("|");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }
    }
}

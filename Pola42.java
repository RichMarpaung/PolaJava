package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("rows : ");
        int jumlah = input.nextInt();
        int[] data = new int[jumlah];
        for (int i = 0;i<jumlah;i++){
            data[i]=input.nextInt();
        }

        if(jumlah>0){
            int terbesar = 0;
            for (int i = 0;i<jumlah;i++){
                int banyak = data[i];
                terbesar = Math.max(terbesar,banyak );
                System.out.print("+");
                if(terbesar>0){
                    for(int z = 0 ;z<terbesar;z++){
                        System.out.print("---+");
                    }
                }
                System.out.println("");
                System.out.print("|");
                if (terbesar>0){
                    for(int j = 0 ;j<banyak;j++){
                        System.out.print("   |");
                    }
                }
                System.out.println("");
                terbesar= banyak;
            }
            System.out.print("+");
            for(int z = 0 ;z<data[jumlah-1];z++){
                System.out.print("---+");
            }
            System.out.println("");
        }


    }
}

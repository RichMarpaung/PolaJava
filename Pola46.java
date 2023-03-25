package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("rows : ");
        int jumlah = input.nextInt();
        String[] data = new String[jumlah];
        for (int i = 0;i<jumlah;i++){
            data[i]=input.next();
        }

        if(jumlah>0){
            int terbesar = 0;
            for (int i = 0;i<jumlah;i++){
                int banyak = data[i].length();
                terbesar = Math.max(terbesar,banyak );
                System.out.print("+");
                if(banyak>0){
                    for(int z = 0 ;z<terbesar;z++){
                        System.out.print("---+");
                    }
                }
                System.out.println("");
                System.out.print("|");
                if (terbesar>0){
                    for(int j = 0 ;j<banyak;j++){
                        char angka = data[i].charAt(j);
                        if(angka=='0'){
                            System.out.print(" o |");
                        }
                        else if(angka=='1'){
                            System.out.print(" x |");
                        }
                        else {
                            System.out.print("   |");
                        }


                    }
                }
                System.out.println("");
                terbesar= banyak;
            }
            System.out.print("+");
            for(int z = 0 ;z<terbesar;z++){
                System.out.print("---+");
            }
            System.out.println("");
        }
    }
}

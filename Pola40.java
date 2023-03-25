package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("rows :");
        int p = input.nextInt();
        System.out.print("cols : ");
        int l = input.nextInt();
        String[] angka = new String[p];
        for (int i = 0;i<p;i++){
            angka[i] = input.next();
        }
        if(p > 0 && l > 0){
            System.out.print("+");
            for(int i = 0 ;i<l;i++){
                System.out.print("---+");
            }
            System.out.println("");

            for(int i = 0 ; i < p;i++){
                System.out.print("|");
                for(int j = 0 ;j<l;j++){
                    String nilai = String.valueOf(angka[i].charAt(j));
                    if(nilai.equals("0")){
                        System.out.print(" o |");
                    } else if (nilai.equals("1")) {
                        System.out.print(" x |");

                    }else {
                        System.out.print("   |");
                    }

                }
                System.out.println("");

                System.out.print("+");
                for(int z = 0 ;z<l;z++){
                    System.out.print("---+");
                }
                System.out.println("");
            }
        }

    }
}

package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola49 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int l = input.nextInt();

        for(int i = 0 ;i<p;i++){
            for(int j= 0;j<l;j++){
                System.out.print("/\\");
            }
            System.out.println("");
            for (int k = 0 ; k<l;k++){
                System.out.print("\\/");
            }
            System.out.println("");
        }
    }
}

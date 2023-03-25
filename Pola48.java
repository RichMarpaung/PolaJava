package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int l = input.nextInt();
        System.out.print("+");
        for(int z = 0 ;z<l;z++){
            System.out.print("---+");
        }
        System.out.println("");
        for(int i = 0 ;i<p;i++){
            System.out.print("|");
            for(int j = 0 ; j < l-1;j++){
                System.out.print("    ");
            }
            System.out.println("   |");
            if (i<p-1){
                System.out.print("+");
                for(int j = 0 ; j < l-1;j++){
                    System.out.print("    ");
                }
                System.out.println("   +");
            }
        }
        System.out.print("+");
        for(int z = 0 ;z<l;z++){
            System.out.print("---+");
        }

    }
}

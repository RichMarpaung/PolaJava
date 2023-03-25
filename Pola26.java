package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int l = input.nextInt();
        for (int i = 1 ; i <= p;i++){
            if(i%2==1){
                for(int j = 1 ; j <= l;j++){
                    System.out.print("+ ");
                }
            }
            else {
                for(int j = 1 ; j <= l;j++){
                    System.out.print("= ");
                }
            }

            System.out.println("");
        }
    }
}

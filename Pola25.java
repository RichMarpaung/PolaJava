package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int l = input.nextInt();
        for (int i = 1 ; i <= p;i++){
            for(int j = 1 ; j <= l;j++){
                if(j%2==1){
                    System.out.print("+ ");
                }
                else{
                    System.out.print("= ");
                }
            }
            System.out.println("");
        }
    }
}

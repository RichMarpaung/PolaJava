package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int l = input.nextInt();
        for (int i = 1 ; i <= p;i++){
            if(i%2==1){
                for(int j = 1 ; j <= l;j++){
                    if(j%2==1){
                        System.out.print("+ ");
                    }
                    else{
                        System.out.print("= ");
                    }
                }
            }
            else {
                for(int j = 1 ; j <= l;j++){
                    if(j%2==0){
                        System.out.print("+ ");
                    }
                    else{
                        System.out.print("= ");
                    }                }
            }

            System.out.println("");
        }
    }
}

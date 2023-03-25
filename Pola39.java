package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int l = input.nextInt();
        if(p > 0 && l > 0){
            System.out.print("+");
            for(int i = 0 ;i<l;i++){
                System.out.print("---+");
            }
            System.out.println("");

            for(int i = 0 ; i < p;i++){
                System.out.print("|");
                for(int j = 0 ;j<l;j++){
                    if(i%2==0){
                        if(j%2==0){

                            System.out.print(" x |");
                        }
                        else{
                            System.out.print(" o |");
                        }
                    }
                    else{
                        if(j%2==1){

                            System.out.print(" x |");
                        }
                        else{
                            System.out.print(" o |");
                        }
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

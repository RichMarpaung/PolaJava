package Praktikum1.Nomor6;

import java.util.Scanner;

public class Pola3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bawah = input.nextInt();
        int samping = input.nextInt();
        for(int i = 1;i<=bawah;i++){
            for(int j = 1;j<=samping;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

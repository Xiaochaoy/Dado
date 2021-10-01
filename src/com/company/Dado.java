package com.company;

import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas veces kele tira? ");
        int veces = 0;
        try{
            veces = sc.nextInt();
        }catch (Exception e){
            System.out.println("Que no es numero bobo !!!");
        }

        int resu = 0;
        int dau = 0;
        int dau2 = 0;
        int[] contador = new int[11];

        for (int i = 0; i < veces; i++) {
            dau = (int) (Math.random() * 6 + 1);
            dau2 = (int) (Math.random() * 6 + 1);
            resu = dau + dau2;


            for (int j = 0; j < contador.length; j++) {
                if (resu == j + 2) {
                    contador[j] = contador[j] + 1;
                }
            }
        }

        for (int i = 0; i < contador.length; i++) {
            System.out.println( i+2  + " ---> " + contador[i] + " veces");
        }


    }
}

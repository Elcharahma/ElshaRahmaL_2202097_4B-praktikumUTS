/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.uts.ganjilno1;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class GanjilNo1 {

    public static void main(String[] args) {
        Scanner bulan = new Scanner(System.in);
        System.out.println("Masukkan Angka Sesuai Bulan : ");
        int angka = bulan.nextInt();
        
        switch(angka){
            case 1 :
                System.out.println("January");
                break;
           case 2 :
                System.out.println("February");
                break;
           case 3 :
                System.out.println("March");
                break;
           case 4 :
                System.out.println("April");
                break;
           case 5 :
                System.out.println("May");
                break;
           case 6 :
                System.out.println("June");
                break;
           case 7 :
                System.out.println("July");
                break;
           case 8 :
                System.out.println("August");
                break;
           case 9 :
                System.out.println("September");
                break;
           case 10 :
                System.out.println("Oktober");
                break;
           case 11:
                System.out.println("November");
                break;
           case 12:
                System.out.println("Desember");
                break;
                
           default :
               System.out.println("Salah euy!!");
                
        }
        
    }
}

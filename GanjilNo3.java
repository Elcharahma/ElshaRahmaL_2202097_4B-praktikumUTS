/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.uts.ganjilno3;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class GanjilNo3 {
    
  public static int sumDigits(long n){
        int sum = 0;
        int digit;
        
        while (n!=0){
           digit = (int) n%10 ;
           sum+=digit;
           n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
      Scanner number = new Scanner(System.in);
      long angka;
        System.out.println("Masukkan Bilangan Bulat : ");
        angka = number.nextLong();
        System.out.println("Jumlah Angka dari "+angka+" Adalah : "+sumDigits(angka));
    }
    
   
}

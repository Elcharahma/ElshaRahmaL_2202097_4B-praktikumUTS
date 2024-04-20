/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.uts.ganjilno2;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class GanjilNo2 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int  number,jPositif = 0, jNegatif = 0,  total = 0;
        int jBilangan =0;
        double rata;
        
        System.out.println("Masukkan Bilangan Integer, Program Akan Berhenti Bila 0 : ");
        
        do{
         number = angka.nextInt();
 
        if(number > 0){
            jPositif++;
            jBilangan++;
            total+=number;
            
        }
        else if(number < 0){
            jNegatif++;
            jBilangan++;
            total+=number;
        }
        
        } while (number !=0);
        
         if (jBilangan == 0){
            System.out.println("Tidak Bisa Menghasilkan 0");
        
    }else{
        rata = (double) total / jBilangan;
        
        System.out.println("Jumlah Bilangan Positif = "+jPositif);
        System.out.println("Jumlah Bilangan Negatif = "+jNegatif);
        System.out.println("Total Bilangan  = "+total);
        System.out.println("Rata rata Bilangan = "+rata);
       
}
    }
}
        
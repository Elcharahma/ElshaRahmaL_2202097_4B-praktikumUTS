/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.uts.ganjilno4;

/**
 *
 * @author ELSHA
 */
public class GanjilNo4 {

    public static void main(String[] args) {
        LimasSegiempat limas1 = new LimasSegiempat();
        
        System.out.println("====================================");
        System.out.println("LIMAS SEGIEMPAT SATU");
        System.out.println("Limas Segiempat dengan Luas Alas : "+limas1.luasAlas);
        System.out.println("Luas Selubung Limas : "+limas1.luasSelubungLimas);
        System.out.println("Tinggi : "+limas1.tinggi);
        System.out.println("Luas : "+limas1.getLuas());
        System.out.println("Volume : "+limas1.getVolume());
        
        LimasSegiempat limas2 = new LimasSegiempat();
        limas2.luasAlas = 30;
        limas2.luasSelubungLimas = 40;
        limas2.tinggi = 50;
        System.out.println("====================================");
        System.out.println("LIMAS SEGIEMPAT DUA");
        System.out.println("Limas Segiempat dengan Luas Alas : "+limas2.luasAlas);
        System.out.println("Luas Selubung Limas : "+limas2.luasSelubungLimas);
        System.out.println("Tinggi : "+limas2.tinggi);
        System.out.println("Luas : "+limas2.getLuas());
        System.out.println("Volume : "+limas2.getVolume());
        
        LimasSegiempat limas3 = new LimasSegiempat();
        limas3.setLuasAlas(25);
        limas3.setLuasSelubungLimas(35);
        limas3.setTinggi(45);
        System.out.println("====================================");
        System.out.println("LIMAS SEGIEMPAT TIGA");
        System.out.println("Limas Segiempat dengan Luas Alas : "+limas3.luasAlas);
        System.out.println("Luas Selubung Limas : "+limas3.luasSelubungLimas);
        System.out.println("Tinggi : "+limas3.tinggi);
        System.out.println("Luas : "+limas3.getLuas());
        System.out.println("Volume : "+limas3.getVolume());
    }
}

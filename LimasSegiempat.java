/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.uts.ganjilno4;

/**
 *
 * @author ELSHA
 */
public class LimasSegiempat {
     double luasAlas = 1;
     double luasSelubungLimas = 1;
     double tinggi = 1;
    
public LimasSegiempat(){
    
}
public double getVolume(){
    return (1.0/3) * luasAlas * tinggi;
}

public double getLuas(){
    return luasAlas + luasSelubungLimas;
}

void setLuasAlas (double luasAlasBaru){
    luasAlas = luasAlasBaru;
}
void setLuasSelubungLimas (double luasSelubungLimasBaru){
    luasSelubungLimas = luasSelubungLimasBaru;
}
void setTinggi(double tinggiBaru){
    tinggi = tinggiBaru;
}
}


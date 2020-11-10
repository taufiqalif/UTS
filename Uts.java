/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author taufiq
 */
public class Uts {
    public static void main(String[] args) {
       System.out.println("=======");
       System.out.println("BIODATA");
       System.out.println("=======");
       Scanner input=new Scanner(System.in);
       System.out.print("masukan nama anda: ");
       String nama=input.nextLine();
       System.out.print("masukan NIM anda: ");
       String nim=input.nextLine();
       System.out.print("masukan nilai anda: ");
       int nilai=input.nextInt();
       System.out.println("==================");
       System.out.println("nama anda adalah: "+nama);
       System.out.println("NIM anda adalah: "+nim);
       if((nilai>=0)&&(nilai<=40)){
       System.out.println("nilai anda adalah "+nilai+ " kategori E(Gagal)");
       }else if ((nilai>=40)&&(nilai<=60)){
           System.out.println("nilai anda adalah "+nilai+ " kategori D(Tidak lulus)");
       }else if((nilai>60)&&(nilai<=70)){
           System.out.println("nilai anda adalah "+nilai+ " kategori C(Cukup)");
       }else if((nilai>70)&&(nilai<=80)){
           System.out.println("nilai anda adalah "+nilai+ " kategori B(Baik)");
       }else if((nilai>80)&&(nilai<=100)){
           System.out.println("nilai anda adalah "+nilai+ " kategori A(Sangat baik)");
       }
       else{
           System.out.println("SYSTEM ERROR");
       }
    
    } 
       
}
    

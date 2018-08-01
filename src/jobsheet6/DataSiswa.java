/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.util.Scanner;

/**
 *
 * @author Tasya
 */
public class DataSiswa {
   public static void main(String [] args) {
       
       //deklarasi variable
       String nama , alamat ;
       int usia , absen ;
       
       //membuat variable baru 
     Scanner keyboard = new Scanner(System.in);
     //tampilkan output
         System.out.println ("##DATA SISWA SMK TELKOM MALANG##");
         System.out.print("Nama Siswa :") ;
         //menggunakan scanner dan menyimpan apa yang diketik di variabel nama
         nama= keyboard.next();
         
         //tampilkan output lagi
         System.out.print ("Alamat :");
         //menggunakan scaner lagi
         alamat = keyboard.next ();
         System.out.print("Absen :");
         usia = keyboard.nextInt();
         System.out.print ("Usia :");
         absen= keyboard.nextInt();
         
         //menampilkan apa yg sudah simpan di variable
         System.out.println("-------------------");
         System.out.println("Nama Siswa : " +nama);
         System.out.println("Alamat :"+alamat);
         System.out.println("Absen :"+ usia);
         System.out.println ("Usia :"+ absen +"tahun");
         
     
         
       
       
       
   } 
}

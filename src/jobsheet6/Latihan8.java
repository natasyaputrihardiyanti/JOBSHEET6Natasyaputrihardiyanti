/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author Tasya
 */

public class Latihan8 {
  public static void main(String[]args) throws IOException {
      BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
      String x = " " ;
      int hitungLuas= 0 ;
      System.out.println("---Luas persegi---");
      System.out.print("Masukan nilai sisi: ");
      
      try {
          x= data.readLine();
          int angka = Integer.parseInt(x);
          hitungLuas = angka *angka;
          
      } catch (Exception e) {
          System.out.println ("Error");
      }
      System.out.println("luas persegi dengan sisi "+x +"adalah" +hitungLuas);
      
          
      
      
  }   
  }

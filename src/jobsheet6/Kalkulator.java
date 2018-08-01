/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

/**
 *
 * @author Tasya
 */
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
       Scanner baca = new Scanner(System.in);
       int bilangan1 ;
       int bilangan2 ;
       char operasi ;
       
       System.out.print ("Masukan bilangan pertama  =");
       bilangan1=baca.nextInt();
       System.out.print("Masukan bilangan kedua = ");
       bilangan2=baca.nextInt();
       System.out.print("Masukan operasi =");
       operasi=baca.next().charAt(0);
       
              if(operasi == '+') 
        {
 System.out.print("Hasil: " + (bilangan1 + bilangan2));
        }
     else if (operasi == '-')
     {
        System.out.print("Hasil: " + (bilangan1 - bilangan2)); 
     }
          else if (operasi == '*')
          {
           System.out.print("Hasil: " + (bilangan1 * bilangan2));   
          }
            else if (operasi == '/')
            {
                System.out.print("Hasil: " + (bilangan1 / bilangan2));
            }
               else if (operasi == '%')
               {
                   System.out.print("Hasil: " + (bilangan1 % bilangan2));
               }
               else
               System.out.print("Operasi tidak tersedia");
    }
}
            


package com.asiainfo.chapter1.Jiashihao.Javalianxi;

public class di8ti {
   public static void sortiere(int[] x) {
      boolean unsortiert=true;
      int temp;
       
      while (unsortiert){
         unsortiert = false;
         for (int i=0; i < x.length-1; i++) 
            if (x[i] > x[i+1]) {                      
               temp       = x[i];
               x[i]       = x[i+1];
               x[i+1]     = temp;
               unsortiert = true;
            }          
      } 
   }
    
   public static void main(String[] args) {
      int[] liste = {8,54,17,11,97,68,72,75,22,75};
      sortiere(liste);
      for (int i=0; i<liste.length; i++) 
         System.out.print(liste[i]+" ");    
   } 
}
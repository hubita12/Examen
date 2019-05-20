/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Hubert
 */
public class HJCScasa2 {
    
    public static int[] OrdDesc( int [ ] vector )
    {
         int i;
         boolean flag = true;
         int temp;
 
         while ( flag )
         {
                flag = false;  
                for( i=0;  i < vector.length -1;  i++ )
                {
                       if ( vector[ i ] < vector[i+1] )
                       {
                               temp = vector[ i ]; 
                               vector[ i ] = vector[ i+1 ];
                               vector[ i+1 ] = temp;
                              flag = true; 
                      } 
                } 
          } 
         return vector;
    }
    public static int[] OrdAsc( int [ ] vector )
    {
         int i;
         boolean flag = true;
         int temp;
 
         while ( flag )
         {
                flag = false;   
                for( i=0;  i < vector.length -1;  i++ )
                {
                       if ( vector[ i ] > vector[i+1] )  
                       {
                               temp = vector[ i ];
                               vector[ i ] = vector[ i+1 ];
                               vector[ i+1 ] = temp;
                              flag = true; 
                      } 
                } 
          } 
         return vector;
    }


public void imprimir(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector["+i+"]="+vector[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("Ingrese un numero de vector:");
        Scanner leer=new Scanner(System.in);
        int opcion=leer.nextInt();
        int []vector = {12,77,13,49,96,19,75,68,8,3};
        HJCScasa2 or=new HJCScasa2();    
        System.out.println("Ordenacion descendente:");
        or.imprimir(HJCScasa2.OrdDesc(vector));
        System.out.println("\n");
        System.out.println("Ordenacion Acsendente");
        or.imprimir(HJCScasa2.OrdAsc(vector));
    }
    
}
    
   



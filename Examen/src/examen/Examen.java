/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hubert
 */
public class Examen {
static Scanner leer=new Scanner(System.in);
private static Object Leer;

public static void main(String[] args) {
        System.out.println("Ingrese el numero del Algoritmo que desea probar");
        Scanner leer=new Scanner(System.in);
        int opcion=leer.nextInt();
        int []vector = {42,57,14,40,96,19,8,68,1,4};
        Examen or=new Examen();    
        or.imprimir(Examen.metodoBurbujaDesc(vector));
        System.out.println("\n");
        or.imprimir(Examen.metodoBurbujaAsc(vector));
        System.out.println("\n");System.out.println("\n");System.out.println("IGNORE EL ALGORITMOS DE ARRIBA");
        System.out.println("\n");System.out.println("\n");System.out.println("\n");System.out.println("\n");
        System.out.println("\n");System.out.println("\n");
        while (opcion!=0){            
            switch(opcion){
             case 1: { PagoAdicional(); break; }
             case 2: { LeerT(); break;} 
             case 3: { metodoBurbujaAsc(vector); break;}
             case 4: { Busqueda(); break;}
                default:{System.out.println("Opción no Valida"); break;}
            }
            System.out.println("Ingrese el numero de algoritmo que desea probar:");
            opcion=leer.nextInt();
        }
    }
    

    public static void PagoAdicional() {
        int clave;//Ingresamos la clave de producto
        double st = 0,imp = 0,tp = 0;//Ingresamos subtotal, el impuesto, taotal a pagar
        System.out.println("Ingrese la clave de vehiculo:");
        Scanner leerC=new Scanner(System.in);
        clave=leerC.nextInt();
        System.out.println("Ingrese el SubTotal");
        st=leerC.nextInt();
        if (clave==1){
            tp=(st*10)/100;
            imp=tp*0.10;
        }else if(clave==2){
            tp=(st*7)/100;
            imp=tp*0.7;
        }else if(clave==3){
            tp=(st*5)/100;
            imp=tp*0.5;
        }
        tp=st+imp;
        System.out.println("El precio del producto es:"+st+"  soles");
        System.out.println("El impuesto que tienes es de:"+imp+"  soles");
        System.out.println("El total a pagar es"+tp+"  soles");
    }
    
    public static void LeerT() {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int Numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int Numero2 = leer.nextInt();
        char operacion = 'a';
        int  Suma = 0;
        int  Resta = 0;
        int  Multiplicacion = 0;
        int  Division = 0;
            Suma=Numero1+Numero2;
            System.err.println(Numero1 + " + " +Numero2+" = "+ Suma);
            Resta=Numero1-Numero2;
            System.err.println(Numero1 + " - " +Numero2+" = "+ Resta);
            Multiplicacion=Numero1*Numero2;
            System.err.println(Numero1 + " * " +Numero2+" = "+ Multiplicacion);
            Division=Numero1/Numero2;
            System.err.println(Numero1 + " / " +Numero2+" = "+ Division);     
        }
    
    public static int[] metodoBurbujaDesc( int [ ] vector )
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
    public static int[] metodoBurbujaAsc( int [ ] vector )
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
    public static void Busqueda() {
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.println("el mes es:" +(mes-1));
    }
    
    
}
        

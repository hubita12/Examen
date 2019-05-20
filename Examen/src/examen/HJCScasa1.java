/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hubert
 */
public class HJCScasa1 {
    
public static void OdenacionBinaria() {
        int numero;
        System.out.println("Ingrese uno de estos numeros 1, 3, 4, 8, 12, 13, 10, 45, 37, 1214:");
        Scanner leerK=new Scanner(System.in);
        numero=leerK.nextInt();
        int[] arr = {1, 3, 4, 8, 12, 13, 100, 45, 37, 1214};
        int elementBuscar = numero;

        Arrays.sort(arr);
        numero = Arrays.binarySearch(arr, elementBuscar);

        System.out.println("El elemento se encuentra en la posición:" + numero);
    }
    public static void main(String[] args) {
        OdenacionBinaria();
    }
    
}

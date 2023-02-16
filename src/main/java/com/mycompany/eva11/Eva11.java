/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva11;

import java.util.Scanner;

/**
 *
 * @author Genaro
 */
public class Eva11 {

    public static void main(String[] args) {
          int arreGpos[][];
        Scanner input = new Scanner (System.in);
       System.out.println("Introduce la cantidad de grupos : ");
       int grupos = input.nextInt();
               arreGpos= new int[grupos][];
               for (int i = 0; i < arreGpos.length; i++) {
                   System.out.println("Grupo "+ i);
                   System.out.println("¿Cuántos estuidantes tiene?");
                   int estu = input.nextInt();
                   arreGpos[i] = new int[estu];
                   for (int j = 0; j < arreGpos[i].length; j++) {
                       System.out.println("Estudiante " + j);
                       System.out.println("Calificaci³n ");
                       int califa = input.nextInt();
                       arreGpos[i][j] = califa;
                       for (int k = 0; k < arreGpos[i].length; k++) {
                           System.out.println("¿Cantidad de materias del alumno?");
                           int mate = input.nextInt();
                           arreGpos[i] = new int [mate];
                           System.out.println("Materias " + k);
                           
                       }
                       
                   }
               }
            for (int i = 0; i < arreGpos.length; i++) {
                for (int j = 0; j < arreGpos[i].length; j++) {
                 for (int k = 0; k < arreGpos[i].length; k++) {   
                    System.out.print("[" + arreGpos[i][j] + "]");
                }
                System.out.println();
            }            
            }
    }
}
     


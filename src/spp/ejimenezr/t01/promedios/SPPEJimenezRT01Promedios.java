/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.t01.promedios;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRT01Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Promedio del estudiante");
        //Decalaracion de variables
        int opEntrada;
        double mat, cal1, cal2, cal3, cal4, cal5, res, pro;
        Scanner kb= new Scanner (System.in);
        //Solicitud de datos
        System.out.println("Número de Matrícula");
        mat= kb.nextDouble();
        System.out.println("Calificación de la materia 1");
        cal1= kb.nextDouble();
        System.out.println("Calificación de la materia 2");
        cal2= kb.nextDouble();
        System.out.println("Califiación de la materia 3");
        cal3= kb.nextDouble();
        System.out.println("Calificación de la materia 4");
        cal4= kb.nextDouble();
        System.out.println("Califacación de la materia 5");
        cal5= kb.nextDouble();
        //Operaciones 
        pro= ((cal1+cal2+cal3+cal4+cal5)/5);
        System.out.println("Su promedio es" + pro);
        
        if(pro<7)
            System.out.println("Reprobado");
        if(pro>6.9)
            System.out.println("Aprobado");
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author jepeh
 */
public class CalculoAcademico {
   public static double calcularPromedio(Double[] notas) {
        if (notas == null || notas.length == 0) return 0;
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static boolean esAprobado(double promedio) {
        return promedio >= 14; // Regla de negocio: aprueba con 14
    }
}
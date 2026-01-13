/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author jepeh
 */
public class CReporte implements IReporte {


   @Override
    public void mostrar(Estudiante e, double promedio, boolean aprobado) {
        System.out.println("\n======= REPORTE ======= ");
        System.out.println("Estudiante: " + e.getNombre());
        System.out.println("Promedio Final: " + promedio);
        System.out.println("Estado: " + (aprobado ? "Aprobado" : "Reprobado"));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modularidad;
import java.util.*;

/**
 *
 * @author jepeh
 */
public class Modularidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

       
        System.out.println("Ingrese el nombre del Estudiante:");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de notas:");
        int n = sc.nextInt();
        Double[] notas = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        
        Estudiante estudiante = new Estudiante(nombre, notas);
        double promedioBase = CalculoAcademico.calcularPromedio(estudiante.getNotas());

  
        System.out.println("Desea aplicar el punto extra\n1. Si\n2. No");
        int op = sc.nextInt();

        IBonificacion bonificacion;
        if (op == 1) {
            bonificacion = new Bonoextra();
        } else {
            bonificacion = new SinBono();
        }

       
        double promedioFinal = bonificacion.aplicar(promedioBase);
        boolean aprobado = CalculoAcademico.esAprobado(promedioFinal);

      
        IReporte reporte = new CReporte();
        reporte.mostrar(estudiante, promedioFinal, aprobado);

        sc.close();
    }
}

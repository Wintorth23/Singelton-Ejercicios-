/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author jepeh
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code app
        Impresora usuario1 = Impresora.getInstancia();
        Impresora usuario2 = Impresora.getInstancia();
        Impresora usuario3 = Impresora.getInstancia();
        
        usuario1.imprimir("Deber de Poo");
        usuario1.imprimir("Deber de Fisica");
        usuario2.imprimir("Ejercicios fisica");
        usuario3.imprimir("Reporte de 0");
        
        System.out.println("Total de impresiones: "+usuario1.getTotalimpresiones());
        System.out.println("Total de impresiones: "+usuario2.getTotalimpresiones());
    }
    
}

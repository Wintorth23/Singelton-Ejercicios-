/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author jepeh
 */
public class Impresora {
    private int totalImpresiones;
    private static Impresora instancia;

    private Impresora() {
        System.out.println("impresora encendida");
    }
    public static Impresora getInstancia(){
        
        if (instancia == null){
            instancia = new Impresora();
        }
        return instancia;
    }
    public void imprimir(String documento ){
        
        totalImpresiones++;
        System.out.println("el documento impreso: "+documento);
        
    }
    public int getTotalimpresiones(){
        
        return totalImpresiones;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singelton.ejemplo;

/**
 *
 * @author jepeh
 */
public class ReactorSimple {

    
    private static ReactorSimple instancia;
    
    
    private int temperatura;

    
    private ReactorSimple() {
        this.temperatura = 0;
        System.out.println("Sistema del Reactor inicializado por unica vez.");
    }

    
    public static ReactorSimple getInstancia() {
       
        if (instancia == null) {
            instancia = new ReactorSimple();
        }
       
        return instancia;
    }

   
    public void subirTemperatura(int grados) {
        this.temperatura += grados;
    }

    public int getTemperatura() {
        return this.temperatura;
    }
}


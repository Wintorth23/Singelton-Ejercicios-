/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singelton.ejemplo;

/**
 *
 * @author jepeh
 */
public class SingeltonEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        ReactorSimple reactorA = ReactorSimple.getInstancia();
        reactorA.subirTemperatura(50);
        
        
        ReactorSimple reactorB = ReactorSimple.getInstancia();
        
       
        System.out.println("Temperatura en A: " + reactorA.getTemperatura());
        System.out.println("Temperatura en B: " + reactorB.getTemperatura());

        if (reactorA == reactorB) {
            System.out.println("Resultado: Ambos son exactamente la misma instancia.");
        }
    }
    
}

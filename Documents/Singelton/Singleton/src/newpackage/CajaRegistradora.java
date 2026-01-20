/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author jepeh
 */
public class CajaRegistradora {
    private double totalFacturas;
    private double totalVentas;
    //Definir una variable estatica
    
    private static CajaRegistradora instancia;
    
    private CajaRegistradora(){
        totalVentas = 0.0;
        System.out.println("Caja registradora lista");
        
    }
    public static CajaRegistradora getInstancia(){
        if(instancia==null){
            instancia = new CajaRegistradora();
        }
        return instancia;
    }
    public void registrarVenta(double monto){
        totalFacturas=totalFacturas +monto;
        //totalVentas = totalVentas+monto;
        System.out.println("Venta Registrada! "+monto);
    }
     public void registrarFactura(double monto){
        
        totalVentas = totalVentas+monto;
        System.out.println("Factura registrada! "+monto);
    }
    public double TotalVentas(){
        return totalVentas;
    }
    public double getTotalVentas(){
        return totalVentas;
    }
    public double getTotalFacturas(){
        return totalFacturas;
    }
    public double getTotal(){
        return totalFacturas+totalVentas;
    }
}

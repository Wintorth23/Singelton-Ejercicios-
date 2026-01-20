/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author jepeh
 */
public class ModuloFacturacion {
    public void facturar(double montof){
       CajaRegistradora caja= CajaRegistradora.getInstancia();
       caja.registrarFactura(montof);
        
    }
}

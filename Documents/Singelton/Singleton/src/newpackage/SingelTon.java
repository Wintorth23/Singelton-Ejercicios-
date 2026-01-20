/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;
import java.util.*;
/**
 *
 * @author jepeh
 */
public class SingelTon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc =new Scanner(System.in);
      moduloVentas Ventas = new moduloVentas();
      ModuloFacturacion facturacion = new ModuloFacturacion();
      int op;
      double monto;
      double montof;
      
      do{
          System.out.println("Sistema De Caja Registradora");
          System.out.println("1. Registrar venta");
          System.out.println("2. Registrar Factura");
          System.out.println("3. Ver Total de Ventas");
          System.out.println("4. Ver total de Facturas");
          System.out.println("5. Total");
          System.out.println("6. SALIR");
          System.out.println("Ingrese opcion:");
          op=sc.nextInt();
         sc.nextLine();
         switch (op){
             case 1:
                 System.out.println("Ingrese el monto de la venta ");
                 monto = sc.nextDouble();
                 Ventas.vender(monto);
                 break;       
             case 2:
                 System.out.println("Ingrese la factura de la vemta");
                 montof = sc.nextDouble();
                 facturacion.facturar(montof);
                 break;
             case 3:
                 CajaRegistradora caja= CajaRegistradora.getInstancia();
                 System.out.println("Total acumulado: "+caja.TotalVentas());
                 break;
             case 4:
                 CajaRegistradora cajaf = CajaRegistradora.getInstancia();
                 System.out.println("Factura Registradad: "+ cajaf.TotalVentas() );
                 break;
             case 5 :
                 CajaRegistradora cajaf1 = CajaRegistradora.getInstancia();
                 System.out.println("Factura Registradad: "+ cajaf1.getTotal() );
                 break;
             case 6:
                 break;
             default: 
                 System.out.println("Opcion no valida");
               
                 
                 
         }
         
      }while (op != 4);
      sc.close();
    }
    
}

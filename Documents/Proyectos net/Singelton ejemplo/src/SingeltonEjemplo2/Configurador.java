/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingeltonEjemplo2;

/**
 *
 * @author jepeh
 */
public class Configurador {

    private static String url;
    private static String baseDatos;
    private static  Configurador miconfigurador;

    private Configurador() {
    }

    public static Configurador getConfigurador() {

        if (miconfigurador == null) {

            miconfigurador = new Configurador();
        }
        return miconfigurador;
    }

    private Configurador(String url, String baseDatos) {

        this.url = url;
        this.baseDatos = baseDatos;

    }
    public void registrarUrl(String url){
        
        miconfigurador.setUrl(url);
        
        System.out.println("url Registrado");
        
    }
    public void regitrarBase(String basedatos){
        
        miconfigurador.setBaseDatos(basedatos);
        System.out.println("Base de datos registrada");
    }
            

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
}


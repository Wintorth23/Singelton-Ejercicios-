/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modularidad;

/**
 *
 * @author jepeh
 */
public class SinBono implements IBonificacion {
    @Override
    public double aplicar(double promedioBase) {
        return promedioBase;
    }
}

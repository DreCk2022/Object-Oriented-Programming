/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

/**
 *
 * @author Kike
 */
public class Casual extends Cabina
{

    public Casual(String nombre, String apellido, float horasjuego, String pago, int DNI) {
        super(nombre, apellido, horasjuego, pago, DNI);
    }

 
    @Override
    public void CalcularPrecio() {
        this.preciototal= 1.5f* this.horasjuego;
    }
    
}

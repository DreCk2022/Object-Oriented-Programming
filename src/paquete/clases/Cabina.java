/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Kike
 */
public abstract class Cabina 
{
   
    protected String nombre;
    protected String apellido;
    protected float horasjuego;
    protected float preciototal;
    protected String pago;
    protected int DNI;
    

    public Cabina(String nombre, String apellido, float horasjuego, String pago, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.horasjuego = horasjuego;
        this.pago = pago;
        this.DNI = DNI;
      
        
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getHorasjuego() {
        return horasjuego;
    }

    public void setHorasjuego(float horasjuego) {
        this.horasjuego = horasjuego;
    }

    public float getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(float preciototal) {
        this.preciototal = preciototal;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    
  
    public abstract void CalcularPrecio();

    
    public String VerInfo() {
        return  "Nombre:" + nombre + "\nApellido:" + apellido + "\nHoras de juego:" + horasjuego + "\nPrecio total:" 
                + preciototal +"\nPago:" +  this.pago ;
    }
    
    
    
}

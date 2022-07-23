/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clases;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Kike
 */
public class Esport extends Cabina implements Descuento
{
    private ArrayList<torneos> Torneo;

    public Esport(String nombre, String apellido, float horasjuego, String pago, int DNI) {
        super(nombre, apellido, horasjuego, pago, DNI);
        Torneo= new ArrayList<torneos>();
    }

    public ArrayList<torneos> getTorneo() {
        return Torneo;
    }

    public void setTorneo(ArrayList<torneos> Torneo) {
        this.Torneo = Torneo;
    }
    
    public void IngresarTorneo(torneos ref)
    {
        Torneo.add(ref);
    }
    
    public void mostrarTorneo()
    {
        Iterator<torneos> puntero= Torneo.iterator();
        while(puntero.hasNext())
        {
            torneos aux= puntero.next();
            JOptionPane.showMessageDialog(null, aux.Verinfo());
        }
    }

    @Override
    public void calculardescuento() {
       if(this.horasjuego>3)
       {     
           this.preciototal= (float) (Math.round(((3.5f* this.horasjuego)*Descuento)*100)/100d);
      
       }
    }

    @Override
    public void CalcularPrecio() {
       this.preciototal= (3.5f* this.horasjuego);
    }
    
}

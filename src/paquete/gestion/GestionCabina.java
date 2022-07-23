/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.gestion;

import javax.swing.JOptionPane;
import paquete.clases.*;

/**
 *
 * @author Kike
 */
public class GestionCabina 
{
    private Cabina[] arreglo;
    private int cont;

    public  GestionCabina () 
    {
        arreglo= new Cabina[300];
        cont=0;
    }

    public Cabina[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Cabina[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public void Ingresar(Cabina ref)
    {
        try
        {
            arreglo[cont]= ref;
            cont++;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "No se pudo ingresar la reserva");
        }
              
    }
    
    public void Ordenar()
    {
        Cabina aux;
        for(int i=0;i<cont-1;i++)
        {
            for(int j=i;j<cont;j++)
            {
                if(arreglo[i].getHorasjuego()<arreglo[j].getHorasjuego())
                {
                    aux= arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }
    }
    
    public void Buscar(int DNI)
    {
        int encontro=0;
        for(int i=0;i<cont;i++)
        {
            if(arreglo[i].getDNI() == DNI)
            {
                JOptionPane.showMessageDialog(null, arreglo[i].VerInfo());
                encontro=1;
            }
        }
        if(encontro==0)
        {
            JOptionPane.showMessageDialog(null, "No se encontro la reserva");
        }
    }
    
    public void Actualizar( int DNI, float canthorasjugadas)
    {
          int encontro=0;
        for(int i=0;i<cont;i++)
        {
            if(arreglo[i].getDNI()==DNI)
            {
                arreglo[i].setHorasjuego(canthorasjugadas);
                String str = "Esport";
                
               
                switch(str)
                {
                    case "Esport":
                        Esport x = (Esport)arreglo[i];
                        x.CalcularPrecio();
                        System.out.println(x);
                        break;
                    case "Casual":
                        Casual y = (Casual)arreglo[i];
                        y.CalcularPrecio();
                        System.out.println(y);
                        break;
                    case "Gaming":
                        Gaming z = (Gaming)arreglo[i];
                        z.CalcularPrecio();
                        System.out.println(z);
                        break;
                    default:
                        System.out.println("no match");
                }
                
               
                JOptionPane.showMessageDialog(null, "Se actualizo su reserva");
                encontro=1;
            }
        }
        if(encontro==0)
        {
            JOptionPane.showMessageDialog(null, "No se encontro su reserva");
        }
    }
    
    public void EliminarPorDNI(int DNI)
    {
        for(int i=0;i<cont;i++){
            if(arreglo[i].getDNI()==DNI)
            {
                for(int j=i; j<cont-1; j++){
                    arreglo[j] = arreglo[j+1];
                }
                arreglo[cont] = null;
                cont --;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontro el DNI");
            }
        }
        
    }
   
    
}


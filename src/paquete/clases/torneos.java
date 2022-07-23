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
public class torneos 
{
    private String juego;
    private String premio;
   
    public torneos(String juego, String premio) {
        this.juego = juego;
        this.premio = premio;
        
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
    
    public String Verinfo() {
        return  "Juego:" + juego+"\npremio:"+ "S/"+premio;
    }
    
 
  
    
}

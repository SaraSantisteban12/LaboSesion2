/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.entidades;

import sesion2.entidades.abstracciones.Elemento;

/**
 *
 * @author Estudiante
 */
public class Espacio extends Elemento {
    
   private int tiempo;
   
   public Espacio(){}

    public Espacio(int tiempo, int nivel) {
        super(nivel);
        this.tiempo = tiempo;
        
    }
    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

}

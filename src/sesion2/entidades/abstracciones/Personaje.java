/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.entidades.abstracciones;

/**
 *
 * @author Estudiante
 */
public class Personaje extends Elemento{
    
     private int vida;
    
       public Personaje(int nivel, int vida) {
        super(nivel);   
        this.vida = vida;
       }
       public Personaje(){}

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_git;

/**
 *
 * @author mati
 */
public class Cita {
    //Atributos
    private int hora=0;
    private int minutos=0;
    private String titulo="";
    private String texto;
    //Constructores
    Cita(){};
    Cita(int h, int m, String t, String te){
    this.hora=h;
    this.minutos=m;
    this.texto=te;
    this.titulo=t;
    
    }
    //Getters y Setters
    
    

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    //toString
    @Override
    public String toString() {
        return "Cita{" + "hora=" + hora + ", minutos=" + minutos + ", titulo=" + titulo + ", texto=" + texto + '}';
    }
    //Metodos
    
    
}

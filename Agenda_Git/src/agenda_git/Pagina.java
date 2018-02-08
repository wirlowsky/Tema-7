/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda_git;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Pagina {
    //Atributos
    private int dia=0;
    private int mes=0;
    private ArrayList<Cita> citas= new ArrayList<Cita>();
    //Constructores
    Pagina(){};
    Pagina(int d, int m){
    this.dia=d;
    this.mes=m;
    
    
    };
    
    //Getters y Setters

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }
    //Metodos
    public void añadirCita(Cita c){
    this.citas.add(c);
    }
    public Cita buscaCita(int d, int m) {
        for (Cita c : citas) {
            if (c.getHora() == d && c.getMinutos()== m) {
                return c;

            }//Cierra el if

        }
        return null;

    }
    
}

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
public class Agenda {

    //Atributos
    private int anyo = 0;
    private Pagina[] paginas = new Pagina[365];
    public Pagina pagAbierta = null;

    //Constructores
    Agenda() {};

    
    Agenda(int a, Pagina p, Pagina[] pa) {
        boolean bisiesto= false;
        this.anyo = a;
        this.pagAbierta = p;
        this.paginas = pa;
        if(anyo % 4==0){
        
        
        }//Cierra el if anyo

    }

    ;
    //Getters y Setters

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public void setPaginas(Pagina[] paginas) {
        this.paginas = paginas;
    }

    public Pagina getPagAbierta() {
        return pagAbierta;
    }

    public void setPagAbierta(Pagina pagAbierta) {
        this.pagAbierta = pagAbierta;
    }
    //Metodos
    
    public Pagina buscaPagina(int d, int m){
        for (Pagina pagina : paginas) {
            if(pagina.getDia()==d && pagina.getMes()==m){
            return pagina;
            
            }//Cierra el if
            
        }
        return null;

}
    
}


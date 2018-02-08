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
    Agenda() {
    }

    ;

    
    Agenda(int a, Pagina p, Pagina[] pa) {
        boolean bisiesto = false;
        this.anyo = a;
        this.pagAbierta = p;
        this.paginas = pa;
        if (anyo % 4 == 0) {
            bisiesto = true;
        }//Cierra el if anyo
        inicializa(bisiesto);
    }//Cierra el constructor

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

    public Pagina buscaPagina(int d, int m) {
        for (Pagina pagina : paginas) {
            if (pagina.getDia() == d && pagina.getMes() == m) {
                return pagina;

            }//Cierra el if

        }
        return null;

    }

    private void inicializa(boolean b) {
        this.paginas = new Pagina[b ? 366 : 365];
        int dia = 0;
        int m1 = 1;
        int m0 = 0;

        //
        if ((m1 == 1) || (m1 == 3) || (m1 == 5) || (m1 == 7) || (m1 == 8) || (m1 == 10) || (m1 == 12)) {
            for (int i = 0; i <= 31; i++) {
                paginas[dia++] = new Pagina(i, m1);

            }//cierra for1
            m1++;
        }//meses 31
        //
        if (m1 == 2) {
            for (int i = 0; i <= (b ? 29 : 28); i++) {
                paginas[dia++] = new Pagina(i, m1);

            }
            m1++;
        }//Febrero mola mil

        if ((m1 == 4) || (m1 == 6) || (m1 == 9) || (m1 == 11)) {
            for (int i = 0; i <= 30; i++) {
                paginas[dia++] = new Pagina(i, m1);
            }
            m1++;
        }//meses 30

    }//Cierra el inicializa

}

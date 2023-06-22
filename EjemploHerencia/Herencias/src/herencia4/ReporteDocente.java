/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    
    public ReporteDocente (String c, ArrayList<Docente> d) {
        super (c);
        lista = d;
    }

    public double obtenerPromedioSueldos() {
        establecerPromedioSueldos();
        return promedioSueldos;
    }

    public void establecerPromedioSueldos() {
        int suma=0;
        for (int i=0; i<lista.size(); i++) {
            suma+=lista.get(i).getSueldo();
        }
        promedioSueldos = suma/lista.size();
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public void eltablecerLista(ArrayList<Docente> l) {
        lista = l;
    }
    
    @Override
    public String toString () {
        String cadena = String.format("\nREPORTE DOCENTES\n\t%s\n", super.toString());        
        for (int i=0;i<obtenerLista().size();i++) {
            cadena = String.format("%s\n\tNombre: %s\n"
                    + "\tApellido: %s\n"
                    + "\tSueldo: %.3f\n", 
                    cadena, 
                    obtenerLista().get(i).getNombre(),
                    obtenerLista().get(i).getApellido(),
                    obtenerLista().get(i).getSueldo());
        }
        
        cadena = String.format("%s\n\tPromedio de sueldos: %.3f", 
                cadena, obtenerPromedioSueldos());
        
        return cadena;
    }    
}

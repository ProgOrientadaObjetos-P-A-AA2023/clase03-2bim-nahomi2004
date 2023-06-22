/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante (String c, ArrayList<Estudiante> l) {
        super (c);
        lista = l;
    }
    
    public double obtenerPromedioMatriculas() {
        eltablecerPromedioMatriculas();
        return promedioMatriculas;
    }

    public void eltablecerPromedioMatriculas() {
        int suma=0;
        for (int i=0; i<lista.size(); i++) {
            suma+=lista.get(i).getMatricula();
        }
        promedioMatriculas = suma/lista.size();
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public void eltablecerLista(ArrayList<Estudiante> l) {
        lista = l;
    }
    
    @Override
    public String toString () {
        String cadena = String.format("\nREPORTE ESTUDIANTES\n\t%s\n", super.toString());        
        for (int i=0;i<obtenerLista().size();i++) {
            cadena = String.format("%s\n\tNombre: %s\n"
                    + "\tApellido: %s\n"
                    + "\tSueldo: %.3f\n", 
                    cadena, 
                    obtenerLista().get(i).getNombre(),
                    obtenerLista().get(i).getApellido(),
                    obtenerLista().get(i).getMatricula());
        }
        
        cadena = String.format("%s\n\tPromedio de matriculas: %.3f", 
                cadena, obtenerPromedioMatriculas());
        
        return cadena;
    }  
}

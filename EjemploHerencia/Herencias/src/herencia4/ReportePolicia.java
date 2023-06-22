/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia (String c, ArrayList<Policia> l) {
        super (c);
        lista = l;
    }
    
    public double obtenerPromedioEdades() {
        eltablecerPromedioEdades();
        return promedioEdades;
    }

    public void eltablecerPromedioEdades() {
        int suma=0;
        for (int i=0; i<lista.size(); i++) {
            suma+=lista.get(i).getEdad();
        }
        promedioEdades = suma/lista.size();
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public void eltablecerLista(ArrayList<Policia> l) {
        lista = l;
    }
    
    @Override
    public String toString () {
        String cadena = String.format("\nREPORTE POLICIAS\n\t%s\n", super.toString());        
        for (int i=0;i<obtenerLista().size();i++) {
            cadena = String.format("%s\n\tNombre: %s\n"
                    + "\tApellido: %s\n"
                    + "\tSueldo: %d\n", 
                    cadena, 
                    obtenerLista().get(i).getNombre(),
                    obtenerLista().get(i).getApellido(),
                    obtenerLista().get(i).getEdad());
        }
        
        cadena = String.format("%s\n\tPromedio de edades: %.3f", 
                cadena, obtenerPromedioEdades());
        
        return cadena;
    }  
}

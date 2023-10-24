 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Ruta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ListaRutas {
        private List<Ruta> rutas;
    // Implementar métodos para recuperar rutas de la base de datos...
    
    public ListaRutas(){
        rutas = new ArrayList<>();
        rutas.add(new Ruta("Valledupar", "Pueblo Bello", LocalTime.of(8, 0), LocalDate.of(2023, 10, 25), 1, 50.0));
        rutas.add(new Ruta("Valledupar", "Codazzi", LocalTime.of(10, 0), LocalDate.of(2023, 10, 26), 2, 60.0));
        rutas.add(new Ruta("Valledupar", "Casacara", LocalTime.of(12, 0), LocalDate.of(2023, 10, 27), 3, 70.0));
    }
    
    public List<Ruta> mostrarRuta() {
        return rutas;
        // Implementar la lógica para obtener todas las rutas de la base de datos...
    }

    public Ruta consultarRuta(int codigo) {
         for (Ruta ruta : rutas) {
            if (ruta.getCodigo() == codigo) {
                return ruta;
            }
        }
        return null;
        // Implementar la lógica para buscar una ruta por su código en la base de datos...
    }

    public void modificarRuta(int codigo, Ruta nuevaRuta) {
        for (int i = 0; i < rutas.size(); i++) {
            Ruta ruta = rutas.get(i);
            if (ruta.getCodigo() == codigo) {
                // Actualiza los atributos de la ruta con los de la nuevaRuta
                ruta.setOrigen(nuevaRuta.getOrigen());
                ruta.setDestino(nuevaRuta.getDestino());
                ruta.setHora(nuevaRuta.getHora());
                ruta.setFecha(nuevaRuta.getFecha());
                ruta.setPrecio(nuevaRuta.getPrecio());
                return; 
        // Implementar la lógica para modificar una ruta existente en la base de datos...
    }
    }
 }

    public ArrayList<Ruta> getRutas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

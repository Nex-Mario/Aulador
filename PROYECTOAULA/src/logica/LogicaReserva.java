/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import entidades.Reserva;
import java.util.List;
import persistencia.*; 

public class LogicaReserva {
    private IGuardadoReserva datos ;

    public LogicaReserva() {
       this.datos = new ListaReserva();
    }
    public Reserva consultarReserva(String Usuario){
        return this.datos.consultarReservas(Usuario);
    }
    public List<Reserva> mostrarReserva () {
        return this.datos.mostrarDatosReserva();
    }
}

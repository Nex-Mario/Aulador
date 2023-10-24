/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.Vehiculo;
import persistencia.*; 
import java.util.List;
/**
 *
 * @author User
 */
public class LogicaVehiculo {
    private IGuardadoVehiculos datos ;

    public LogicaVehiculo() {
        this.datos= new ListaVehiculo();
    }
    public Vehiculo consultarRutas (String numVeh) {
        Vehiculo v = this.datos.consultarVehiculos (numVeh) ;
        return v ;
    }
}

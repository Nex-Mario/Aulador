/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.Vehiculo;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public interface IGuardadoVehiculos {
    Vehiculo consultarVehiculos(int numVeh);
    ArrayList<Vehiculo> mostrarVehiculos();

    public Vehiculo consultarVehiculos(String numVeh);
 }


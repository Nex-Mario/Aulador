/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import persistencia.ListaUsuario;

/**
 *
 * @author User
 */
public class Administrador extends Usuario {

    @Override
    public boolean inicioSesion() {
      ListaUsuario listaUsuario = new ListaUsuario();
        ArrayList<Usuario> listaUsuarios = listaUsuario.mostrarDatosUsuarios();

        // Obtener los datos del conductor actual.
        String usernameConductor = getUsername();
        String contraseñaConductor = getContraseña();

        // Verifica las credenciales del conductor en la lista de usuarios.
        boolean inicioSesionExitoso = false;
        for (Usuario usuario : listaUsuarios) {
            if (usuario instanceof Conductor) {
                Conductor conductor = (Conductor) usuario;
                // Verificar las credenciales del conductor.
                if (conductor.getUsername().equals(usernameConductor) && conductor.getContraseña().equals(contraseñaConductor)) {
                    inicioSesionExitoso = true;
                    break;
                }
            }
        }

        if (inicioSesionExitoso) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Inicio de sesión fallido. Verifica tu nombre de usuario y contraseña.");
        }
        return false;
    }
   
     public void ModificarRuta(Ruta ruta, String nuevoOrigen, String nuevoDestino) {
        ruta.setOrigen(nuevoOrigen);
        ruta.setDestino(nuevoDestino);
        System.out.println("Ruta modificada. Nuevo origen: " + nuevoOrigen + ", Nuevo destino: " + nuevoDestino);
    }

    public void ModificarFecha(Ruta ruta, LocalDate nuevaFecha) {
        ruta.setFecha(nuevaFecha);
        System.out.println("Fecha modificada. Nueva fecha: " + nuevaFecha);
    }

    public void ModificarHora(Ruta ruta, LocalTime nuevaHora) {
        ruta.setHora(nuevaHora);
        System.out.println("Hora modificada. Nueva hora: " + nuevaHora);
    }

    @Override
    public String toString() {
        return null ;
    }
}

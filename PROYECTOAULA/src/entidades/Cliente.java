/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import persistencia.ListaRutas;
import persistencia.ListaUsuario;

/**
 *
 * @author User
 */
public  class Cliente extends Usuario {

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
            System.out.println("Inicio de sesión exitoso Sr@ Cliente.");
        } else {
            System.out.println("Inicio de sesión fallido. Verifica tu nombre de usuario y contraseña.");
        }
        return false;
    }
   
    public void elegirRuta(ListaRutas listaRutas) {
        // Mostrar las rutas disponibles al cliente
        ArrayList<Ruta> rutas = listaRutas.getRutas();
        int index = 1;
        for (Ruta ruta : rutas) {
            System.out.println(index + ". Origen: " + ruta.getOrigen() +
                    ", Destino: " + ruta.getDestino() +
                    ", Hora: " + ruta.getHora() +
                    ", Fecha: " + ruta.getFecha() +
                    ", Precio: $" + ruta.getPrecio());
            index++;
        }   
    }
   //  public void elegirRuta(Ruta ruta) {
   //     System.out.println("Origen: " + ruta.getOrigen());
   //     System.out.println("Destino: " + ruta.getDestino());
   //     System.out.println("Hora: " + ruta.getHora());
   //     System.out.println("Fecha: " + ruta.getFecha());
   // }
    
    public void elegirFecha(LocalDate fecha) {
        System.out.println("Fecha elegida: " + fecha);
    }

    public void elegirHora(LocalTime hora) {
        System.out.println("Hora elegida: " + hora);
    }
     public void elegirEncargo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea enviar un paquete u objeto? (Sí/No): ");
        String respuesta = scanner.nextLine().toLowerCase();
        
        if (respuesta.equals("sí")) {
            System.out.print("Especifique el objeto a encomendar: ");
            String encargo = scanner.nextLine();
            System.out.println("Encargo elegido: " + encargo);
        } else {
            System.out.println("No enviará ningún paquete u objeto.");
        }
    }

    public void calificarConductor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calificación del conductor (1-5 estrellas): ");
        int calificacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Comentario (breve descripción de la experiencia): ");
        String comentario = scanner.nextLine();
        System.out.println("Calificación: " + calificacion + " estrellas");
        System.out.println("Comentario: " + comentario);
    }

    public void elegirCarga() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Llevará carga? (Sí/No): ");
        String respuesta = scanner.nextLine().toLowerCase();
        
        if (respuesta.equals("sí")) {
            System.out.print("Especifique la carga: ");
            String carga = scanner.nextLine();
            System.out.println("Carga elegida: " + carga);
        } else {
            System.out.println("No llevará carga.");
        }
    }

    @Override
    public String toString() {
        return null ;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import entidades.*;
import java.time.LocalDate;
import logica.*;
import persistencia.*;

/**
 *
 * @author User
 */
public class VistaConsola {
    public void muestraMenu(){
        System.out.println("**********************");
        System.out.println("    [ Cooperator ]    ");
        System.out.println("**********************");
        System.out.println("---------------------------");
        System.out.println(" 1. Inicio de secion administrador ");
        System.out.println(" 2. Mostrar rutas ");
        System.out.println(" 3. Buscar ruta ");
        System.out.println(" 4. Salir del programa \n ");
    }
    
    public void ejecutarMenu() {
        int op;
        do {
            this.muestraMenu();
            op = LectorDatos.leerInt("Seleccione una opcion");
            switch (op) {
                case 1:
                    this.iniciosSecionAdmin();
                    break;
                case 2:
                    this.listaDeRutas();
                    break;
                case 3:
                    this.opBuscarRuta();
                    break;
                case 4:
                    System.out.println("Ha sido un placer, cerrando programa...");
                    break;
                default:
                    System.out.println("!! Opcion no valida ¡¡\n");

            }

        } while (op != 4);

    }
    
    public void iniciosSecionAdmin(){
        int dat, opc;
        dat = LectorDatos.leerInt("Ingrese el codigo de secion: ");
        if (dat>100){
            System.out.println("");
            opc = LectorDatos.leerInt("¿Ingrese el codigo de la ruta que desea modificar?: ");
            Ruta rutaBuscada;
            rutaBuscada = Ruta.consultarRuta(opc);
            rutaBuscada.modificarPrecio();
            System.out.println("El precio de esta ruta ha sido modificado");
        }
    }
    
    
    
    public void opBuscarRuta() {
        
        int continuar;
        do {
            System.out.println("");
            System.out.println("    Buscar Ruta ");
            System.out.println("--------------------------------");
            Ruta rutaBuscada;
            int codigoRuta = LectorDatos.leerInt("Codigo de ruta: ");
            
            rutaBuscada = Ruta.consultarRuta(codigoRuta);
            System.out.println("---------------------------------");
            if(rutaBuscada==null){
                System.out.println("La ruta no ha sido registrada \n ");
            }
            else{
                 System.out.println(rutaBuscada.toString());
            }
            System.out.println("");     
            continuar = LectorDatos.leerInt("Desea buscar otra ruta [1->Si][Otro->No]");
        } while (continuar == 1);

    }

    private void listaDeRutas() {
        ListaRutas muestra = new ListaRutas();
        muestra.mostrarRuta();
    }
   
}

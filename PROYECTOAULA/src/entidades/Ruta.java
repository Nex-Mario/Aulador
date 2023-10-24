/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.time.LocalDate;
import java.time.LocalTime;
import vista.LectorDatos;
/**
 *
 * @author User
 */
public class Ruta {

    public static Ruta consultarRuta(int codigoRuta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String origen;
    private String destino;
    private LocalTime hora;
    private LocalDate fecha;
    private int codigo;
    private double precio;

    public Ruta() {
    }

    public Ruta(String origen, String destino, LocalTime hora, LocalDate fecha, int codigo, double precio) {
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.fecha = fecha;
        this.codigo = codigo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Ruta{" + "origen=" + origen + ", destino=" + destino + ", hora=" + hora + ", fecha=" + fecha + ", codigo=" + codigo + ", precio=" + precio + '}';
    }  
    
    public void modificarPrecio(){
        double nuevoPrecio = LectorDatos.leerDouble("Inserte el nuevo precio de esta ruta: ");
        this.precio = nuevoPrecio;
    }
    
}

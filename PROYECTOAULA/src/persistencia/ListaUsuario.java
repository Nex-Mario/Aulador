/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import persistencia.IUsuario;
/**
 *
 * @author User
 */
public class ListaUsuario implements IUsuario {
    
    private List<Usuario> listaUsuario;
    
    public ListaUsuario(){
        this.listaUsuario =  new ArrayList();
    }
    
    @Override
    public void agregarUsuario(Usuario T){
        this.listaUsuario.add(T);
    }
    
    @Override
    public ArrayList<Usuario> mostrarDatosUsuarios(){
        ArrayList<Usuario> ListaU = new ArrayList(this.listaUsuario);
        return ListaU;
    }
    
    @Override
    public Usuario consultarUsuario(String infoUsuario){
        Usuario usuarioConsultado =null;
        for(Usuario T: this.listaUsuario){
            if(T.getCedula() == null ? infoUsuario == null : T.getCedula().equals(infoUsuario)) {
                usuarioConsultado = T;
                break;
            }
        }
        return usuarioConsultado;
    }
}


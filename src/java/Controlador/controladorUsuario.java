/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entidades.Usuario;
import Modelo.modeloUsuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class controladorUsuario {

    public void guardaUsuario(String id, String contra) {

        Usuario usuario = new Usuario();
        usuario.setIdUsuario(id);
        usuario.setContraseña(contra);
        modeloUsuario.logUp(usuario);
    }

    public List<Usuario> listaUsuario() {
        List<Usuario> listaUsuario = null;

        listaUsuario = modeloUsuario.listarUsuario();

        return listaUsuario;
    }

    public Usuario buscaUsuario(String idUsuario) {
        Usuario estado = null;
        estado = modeloUsuario.buscarUsuario(idUsuario);
        return estado;
    }
    public void logIn(String usuario, String clave) {
        if(modeloUsuario.logIn(usuario,clave)){
            //Login correcto
            JOptionPane.showMessageDialog(null, "Login Correcto");
        } else {
            //login incorrecto
            JOptionPane.showMessageDialog(null, "Login Incorrecto");
        }     
    }
}

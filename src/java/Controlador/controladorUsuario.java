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

    public boolean guardaUsuario(String id, String contra, String contra2) {
        boolean band = false;
        if (contra.equals(contra2)) {
            band = true;
            Usuario usuario = new Usuario();
            usuario.setIdUsuario(id);
            usuario.setContraseña(contra);
            modeloUsuario.logUp(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Vuelva a escribir la contraseña");
        }
        return band;
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

    public boolean logIn(String usuario, String clave) {
        boolean band = false;
        if (modeloUsuario.logIn(usuario, clave)) {
            //Login correcto
            band = true;
            JOptionPane.showMessageDialog(null, "Login Correcto");

        } else {
            //login incorrecto
            JOptionPane.showMessageDialog(null, "Login Incorrecto");
        }
        return band;
    }
}

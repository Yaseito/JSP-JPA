/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Entidades.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author User
 */
public class modeloUsuario {

    static private Session sesion;

    static private void iniciaOperacion() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        sesion = sessionFactory.openSession();
        sesion.getTransaction().begin();
    }

    static private void terminaOperacion() {
        sesion.getTransaction().commit();
        sesion.close();
    }

    static public boolean logIn(String user, String clave) {
        boolean band = false;
        Usuario usuario = null;
        String contra = null;
        try {
            iniciaOperacion();
            usuario = (Usuario) sesion.get(Usuario.class, user);
            contra = usuario.getContraseña();
            if (clave.equals(contra)) {
                band = true;
            }
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return band;

    }

    static public List<Usuario> listarUsuario() {
        List<Usuario> listaUsuario = null;
        try {
            iniciaOperacion();
            listaUsuario = sesion.createQuery("from Usuario").list();
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listaUsuario;
    }

    static public String logUp(Usuario user) {

        String id = user.getIdUsuario();
        try {
            iniciaOperacion();
            id = (String) sesion.save(user);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return id;
    }

    static public Usuario buscarUsuario(String idUsuario) {
        Usuario usuario = null;
        try {
            iniciaOperacion();
            usuario = (Usuario) sesion.get(Usuario.class, idUsuario);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return usuario;
    }
}

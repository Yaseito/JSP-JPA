/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Entidades.Estados;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author User
 */
public class modeloEstados {
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
    static public String guardaEstados(Estados estados) {
        String id = estados.getIdEstado();
        try {
            iniciaOperacion();
            id = (String) sesion.save(estados);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return id;
    }

    static public Estados buscarEstados(String idEstados) {
        Estados estado = null;
        try {
            iniciaOperacion();
            estado = (Estados) sesion.get(Estados.class, idEstados);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return estado;
    }

    static public List<Estados> listarEstados() {
        List<Estados> listaEstados = null;
        try {
            iniciaOperacion();
            listaEstados = sesion.createQuery("from Estados").list();
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listaEstados;
    }
}

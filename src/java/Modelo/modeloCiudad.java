/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Entidades.Ciudad;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author User
 */
public class modeloCiudad {

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

    static public int guardaCiudad(Ciudad ciudad) {
        int id = ciudad.getIdCiudad();
        try {
            iniciaOperacion();
            id = (int) sesion.save(ciudad);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return id;
    }

    static public Ciudad buscarCiudad(int idCiudad) {
        Ciudad ciudad = null;
        try {
            iniciaOperacion();
            ciudad = (Ciudad) sesion.get(Ciudad.class, idCiudad);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return ciudad;
    }

    static public List<Ciudad> listarCiudad() {
        List<Ciudad> listaCiudad = null;
        try {
            iniciaOperacion();
            listaCiudad = sesion.createQuery("from Ciudad").list();
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listaCiudad;
    }
}

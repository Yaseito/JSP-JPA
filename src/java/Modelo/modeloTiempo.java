/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Entidades.Tiempo;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author User
 */
public class modeloTiempo {
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
    
   static public int guardaTiempo(Tiempo tiempo) {
        int id = tiempo.getIdTiempo();
        try {
            iniciaOperacion();
            id = (int) sesion.save(tiempo);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return id;
    }

    static public Tiempo buscarTiempo(int idTiempo) {
        Tiempo tiempo = null;
        try {
            iniciaOperacion();
            tiempo = (Tiempo) sesion.get(Tiempo.class, idTiempo);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return tiempo;
    }

    static public List<Tiempo> listarTiempo() {
        List<Tiempo> listaTiempo = null;
        try {
            iniciaOperacion();
            listaTiempo = sesion.createQuery("from Tiempo").list();
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listaTiempo;
    }
}
    

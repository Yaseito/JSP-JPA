/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Entidades.TiempoId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author User
 */
public class modeloTiempoId {
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
    
   static public Date guardaTiempoId(TiempoId tiempoid) {
        Date fecha = tiempoid.getFecha();
        try {
            iniciaOperacion();
            fecha = (Date) sesion.save(tiempoid);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return fecha;
    }

    static public TiempoId buscarTiempoId(int idTiempoId) {
        TiempoId tiempoId = null;
        try {
            iniciaOperacion();
            tiempoId = (TiempoId) sesion.get(TiempoId.class, idTiempoId);
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return tiempoId;
    }

    static public List<TiempoId> listarTiempoId() {
        List<TiempoId> listaTiempoId = null;
        try {
            iniciaOperacion();
            listaTiempoId = sesion.createQuery("from Tiempo").list();
            terminaOperacion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listaTiempoId;
    }   
}

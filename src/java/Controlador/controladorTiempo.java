/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entidades.Ciudad;
import Modelo.Entidades.Estados;
import Modelo.Entidades.Tiempo;
import Modelo.Entidades.TiempoId;
import Modelo.modeloCiudad;
import Modelo.modeloEstados;
import Modelo.modeloTiempo;
import Modelo.modeloTiempoId;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class controladorTiempo {

    public boolean guardaTiempo(int id, String ciudad, int tem_max, int tem_min, String estado, String tiempoid) {
        Ciudad ciu = modeloCiudad.buscarCiudad(Integer.parseInt(ciudad));
        Estados est = modeloEstados.buscarEstados(estado);
        TiempoId tid = modeloTiempoId.buscarTiempoId(Integer.parseInt(tiempoid));
        boolean band = false;
        if(id > 0){
        Tiempo tiempo = new Tiempo();
        tiempo.setIdTiempo(id);
        tiempo.setCiudad(ciu);
        tiempo.setTempMax(tem_max);
        tiempo.setTempMin(tem_min);
        tiempo.setEstados(est);
        tiempo.setId(tid);
        modeloTiempo.guardaTiempo(tiempo);
        band=true;
        }else{
            JOptionPane.showMessageDialog(null, "Error en guardar");
        };
        return band;
    }

    public List<Tiempo> listaTiempo() {
        List<Tiempo> listaTiempo = null;

        listaTiempo = modeloTiempo.listarTiempo();

        return listaTiempo;
    }

    public Tiempo buscaTiempo(int idTiempo) {
        Tiempo estado = null;
        estado = modeloTiempo.buscarTiempo(idTiempo);
        return estado;
    }
}

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
import Modelo.modeloTiempo;
import java.util.List;

/**
 *
 * @author User
 */
public class controladorTiempo {

    public void guardaTiempo(int id, Ciudad idciudad, int tem_max, int tem_min, Estados estado, TiempoId tiempoid) {

        Tiempo tiempo = new Tiempo();
        tiempo.setIdTiempo(id);
        tiempo.setCiudad(idciudad);
        tiempo.setTempMax(tem_max);
        tiempo.setTempMin(tem_min);
        tiempo.setEstados(estado);
        tiempo.setId(tiempoid);
        modeloTiempo.guardaTiempo(tiempo);
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

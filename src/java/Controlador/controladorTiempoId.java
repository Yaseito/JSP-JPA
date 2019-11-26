/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entidades.TiempoId;
import Modelo.modeloTiempoId;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class controladorTiempoId {
    
    public void guardaTiempoId (int idciudad, Date fecha) {

        TiempoId tiempoid = new TiempoId();
        tiempoid.setFecha(fecha);
        tiempoid.setIdCiudad(idciudad);
        modeloTiempoId.guardaTiempoId(tiempoid);
    }

    public List<TiempoId> listaTiempoId() {
        List<TiempoId> listaTiempoId = null;

        listaTiempoId = modeloTiempoId.listarTiempoId();

        return listaTiempoId;
    }

    public TiempoId buscaTiempoId(int idTiempoId) {
        TiempoId estado = null;
        estado = modeloTiempoId.buscarTiempoId(idTiempoId);
        return estado;
    }
}

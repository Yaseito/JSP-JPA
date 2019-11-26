/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entidades.Estados;
import Modelo.modeloEstados;
import java.util.List;

/**
 *
 * @author User
 */
public class controladorEstados {

    public void guardaEstados(String id, String nombre) {

        Estados estado = new Estados();
        estado.setNombre(nombre);
        estado.setIdEstado(id);
        modeloEstados.guardaEstados(estado);
    }

    public List<Estados> listaEstados() {
        List<Estados> listaEstados = null;

        listaEstados = modeloEstados.listarEstados();

        return listaEstados;
    }

    public Estados buscaEstados(String idEstados) {
        Estados estado = null;
        estado = modeloEstados.buscarEstados(idEstados);
        return estado;
    }
}

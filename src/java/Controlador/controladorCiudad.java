/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entidades.Ciudad;
import Modelo.modeloCiudad;
import java.util.List;

/**
 *
 * @author User
 */
public class controladorCiudad {

    public void guardaCiudad(int id, String nombre) {

        Ciudad ciudad = new Ciudad();
        ciudad.setNombreCiudad(nombre);
        ciudad.setIdCiudad(id);
        modeloCiudad.guardaCiudad(ciudad);
    }

    public List<Ciudad> listaCiudad() {
        List<Ciudad> listaCiudad = null;

        listaCiudad = modeloCiudad.listarCiudad();

        return listaCiudad;
    }

    public Ciudad buscaCiudad(int idCiudad) {
        Ciudad ciudad = null;
        ciudad = modeloCiudad.buscarCiudad(idCiudad);
        return ciudad;
    }
}

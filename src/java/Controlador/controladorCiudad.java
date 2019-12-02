/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Entidades.Ciudad;
import Modelo.modeloCiudad;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class controladorCiudad {

    public boolean guardaCiudad(int id, String nombre) {
        boolean band = false;
        if(id > 0){
        Ciudad ciudad = new Ciudad();
        ciudad.setNombreCiudad(nombre);
        ciudad.setIdCiudad(id);
        modeloCiudad.guardaCiudad(ciudad);
            band=true;
        }else{
            JOptionPane.showMessageDialog(null, "Error en guardar");
        };
        return band;
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

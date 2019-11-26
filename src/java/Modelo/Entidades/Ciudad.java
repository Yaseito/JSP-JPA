package Modelo.Entidades;
// Generated 25/11/2019 10:24:28 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ciudad generated by hbm2java
 */
public class Ciudad  implements java.io.Serializable {


     private int idCiudad;
     private String nombreCiudad;
     private Set tiempos = new HashSet(0);

    public Ciudad() {
    }

	
    public Ciudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public Ciudad(int idCiudad, String nombreCiudad, Set tiempos) {
       this.idCiudad = idCiudad;
       this.nombreCiudad = nombreCiudad;
       this.tiempos = tiempos;
    }
   
    public int getIdCiudad() {
        return this.idCiudad;
    }
    
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public String getNombreCiudad() {
        return this.nombreCiudad;
    }
    
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public Set getTiempos() {
        return this.tiempos;
    }
    
    public void setTiempos(Set tiempos) {
        this.tiempos = tiempos;
    }




}


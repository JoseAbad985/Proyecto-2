/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha_controlador;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_vista.VistaDisco;
import ec.edu.ups.practica02.abadjose.suquilandasamantha_modelo.Disco;
import java.util.List;

/**
 *
 * @author josea
 */
public class ControladorDisco {
    //objetos vist
    private VistaDisco vistaDisco;
    //objetos modelo
    private Disco disco;


    public ControladorDisco(VistaDisco vistaDisco, Disco disco) {
        this.vistaDisco = vistaDisco;
        this.disco = disco;
    }

    

    //llama al DAO para guardar un disco
    public void registrar() {
        disco = vistaDisco.ingresarDisco();
        
    }

    //llama al DAO para obtener un disco por el id y luego los muestra en la vista
    public void verDisco() {
        int id = vistaDisco.buscarDisco();
        vistaDisco.verDisco(disco);
    }

    //llama al DAO para actualizar un disco
    public void actualizar() {
        disco = vistaDisco.actualizarDisco();
    }

    //llama al DAO para eliminar un cantante
    public void eliminar() {
        disco = vistaDisco.eliminarDisco();
    }


}

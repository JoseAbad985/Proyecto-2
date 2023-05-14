/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.IDiscoDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaDisco;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Disco;
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
    //objetos DAO
    private IDiscoDAO discoDAO;

    public ControladorDisco(VistaDisco vistaDisco, Disco disco, IDiscoDAO discoDAO) {
        this.vistaDisco = vistaDisco;
        this.disco = disco;
        this.discoDAO = discoDAO;
    }

    

    //llama al DAO para guardar un disco
    public void registrar() {
        disco = vistaDisco.ingresarDisco();
        discoDAO.create(disco);
    }

    //llama al DAO para obtener un disco por el id y luego los muestra en la vista
    public void verCantante() {
        int id = vistaDisco.buscarDisco();
        disco = discoDAO.read(id);
        vistaDisco.verDisco(disco);
    }

    //llama al DAO para actualizar un disco
    public void actualizar() {
        disco = vistaDisco.actualizarDisco();
        discoDAO.update(disco);
    }

    //llama al DAO para eliminar un cantante
    public void eliminar() {
        disco = vistaDisco.eliminarDisco();
        discoDAO.delete(disco);
    }

    //llama al DAO para obtener todos los cantantes y luego los muestra en la vista
    public void verDiscos() {
        List<Disco> discos;
        discos = discoDAO.findAll();
        vistaDisco.verDiscos(discos);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.ICancionDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.IDiscoDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaDisco;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Disco;
import java.util.List;

/**
 *
 * @author josea
 */
public class ControladorCancion {
    //objetos vist
    private VistaCancion vistaCancion;
    //objetos modelo
    private Cancion cancion;
    //objetos DAO
    private ICancionDAO cancionDAO;

    public ControladorCancion(VistaCancion vistaCancion, Cancion cancion, ICancionDAO cancionDAO) {
        this.vistaCancion = vistaCancion;
        this.cancion = cancion;
        this.cancionDAO = cancionDAO;
    }

    public ControladorCancion(VistaCancion vistaCancion, ICancionDAO cancionDAO) {
        this.vistaCancion = vistaCancion;
        this.cancionDAO = cancionDAO;
    }
    
    //llama al DAO para guardar una canción
    public void registrar() {
        cancion = vistaCancion.ingresarCancion();
        cancionDAO.create(cancion);
    }

    //llama al DAO para obtener una cancion por el codigo y luego los muestra en la vista
    public void verCantante() {
        int id = vistaCancion.buscarCancion();
        cancion = cancionDAO.read(id);
        vistaCancion.verCancion(cancion);
    }

    //llama al DAO para actualizar una canción
    public void actualizar() {
        cancion = vistaCancion.actualizarCancion();
        cancionDAO.update(cancion);
    }

    //llama al DAO para eliminar una canción
    public void eliminar() {
        cancion = vistaCancion.eliminarCancion();
        cancionDAO.delete(cancion);
    }

    //llama al DAO para obtener todos los cantantes y luego los muestra en la vista
    public void verCanciones() {
        List<Cancion> canciones;
        canciones = cancionDAO.findAll();
        vistaCancion.verCanciones(canciones);
    }

}
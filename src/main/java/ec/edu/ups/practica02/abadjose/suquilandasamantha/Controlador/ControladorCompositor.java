/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.ICancionDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.ICompositorDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCompositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Compositor;
import java.util.List;

/**
 *
 * @author josea
 */
public class ControladorCompositor {
//objetos vist
    private VistaCompositor vistaCompositor;
    private VistaCancion vistaCancion;
    //objetos modelo
    private Compositor compositor;
    private Cancion cancion;
    //objetos DAO
    private ICompositorDAO compositorDAO;
    private ICancionDAO cancionDAO;

    public ControladorCompositor(VistaCompositor vistaCompositor, VistaCancion vistaCancion, Compositor compositor, Cancion cancion, ICompositorDAO compositorDAO, ICancionDAO cancionDAO) {
        this.vistaCompositor = vistaCompositor;
        this.vistaCancion = vistaCancion;
        this.compositor = compositor;
        this.cancion = cancion;
        this.compositorDAO = compositorDAO;
        this.cancionDAO = cancionDAO;
    }

    public ControladorCompositor(VistaCompositor vistaCompositor, VistaCancion vistaCancion, ICompositorDAO compositorDAO, ICancionDAO cancionDAO) {
        this.vistaCompositor = vistaCompositor;
        this.vistaCancion = vistaCancion;
        this.compositorDAO = compositorDAO;
        this.cancionDAO = cancionDAO;
    }
    

    //llama al DAO para guardar un compositor
    public void registrar() {
        compositor = vistaCompositor.ingresarCompositor();
        compositorDAO.create(compositor);
    }

    //llama al DAO para obtener un compositor por el id y luego los muestra en la vista
    public void verCompositor() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        vistaCompositor.verCompositor(compositor);
    }

    //llama al DAO para actualizar un compositor
    public void actualizar() {
        compositor = vistaCompositor.actualizarCompositor();
        compositorDAO.update(compositor);
    }

    //llama al DAO para eliminar un cantante
    public void eliminar() {
        compositor = vistaCompositor.eliminarCompositor();
        compositorDAO.delete(compositor);
    }

    //llama al DAO para obtener todos los cantantes y luego los muestra en la vista
    public void verCantantes() {
        List<Compositor> compositores;
        compositores = compositorDAO.findAll();
        vistaCompositor.verCompositores(compositores);
    }

    //ejemplo de agregacion
    public void agregarCancion() {
        int id = vistaCancion.buscarCancion();
        cancion = cancionDAO.read(id);
        compositor.agregarCancion(cancion);
        cancionDAO.update(cancion);
    }

}

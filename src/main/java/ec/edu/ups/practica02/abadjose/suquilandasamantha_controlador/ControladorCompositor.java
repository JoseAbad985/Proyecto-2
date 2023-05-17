/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha_controlador;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_IDAO.ICantanteDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_IDAO.ICompositorDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_vista.VistaCancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_vista.VistaCantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_vista.VistaCompositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha_modelo.Cancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha_modelo.Cantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha_modelo.Compositor;
import java.util.List;

/**
 *
 * @author josea
 */
public class ControladorCompositor {
//objetos vist
    private VistaCompositor vistaCompositor;
    private VistaCancion vistaCancion;
    private VistaCantante vistaCantante;
    //objetos modelo
    private Compositor compositor;
    private Cancion cancion;
    private Cantante cantante;
    //objetos DAO
    private ICompositorDAO compositorDAO;
    private ICantanteDAO cantanteDAO;

    public ControladorCompositor(VistaCompositor vistaCompositor, VistaCancion vistaCancion, VistaCantante vistaCantante, Compositor compositor, Cancion cancion, Cantante cantante, ICompositorDAO compositorDAO, ICantanteDAO cantanteDAO) {
        this.vistaCompositor = vistaCompositor;
        this.vistaCancion = vistaCancion;
        this.vistaCantante = vistaCantante;
        this.compositor = compositor;
        this.cancion = cancion;
        this.cantante = cantante;
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }

    public ControladorCompositor(VistaCompositor vistaCompositor, VistaCancion vistaCancion, VistaCantante vistaCantante, ICompositorDAO compositorDAO, ICantanteDAO cantanteDAO) {
        this.vistaCompositor = vistaCompositor;
        this.vistaCancion = vistaCancion;
        this.vistaCantante = vistaCantante;
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }
    
    
    public void verCompositorxCancion(){
        String nombre = vistaCancion.buscarCancionNombre();
        List<Compositor> compositores = compositorDAO.findAll();
        for(Compositor compositor : compositores){
            List<Cancion> canciones = compositor.getCancionesTop100Billboard();
            for(Cancion cancion : canciones){
                if(cancion.getTitulo().equals(nombre));
                Compositor compositorF = compositor;
                vistaCompositor.verCompositor(compositorF);
            }
        }
    }
    //llama al DAO para guardar un compositor
    public void registrar() {
        compositor = vistaCompositor.ingresarCompositor();
        cancion = vistaCancion.ingresarCancion();
        compositor.agregarCancion(cancion);
        compositorDAO.create(compositor);
    }
    
    public void registrarCliente(){
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        System.out.println("Compositor seleccionado: " + compositor);
        int id2 = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id2);
        System.out.println("Cantante seleccionado: " + cantante);
        compositor.agregarCliente(cantante);
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
    public void verCompositores() {
        List<Compositor> compositores;
        compositores = compositorDAO.findAll();
        vistaCompositor.verCompositores(compositores);
    }

    //ejemplo de agregacion
    public void agregarCancion() {
        int id = vistaCancion.buscarCancion();
        compositor.agregarCancion(cancion);
    }

}

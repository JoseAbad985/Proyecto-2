/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.ICantanteDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaDisco;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Compositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Disco;
import java.util.List;

/**
 *
 * @author josea
 */
public class ControladorCantante {

    //objetos vist
    private VistaCantante vistaCantante;
    private VistaDisco vistaDisco;
    //objetos modelo
    private Cantante cantante;
    private Disco disco;
    //objetos DAO
    private ICantanteDAO cantanteDAO;


    public ControladorCantante(VistaCantante vistaCantante, VistaDisco vistaDisco, Cantante cantante, Disco disco, ICantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.vistaDisco = vistaDisco;
        this.cantante = cantante;
        this.disco = disco;
        this.cantanteDAO = cantanteDAO;
    }

    public ControladorCantante(VistaCantante vistaCantante, VistaDisco vistaDisco, ICantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.vistaDisco = vistaDisco;
        this.cantanteDAO = cantanteDAO;
    }
    

    //llama al DAO para guardar un cantante
    public void registrar() {
        cantante = vistaCantante.ingresarCantante();
        //ejemplo de agregación
        disco = vistaDisco.ingresarDisco();
        System.out.println("Se ingresará un Disco para el Cantante");
        cantante.agregarDisco(disco);
        cantanteDAO.create(cantante);
    }
    //llama al DAO para obtener un cantante por el id y luego los muestra en la vista
    public void verCantante() {
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        vistaCantante.verCantante(cantante);
    }
    public void verCantantexDisco(){
        String nombre = vistaDisco.buscarDiscoNombre();
        List<Cantante> cantantes = cantanteDAO.findAll();   
        for (Cantante cantante : cantantes){
            List<Disco> discos = cantante.getDiscografia();
            for (Disco disco : discos){
                if(disco.getNombre().equals(nombre));
                Cantante cantanteF = cantante;
                vistaCantante.verCantante(cantanteF);
            }
        }
    }
            
   
    

    //llama al DAO para actualizar un cantante
    public void actualizar() {
        cantante = vistaCantante.actualizarCantante();
        cantanteDAO.update(cantante);
    }

    //llama al DAO para eliminar un cantante
    public void eliminar() {
        cantante = vistaCantante.eliminarCantante();
        cantanteDAO.delete(cantante);
    }

    //llama al DAO para obtener todos los cantantes y luego los muestra en la vista
    public void verCantantes() {
        List<Cantante> cantantes;
        cantantes = cantanteDAO.findAll();
        vistaCantante.verCantantes(cantantes);
    }
    
}

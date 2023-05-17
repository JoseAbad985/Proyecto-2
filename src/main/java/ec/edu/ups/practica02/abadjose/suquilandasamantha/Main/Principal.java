/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Main;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO.CantanteDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO.CompositorDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCompositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaDisco;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador.ControladorCantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador.ControladorCompositor;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
      Generamos un menu que permita al usario observar las opciones 
      que tiene e ingrese lo que desea realizar
         */
        int opcion = 0;
        VistaCantante vistaCantante = new VistaCantante();
        VistaCompositor vistaComp = new VistaCompositor();
        VistaCancion vistaCancion = new VistaCancion();
        VistaDisco vistaDisco = new VistaDisco();
        //DAOs//
        CantanteDAO cantanteDAO = new CantanteDAO();
        CompositorDAO compositorDAO = new CompositorDAO();
        //Controladores//
        ControladorCantante controladorCantante = new ControladorCantante(vistaCantante, vistaDisco, cantanteDAO);
        ControladorCompositor controladorCompositor = new ControladorCompositor(vistaComp, vistaCancion, vistaCantante, compositorDAO, cantanteDAO);
        do {
            System.out.println("""                              
                                Menu de Opciones 
                               1. Ingreso de Cantante 
                               2. Ingreso de Compositor 
                               3. Agregar Clientes 
                               4. Imprimir persona 
                               5. Busqueda de cantante por nombre de disco 
                               6. Busqueda de compositor por nombre de canción 
                               7. Salir""");
            opcion = teclado.nextInt();
            //Vista//

            switch (opcion) {
                case 1:
                    //Se registra un Cantante
                    controladorCantante.registrar();
                    break;

                case 2:
                    //Se registra un Compositor
                    controladorCompositor.registrar();
                    break;

                case 3:
                    //Se regustra un Cliente
                    controladorCompositor.registrarCliente();
                    break;
                case 4:
                    //Imprimimos la lista de Cantantes y Clientes
                    controladorCantante.verCantantes();
                    controladorCompositor.verCompositores();
                    break;
                case 5:
                    //Buscamos un cantante por el nombre del Disco
                    controladorCantante.verCantantexDisco();
                    break;
                case 6:
                    //Buscamos un compositor por el nombre de la Cancion
                    controladorCompositor.verCompositorxCancion();
                    break;
                case 7:
                    //Cerramos el codigo
                    System.out.println("Gracias :D ");
                    break;
                default:
                    System.out.println("La opcion ingresda no es valida");
                    break;

            }
    
        } while (opcion != 7);
    }

}

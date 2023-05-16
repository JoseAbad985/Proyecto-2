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
            VistaCantante vistaCantante = new VistaCantante();
            VistaCompositor vistaComp = new VistaCompositor();
            VistaCancion vistaCancion = new VistaCancion();
            VistaDisco vistaDisco = new VistaDisco();
            //DAOs//
            CantanteDAO cantanteDAO = new CantanteDAO();
            CompositorDAO compositorDAO = new CompositorDAO();
            //Controladores//
            ControladorCantante controladorCantante = new ControladorCantante(vistaCantante, vistaDisco, cantanteDAO);
            ControladorCompositor controladorCompositor = new ControladorCompositor(vistaComp, vistaCancion,compositorDAO);
            switch (opcion) {
                case 1:
                    controladorCantante.registrar();
                    
                    //Se llama al metodo calcular salario 
                case 2:
                    controladorCompositor.registrar();
                    //Se llama al metodo calcular salario
                case 3:
                    controladorCompositor.registrarCliente();
                case 4:
                    controladorCantante.verCantantes();
                    controladorCompositor.verCompositor();
                case 5:
                    controladorCantante.verCantantexDisco();
                case 6:
                    controladorCompositor.verCompositorxCancion();
                case 7:
                    System.out.println("Gracias :D ");
                default:
                    System.out.println("La opcion ingresda no es valida");

            }
            //En el caso 1 del menu se ingresa todos los atributos que le pertenecen, por medio del usuario
            //En el caso 2 del menu se ingresa los datos del compositor, depensiendo de sus atributos, ademas de sus canciones
            //
        } while (opcion != 7);
    }

}

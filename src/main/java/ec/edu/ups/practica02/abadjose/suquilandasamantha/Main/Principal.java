/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Main;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO.CancionDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO.CantanteDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO.CompositorDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO.DiscoDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaCompositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista.VistaDisco;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador.ControladorCancion;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador.ControladorCantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador.ControladorCompositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Persona;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Compositor;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador.ControladorPersona;
import java.util.Scanner;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Controlador.IPersonaDAO;

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
            CancionDAO cancionDAO = new CancionDAO();
            DiscoDAO discoDAO = new DiscoDAO();
            //Controladores//
            ControladorCantante controladorCantante = new ControladorCantante(vistaCantante, vistaDisco, cantanteDAO, discoDAO);
            ControladorCompositor controladorCompositor = new ControladorCompositor(vistaComp, vistaCancion, compositorDAO, cancionDAO);
            ControladorCancion controladorCancion = new ControladorCancion(vistaCancion, cancionDAO);
            
            switch (opcion) {
                case 1:
                    controladorCantante.registrar();
                    
                    //Se llama al metodo calcular salario 
                    Cantante.calcularSalario();
                case 2:
                    controladorCompositor.registrar();
                    Compositor.calcularSalario();
                case 3:
                    teclado.nextLine();//posible salto de de nextInt
                    System.out.println("Ingrese el codigo del cantante(cliente): ");
                    int codigo = teclado.nextInt();
                    Cantante cantanteCasting = (Cantante) controladorPersonaCast.buscarPorCodigoCantante(codigo);
                    System.out.println("Ingrese el codigo del compositor: ");
                    int codigo = teclado.nextInt();
                    Compositor compositorCast = (Compositor) controladorPersonaCast.buscarPorCodigoCompositor(codigo);
                    if (compositorCast instanceof Persona && compositorCast instanceof Persona) {
                        compositorCast.agregarCliente(cantanteCasting);
                    }
                
                case 4:
                    controladorCantante.verCantantes();
                    controladorCompositor.verCompositor();
                case 5:
                    teclado.nextLine();
                    System.out.println("Por favor ingrese el nombre del disco que desea buscar: ");
                    String valor = teclado.nextLine();
                    controladorPersonaCast.buscarPorNombreDeDisco(valor);
                

                case 6 -> {
                    teclado.nextLine();
                    System.out.println("Ingrese el titulo de la cancion que desea buscar: ");
                    String titulo = teclado.nextLine();
                    controladorPersonaCast.buscarPorTituloDeCancion(titulo);
                }

                case 7 -> {
                }

                default ->
                    System.out.println("La opcion ingresda no es valida");

            }
            //En el caso 1 del menu se ingresa todos los atributos que le pertenecen, por medio del usuario
            //En el caso 2 del menu se ingresa los datos del compositor, depensiendo de sus atributos, ademas de sus canciones
            //
        } while (opcion != 7);
    }

}

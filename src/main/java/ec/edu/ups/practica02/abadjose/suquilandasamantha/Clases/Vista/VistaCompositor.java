/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Compositor;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCompositor {

    private Scanner teclado;

    public Compositor ingresarCompositor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del compositor: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del compositor: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la edad del compositor: ");
        int edad = teclado.nextInt();
        teclado.nextLine();//Un salto de nextInt
        System.out.println("Ingrese la nacionalidad del compositor: ");
        String nacionalidad = teclado.nextLine();
        System.out.println("Ingrese el salario del compositor: ");
        Double salario = teclado.nextDouble();
        System.out.println("Ingrese el codigo del compositor: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el numero de canciones del compositor; ");
        int numeroDeComposiciones = teclado.nextInt();
        return new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, salario, nacionalidad);
    }

    public Compositor actualizarCompositor() {
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();//Un salto de nextInt
        System.out.println("Ingrese el nuevo nombre del compositor: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el nuevo apellido del compositor: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la nueva edad del compositor: ");
        int edad = teclado.nextInt();
        teclado.nextLine();//Un salto de nextInt
        System.out.println("Ingrese la nueva nacionalidad del compositor: ");
        String nacionalidad = teclado.nextLine();
        System.out.println("Ingrese el nuevo salario del compositor: ");
        Double salario = teclado.nextDouble();
        System.out.println("Ingrese el nuevo codigo del compositor: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nuevo numero de canciones del compositor; ");
        int numeroDeComposiciones = teclado.nextInt();
        return new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, salario, nacionalidad);
    }

    public Compositor eliminarCompositor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del compositor a eliminar");
        int codigo = teclado.nextInt();
        return new Compositor(codigo);
    }

    public int buscarCompositor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del compositor al que se le asignará un Cliente: ");
        int id = teclado.nextInt();
        return id;
    }

    public void verCompositor(Compositor compositor) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Datos del Compositor: " + compositor);
    }

    public void verCompositores(List<Compositor> compositores) {
        Scanner teclado = new Scanner(System.in);
        for (Compositor compositor : compositores) {
            System.out.println("Datos del Compositor: " + compositor);
        }
    }

}

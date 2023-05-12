/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Persona;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCantante {
    
    private Scanner teclado;
    
    public Cantante ingresarCantante(){
        teclado.nextLine();
        System.out.println("Ingrese el nombre del cantante: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del cantante: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la edad del cantante: ");
        int edad = teclado.nextInt();
        teclado.nextLine();//Aqui hay un salto de nextInt
        System.out.println("Ingrese la nacionalidad del cantante: ");
        String nacionalidad = teclado.nextLine();
        System.out.println("Ingrese el salario del cantante: ");
        double salario = Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese el codigo del cantante: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();//Aqui hay un salto de nextInt
        System.out.println("Ingrese el nombre artistico del cantante: ");
        String nombreArtistico = teclado.nextLine();
        System.out.println("Ingrese el genero musical del cantante: ");
        String generoMusical = teclado.nextLine();
        System.out.println("Ingrese el numero de sencillos: ");
        int numeroDeSencillos = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el numero de conciertos del cantante: ");
        int numeroDeConciertos = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el numero de giras del cantante: ");
        int numeroDeGiras = teclado.nextInt();
        return new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
    }
    public Cantante actualizarCantante(){
        System.out.println("Ingresa el id del cliente a actualizar");
        int id = teclado.nextInt();
        System.out.println("Ingrese el nuevo nombre del cantante: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el nuevo apellido del cantante: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la nueva edad del cantante: ");
        int edad = teclado.nextInt();
        teclado.nextLine();//Aqui hay un salto de nextInt
        System.out.println("Ingrese la nueva nacionalidad del cantante: ");
        String nacionalidad = teclado.nextLine();
        System.out.println("Ingrese el nuevo salario del cantante: ");
        double salario = Double.parseDouble(teclado.nextLine());
        teclado.nextLine();//Aqui hay un salto de nextInt
        System.out.println("Ingrese el nuevo nombre artistico del cantante: ");
        String nombreArtistico = teclado.nextLine();
        System.out.println("Ingrese el nuevo genero musical del cantante: ");
        String generoMusical = teclado.nextLine();
        System.out.println("Ingrese el nuevo numero de sencillos: ");
        int numeroDeSencillos = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el nuevo numero de conciertos del cantante: ");
        int numeroDeConciertos = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el nuevo numero de giras del cantante: ");
        int numeroDeGiras = teclado.nextInt();
        return new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, edad, nombre, apellido, edad, nacionalidad, salario);
        }
    public Cantante eliminarCantante(){
        System.out.println("Ingresa el codigo del cantante a eliminar");
        int id = teclado.nextInt();
        return new Cantante(id);
    }
    public int buscarCantante(){
        System.out.println("Ingresa el id del cantante a buscar");
        int id = teclado.nextInt();
        return id;
    }
    public void verCantante(Cantante cantante) {
        System.out.println("Datos del Cantante: " + cantante);
    }
    public void verClientes(List<Cantante> cantantes) {
        for (Cantante cantante : cantantes) {
            System.out.println("Datos del Cantante: " + cantante);
        }
    }
        
    }
               


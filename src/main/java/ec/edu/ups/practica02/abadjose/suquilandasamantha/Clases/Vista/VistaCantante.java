/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cantante;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Persona;
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
        System.out.println("Ingrese los nuevos Datos (nombre, apellido, edad, nacionalidad, salario, nombre artistico, genero musical, numero de sencillos, numero de conciertos , numero de giras)");
        String nombre = teclado.next();
        String apellido = teclado.next();
        int edad = teclado.nextInt();
        String nacionalidad = teclado.next();
        double salario = teclado.nextDouble();
        String nombreArtistico = teclado.next();
        String generoMusical = teclado.next();
        int numeroDeSencillos = teclado.nextInt();
        int numeroDdeConciertos = teclado.nextInt();
        int numeroDeGiras = teclado.nextInt();
        return new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDdeConciertos, numeroDeGiras, edad, nombre, apellido, edad, nacionalidad, salario);
        }
    public Cantante eliminarCantante(){
        System.out.println("Ingresa el id del cliente a eliminar");
        int id = teclado.nextInt();
        return new Cantante(id);
    }
    
    }
               


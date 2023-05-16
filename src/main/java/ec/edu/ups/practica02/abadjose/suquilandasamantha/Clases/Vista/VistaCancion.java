/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.Vista;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cancion;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class VistaCancion {
    private Scanner teclado;
    
    public Cancion ingresarCancion(){
        teclado.nextLine();
        System.out.println("Ingrese el codigo de la cancion: ");
        int codigoCan = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el titulo de la cancion: ");
        String titulo = teclado.nextLine();
        System.out.println("Ingrese la letra de la cancion: ");
        String letra = teclado.nextLine();
        System.out.println("Ingrese el tiempo de duracion de la cancion: ");
        double tiempoEnMinutos = Double.parseDouble(teclado.nextLine());
        return new Cancion(codigoCan, titulo, letra, tiempoEnMinutos);
    }
    public Cancion actualizarCancion(){
        teclado.nextLine();
        System.out.println("Ingrese el codigo de la cancion: ");
        int codigoCan = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nuevo titulo de la cancion: ");
        String titulo = teclado.nextLine();
        System.out.println("Ingrese la nueva letra de la cancion: ");
        String letra = teclado.nextLine();
        System.out.println("Ingrese el nuevo tiempo de duracion de la cancion: ");
        double tiempoEnMinutos = Double.parseDouble(teclado.nextLine());
        return new Cancion(codigoCan, titulo, letra, tiempoEnMinutos);
    }  
        
    public Cancion eliminarCancion(){
        System.out.println("Ingresa el codigo de la canción a eliminar");
        int id = teclado.nextInt();
        return new Cancion(id);
    }
    public int buscarCancion(){
        System.out.println("Ingresa el codigo de la canción a buscar");
        int id = teclado.nextInt();
        return id;
    }
        public String buscarCancionNombre(){
        System.out.println("Ingresa el nombre de la canción a buscar");
        String nombre = teclado.next();
        return nombre;
    }
        
    public void verCancion(Cancion cancion) {
        System.out.println("Datos de la canción: " + cancion);
    }
    public void verCanciones(List<Cancion> canciones) {
        for (Cancion cancion : canciones) {
            System.out.println("Datos del Cantante: " + cancion);
        }
    }
        
    }

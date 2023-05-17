/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_vista;
import ec.edu.ups.practica02.abadjose.suquilandasamantha_modelo.Disco;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class VistaDisco {

    private Scanner teclado;
    

    public Disco ingresarDisco() {
        teclado = new Scanner(System.in);
        System.out.println("Se ingresará un Disco para el Cantante");
        System.out.println("Ingrese el codigo del disco: ");
        int codigoDisc = teclado.nextInt();
        System.out.println("Ingrese el año de lanzamiento:");
        int anioDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre del disco: ");
        String nombreCancion = teclado.nextLine();
        return new Disco(codigoDisc, nombreCancion, anioDeLanzamiento);
    }

    public Disco actualizarDisco() {
        teclado = new Scanner(System.in);
        teclado.nextLine();
        System.out.println("Ingrese el codigo del disco: ");
        int codigoDisc = teclado.nextInt();
        System.out.println("Ingrese el nuevo año de lanzamiento:");
        int anioDeLanzamiento = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nuevo nombre del disco: ");
        String nombreCancion = teclado.nextLine();
        return new Disco(codigoDisc, nombreCancion, anioDeLanzamiento);
    }

    public Disco eliminarDisco() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del disco a eliminar");
        int id = teclado.nextInt();
        return new Disco(id);
    }

    public int buscarDisco() {
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el codigo del disco a buscar");
        int id = teclado.nextInt();
        return id;
    }
    public String buscarDiscoNombre(){
        teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre del disco a buscar");
        String nombre = teclado.next();
        return nombre;
    }

    public void verDisco(Disco disco) {
        teclado = new Scanner(System.in);
        System.out.println("Datos del disco: " + disco);
    }

    public void verDiscos(List<Disco> discos) {
        teclado = new Scanner(System.in);
        for (Disco disco : discos) {
            System.out.println("Datos del Cantante: " + disco);
        }
    }

}

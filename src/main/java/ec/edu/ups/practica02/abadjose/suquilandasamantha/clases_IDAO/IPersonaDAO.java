/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_IDAO;

import ec.edu.ups.practica02.abadjose.suquilandasamantha_modelo.Persona;

/**
 *
 * @author ESTUDIANTE
 */
public interface IPersonaDAO {
    
    public final int MAX_OBJECTS =10;
    
    public abstract void create(Persona objec);//C
    public abstract Persona read(Persona objec);//R
    public abstract void update(Persona objec);//U
    public abstract void delete(Persona objec);//D
    
}

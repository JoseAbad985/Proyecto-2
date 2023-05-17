/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.clases_IDAO;

import ec.edu.ups.practica02.abadjose.suquilandasamantha_modelo.Cantante;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface ICantanteDAO {
    public void create(Cantante cantate);
    public Cantante read(int id);
    public void update(Cantante cantante);
    public void delete(Cantante cantante);   
    public List<Cantante> findAll();
}


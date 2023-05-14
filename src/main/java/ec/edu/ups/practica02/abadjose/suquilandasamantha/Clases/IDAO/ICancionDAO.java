/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cancion;
import java.util.List;

/**
 *
 * @author josea
 */
public interface ICancionDAO {
    public void create(Cancion cancion);
    public Cancion read(int id);
    public void update(Cancion cancion);
    public void delete(Cancion cancion);   
    public List<Cancion> findAll();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Disco;
import java.util.List;

/**
 *
 * @author josea
 */
public interface IDiscoDAO {
    public void create(Disco disco);
    public Disco read(int id);
    public void update(Disco disco);
    public void delete(Disco disco);   
    public List<Disco> findAll();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.ICancionDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Cancion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class CancionDAO implements ICancionDAO{
    
    private List<Cancion> listaCancion;
    
    public CancionDAO() {
        listaCancion = new ArrayList<>();
    }

    @Override
    public void create(Cancion cancion) {
        listaCancion.add(cancion);
    }

    @Override
    public Cancion read(int id) {
        for (Cancion cancion : listaCancion) {
            if (cancion.getCodigo() == id) {
                return cancion;
            }
        }
        return null;
    }

    @Override
    public void update(Cancion cancion) {
        for (int i = 0; i < listaCancion.size(); i++) {
            Cancion c = listaCancion.get(i);
            if (c.getCodigo() == cancion.getCodigo()) {
                listaCancion.set(i, cancion);
                break;
            }
        }

    }

    @Override
    public void delete(Cancion cancion) {
        Iterator<Cancion> it = listaCancion.iterator();
        while (it.hasNext()) {
            Cancion c = it.next();
            if (c.getCodigo() == cancion.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cancion> findAll() {
        return listaCancion;
    }


}


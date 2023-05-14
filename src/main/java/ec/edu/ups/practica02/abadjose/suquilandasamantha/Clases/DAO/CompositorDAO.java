/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.ICompositorDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Compositor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class CompositorDAO implements ICompositorDAO {
    private List<Compositor> listaCompositor;


    public CompositorDAO() {
        listaCompositor = new ArrayList<>();
    }

    @Override
    public void create(Compositor compositor) {
        listaCompositor.add(compositor);
    }

    @Override
    public Compositor read(int id) {
        for (Compositor compositor : listaCompositor) {
            if (compositor.getCodigo() == id) {
                return compositor;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {
        for (int i = 0; i < listaCompositor.size(); i++) {
            Compositor c = listaCompositor.get(i);
            if (c.getCodigo() == compositor.getCodigo()) {
                listaCompositor.set(i, compositor);
                break;
            }
        }

    }

    @Override
    public void delete(Compositor compositor) {
        Iterator<Compositor> it = listaCompositor.iterator();
        while (it.hasNext()) {
            Compositor c = it.next();
            if (c.getCodigo() == compositor.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Compositor> findAll() {
        return listaCompositor;
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.DAO;

import ec.edu.ups.practica02.abadjose.suquilandasamantha.Clases.IDAO.IDiscoDAO;
import ec.edu.ups.practica02.abadjose.suquilandasamantha.Modelo.Disco;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class DiscoDAO implements IDiscoDAO{
    
    private List<Disco> listaDisco;
    
    public DiscoDAO() {
        listaDisco = new ArrayList<>();
    }

    @Override
    public void create(Disco disco) {
        listaDisco.add(disco);
    }

    @Override
    public Disco read(int id) {
        for (Disco disco : listaDisco) {
            if (disco.getCodigo() == id) {
                return disco;
            }
        }
        return null;
    }
    
    @Override
    public void update(Disco disco) {
        for (int i = 0; i < listaDisco.size(); i++) {
            Disco d = listaDisco.get(i);
            if (d.getCodigo() == disco.getCodigo()) {
                listaDisco.set(i, disco);
                break;
            }
        }

    }

    @Override
    public void delete(Disco disco) {
        Iterator<Disco> it = listaDisco.iterator();
        while (it.hasNext()) {
            Disco d = it.next();
            if (d.getCodigo() == disco.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Disco> findAll() {
        return listaDisco;
    }


}


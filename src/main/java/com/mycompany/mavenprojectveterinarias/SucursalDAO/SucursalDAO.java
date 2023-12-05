
package com.mycompany.mavenprojectveterinarias.SucursalDAO;




import com.mycompany.mavenprojectveterinarias.Sucursal.Sucursal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class SucursalDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void guardarSucursal(Sucursal sucursal) {
        entityManager.persist(sucursal);
    }

    public Sucursal obtenerSucursalPorId(int idSucursal) {
        return entityManager.find(Sucursal.class, idSucursal);
    }

    public List<Sucursal> obtenerTodasLasSucursales() {
        return entityManager.createQuery("SELECT s FROM Sucursal s", Sucursal.class).getResultList();
    }

    @Transactional
    public void actualizarSucursal(Sucursal sucursal) {
        entityManager.merge(sucursal);
    }

    @Transactional
    public void eliminarSucursal(int idSucursal) {
        Sucursal sucursal = obtenerSucursalPorId(idSucursal);
        if (sucursal != null) {
            entityManager.remove(sucursal);
        }
    }
}

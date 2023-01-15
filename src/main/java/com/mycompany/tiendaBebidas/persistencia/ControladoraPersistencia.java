
package com.mycompany.tiendaBebidas.persistencia;

import com.mycompany.tiendaBebidas.logica.Producto;
import com.mycompany.tiendaBebidas.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ControladoraPersistencia {
    
    ProductoJpaController jpaProd = new ProductoJpaController();
    
    // Método Guardar Productos - Clase 'Carga'
    public void guardar(Producto prod) {
        jpaProd.create(prod);
    }
    
    // Metodo Traer Productos - Clase 'Ver'
    public List<Producto> traerProductos() {
        return jpaProd.findProductoEntities();
    }
    
    // Metodo Borrar Producto - Clase 'Ver'
    public void borrarProducto(int id_producto) {
        try {
            jpaProd.destroy(id_producto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto traerProducto(int id_producto) {
        return jpaProd.findProducto(id_producto);
    }

    public void editarProducto(Producto prod) {
        try {
            jpaProd.edit(prod);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
}


package com.mycompany.tiendaBebidas.logica;

import com.mycompany.tiendaBebidas.persistencia.ControladoraPersistencia;
import java.util.List;




public class ControladoraLogica {
    
    ControladoraPersistencia controlPer = new ControladoraPersistencia();
    
    // Método Guardar Productos - Clase 'Carga'
    public void guardar(String nombre, String marca, String presentacion, String precio) {
        
        Producto prod = new Producto();
        prod.setNombre(nombre);
        prod.setMarca(marca);
        prod.setPresentacion(presentacion);
        prod.setPrecio(precio);
        
        controlPer.guardar(prod);
    }
    
    // Metodo Traer Productos - Clase 'Ver'
    public List<Producto> traerProductos() {
        return controlPer.traerProductos();
    }
    
    // Metodo Borrar Producto - Clase 'Ver'
    public void borrarProducto(int id_producto) {
        controlPer.borrarProducto (id_producto);
    }

    public Producto traerProducto(int id_producto) {
       return controlPer.traerProducto(id_producto);
    }

    public void editar(Producto prod, String nombre, String marca, String presentacion, String precio) {
        
        prod.setNombre(nombre);
        prod.setMarca(marca);
        prod.setPresentacion(presentacion);
        prod.setPrecio(precio);
        
        controlPer.editarProducto(prod);
    }
    
    
    
}

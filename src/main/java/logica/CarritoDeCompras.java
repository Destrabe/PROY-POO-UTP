package logica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CarritoDeCompras {
    
    private Map<String, Integer> productos = new HashMap<>();
    private Map<String, Double> precios = new HashMap<>();
    
    public void agregarProducto(String nombre, double precio, int cantidad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Producto invalido: nombre vacio o nulo");
            return;
        }
        if (precio <= 0.0) {
            System.out.println("Producto invalido: precio incorrecto");
            return;
        }
        productos.put(nombre, productos.getOrDefault(nombre, 0) + cantidad);
        precios.put(nombre, precio);
    }
    
    public void limpiarCarrito() {
        productos.clear();
        precios.clear();
    }
    
    public int getCantidad(String nombreProducto) {
        return productos.getOrDefault(nombreProducto, 0);
    }
    
    public double getPrecio(String nombre) {
        return precios.getOrDefault(nombre, 0.0);
    }
    
    public Map<String, Integer> getProductos() {
        return productos;
    }
    
    public List<Compra> generarComprasSimuladas() {
        List<Compra> compras = new ArrayList<>();
        
        for (String nombre : productos.keySet()) {
            int cantidad = productos.get(nombre);
            double precio = precios.getOrDefault(nombre, 0.0);
            
            Compra c = new Compra();
            c.setNombreproducto(nombre);
            c.setCantidad(cantidad);
            c.setPrecioproducto(precio);
            compras.add(c);
            
        }
        return compras;
    }
    
    public void limpiarProductosInvalidos() {
        Iterator<String> it = productos.keySet().iterator();
        while (it.hasNext()) {
            String nombre = it.next();
            int cantidad = getCantidad(nombre);
            double precio = getPrecio(nombre);
            
            if (nombre == null || nombre.trim().isEmpty() || cantidad <= 0 || precio <= 0.0) {
                it.remove();
                precios.remove(nombre);
            }
        }
    }
    
}

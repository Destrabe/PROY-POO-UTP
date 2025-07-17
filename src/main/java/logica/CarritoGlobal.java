
package logica;

//Singleton
public class CarritoGlobal {
    private static final CarritoDeCompras carrito = new CarritoDeCompras();

    public static CarritoDeCompras getCarrito() {
        return carrito;
    }
}

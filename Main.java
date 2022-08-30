
package sobrecarga;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        

    Producto p = new Producto("Caja de leche", 12);

    Carretilla b = new Carretilla();

    b.agregarProducto(p);
    
    b.agregarProducto("Caja de leche", 15);
   

    List<Producto> productos= new ArrayList<Producto>();

    productos.add(new Producto("Libra de café",50));

    productos.add(new Producto("Pan de banano",70));

    productos.add(new Producto("Galletas de chocolate",10));

    b.agregarProducto(productos);

    b.agregarProducto(new Producto("Galletas de chocolate",15));

    b.agregarProducto(new Producto("galleda de  Vainilla",7));
     }

        }
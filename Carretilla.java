package sobrecarga;


import java.util.ArrayList;
import java.util.List;


ublic class Carretilla {
	private List<Producto> lista = new ArrayList<Producto>();
	

	public Carretilla() {
	    super();
            
	}
	
        public Carretilla(List<Producto> lista){
            super();
            this.lista= lista;     
        }

	public void agregarProducto(Producto p) {
		lista.add(p);
	}
        public void agregarProducto (String nombre , double precio ){
             
                lista.add(new Producto(nombre,precio));
         }
        
        public void agregarProducto (List<Producto> producto){            
            lista.addAll(producto);  
         }
        
        public void agregarProducto(Producto... productos) {
        
         for (Producto f : productos) {
         lista.add(f);
         }
        }

    
    
}

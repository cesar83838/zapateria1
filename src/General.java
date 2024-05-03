public class General {
    public int talla(){
        return(5);

}
    public int codigo(){
        return(000);
        
    }
    public int cantidad(){
        return(10);

    }
    public String marca(){
        return("marca");

}
    public String Color(){
        return("Color del zapato");
        
    }
    public String ubicacion(){
        return("Estante y pasillo de almacen");

    }

    public void agregarCantidad(int cantidad) {
    
}
public class Inventario {
    private int cantidad;

    public Inventario() {
        this.cantidad = 0;
    }

    public int cantidad() {
        return this.cantidad;
    }

    public void agregarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }
}


   
    
}



package ejercicio;

public class Prenda {
    protected double precioDeLista;


    public Prenda(double precioDeLista){
        this.precioDeLista = precioDeLista;
    }

    public double calcularPrecio(){
        double precio = getPrecioDeLista();
        return precio * 1.10;
    }
    public double calcularPrecio(Tarjeta tarjeta){
        double precio = getPrecioDeLista();
        precio *= 1.10;
        precio = tarjeta.aplicarDescuento(precio);
        return precio;
    }
    public double getPrecioDeLista(){
        return  precioDeLista;

    }


}

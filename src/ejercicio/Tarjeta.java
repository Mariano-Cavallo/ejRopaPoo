package ejercicio;

public class Tarjeta {
    protected int idTarjeta;

    public Tarjeta(int idTarjeta){
        this.idTarjeta = idTarjeta;
    }



    public double aplicarDescuento(double monto){
        return monto * 0.99;
    }
}

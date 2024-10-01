package ejercicio;

public class TarjetaDorada extends Tarjeta{


    public TarjetaDorada(int idTarjeta) {
        super(idTarjeta);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return(monto * 0.985) - 100;
    }
}

package ejercicio;

public class Sweater extends Prenda{

    public Sweater(double precioDeLista) {
        super(precioDeLista);
    }

    @Override
    public double calcularPrecio() {
        double precio = getPrecioDeLista();

        return precio * 1.08;
    }
}

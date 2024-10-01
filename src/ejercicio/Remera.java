package ejercicio;

public class Remera extends Prenda{




    public Remera(double precioDeLista){
        super(precioDeLista);
    }


    @Override
    public double getPrecioDeLista() {
        return super.getPrecioDeLista() + 100 ;
    }
}

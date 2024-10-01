package ejercicio;

public class Camisa extends Prenda {
    private boolean mangaLarga;


    public Camisa(double precioDeLista,boolean esMangaLarga) {
        super(precioDeLista);
        mangaLarga = esMangaLarga;

    }

    @Override
    public double calcularPrecio() {
        double precio;
        if(mangaLarga){
            precio = super.calcularPrecio() * 1.05;

        }else{
            precio = super.calcularPrecio();
        }
        return precio ;
    }
}

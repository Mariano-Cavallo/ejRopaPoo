package ejercicio;

public class Main {
    public static void main(String[] args) {

        Prenda remera1 = new Remera(200);
        Prenda Camisa1 = new Camisa(300,true);
        Prenda Camisa2 = new Camisa(300,false);
        Prenda Sweater = new Sweater(500);
        Tarjeta tarjeta1 = new Tarjeta(1);
        Tarjeta tarjeta2 = new TarjetaDorada(2);

        System.out.print(remera1.calcularPrecio());
        System.out.print("\n");
        System.out.print(remera1.calcularPrecio(tarjeta1));
        System.out.print("\n");
        System.out.print(remera1.calcularPrecio(tarjeta2));
        System.out.print("\n");
        System.out.print(Camisa1.calcularPrecio());
        System.out.print("\n");
        System.out.print(Camisa1.calcularPrecio(tarjeta2));
        System.out.print("\n");
        System.out.print(Camisa2.calcularPrecio());
        System.out.print("\n");
        System.out.print(Sweater.calcularPrecio());
        System.out.print("\n");
        System.out.print(Sweater.calcularPrecio(tarjeta2));




    }
}

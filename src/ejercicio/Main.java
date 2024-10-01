package ejercicio;

public class Main {
    public static void main(String[] args) {

        Prenda remera1 = new Remera(200);
        Prenda Camisa1 = new Camisa(300,true);
        Prenda Camisa2 = new Camisa(300,false);
        Prenda Sweater = new Sweater(500);

        System.out.print(remera1.calcularPrecio());
        System.out.print("\n");
        System.out.print(Camisa1.calcularPrecio());
        System.out.print("\n");
        System.out.print(Camisa2.calcularPrecio());
        System.out.print("\n");
        System.out.print(Sweater.calcularPrecio());
        System.out.print("\n");




    }
}

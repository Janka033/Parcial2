package ejemplo1;

public class Main {
    public static void main(String[] args) {
        ServicioPeluqueria producto = ServicioPeluqueria.FADEHAIRCUT;
        System.out.println("The name of the cut is " + producto.getNombre() + " and its description is " + producto.getDescripcion() + " and its cost is "+ producto.getCost());
        ServicioPeluqueria producto1 = ServicioPeluqueria.NAILS;
        System.out.println("The name of the nails is " + producto1.getNombre() + " and its description is " + producto1.getDescripcion() + " and its cost is "+ producto.getCost());
        ServicioPeluqueria producto2 = ServicioPeluqueria.DYE;
        System.out.println("The name of the dye is " + producto2.getNombre() + " and its description is " + producto2.getDescripcion() + " and its cost is "+ producto.getCost());
    }
}

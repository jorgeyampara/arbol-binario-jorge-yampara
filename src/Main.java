import abb.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();


        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);

        //mostramos los elementos del arbol inorden
        System.out.println("mostrar in order");
        abb.mostrarInOrden();
        System.out.println("mostrar pre order");
        abb.mostrarpreOrder();
        System.out.println("mostrar post order");
        abb.mostrarpostOrder();

    }
}

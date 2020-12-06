package abb;

public class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
       raiz = null;
    }
    
    //arbol esta vacio
    public  boolean estaVcio(){
        return raiz == null;
        
    }
    
    //metodo recursivo para insertar un nodo al arbol binario de busqueda
    
    private void insertar(Nodo padre, Nodo hijo,int dato){
        if (hijo == null) {
            Nodo nuevo= new Nodo(null, dato,null);
            if (dato >= padre.getDato()){
                padre.setDerecho(nuevo);
            }else {
                padre.setIzquierdo(nuevo);
            }
        }
        else {
            if (dato >= padre.getDato()){
                insertar(hijo,hijo.getDerecho(),dato);
            }else {
                insertar(hijo, hijo.getIzquierdo(),dato);
            }
        }
        
        
    }
    //metodo auxiliar para insertar un nuevo noso
    public void insertar(int dato){

        if (estaVcio()){
            Nodo nuevo = new Nodo(null,dato,null);
            raiz= nuevo;
        }else {
            if (dato>= raiz.getDato()){
                insertar(raiz,raiz.getDerecho(),dato);
            }else {
                insertar(raiz,raiz.getIzquierdo(),dato);
            }
        }
    }

    // metodo recursivo para mostrar el arbol inOrden

    private void mostrarInOrden(Nodo nodo){
        if (nodo==null){

        }else {
           mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato()+ "  ");
            mostrarInOrden(nodo.getDerecho());


        }



    }

    // metodo auxiliar para recorrer o mostrar el arbol inorden

    public void mostrarInOrden(){
        Nodo temporal = raiz;
        mostrarInOrden(raiz);
        System.out.println();


    }

    private void mostrarpreOrder(Nodo nodo){
        if (nodo==null){

        }else {

            System.out.print(nodo.getDato()+ "  ");
            mostrarpreOrder(nodo.getIzquierdo());
            mostrarpreOrder(nodo.getDerecho());


        }
    }
    public void mostrarpreOrder(){
        Nodo temporal = raiz;
        mostrarpreOrder(raiz);
        System.out.println();


    }
    private void mostrarpostOrder(Nodo nodo){
        if (nodo==null){

        }else {


            mostrarpostOrder(nodo.getIzquierdo());
            mostrarpostOrder(nodo.getDerecho());
            System.out.print(nodo.getDato()+ "  ");


        }
    }
    public void mostrarpostOrder(){
        Nodo temporal = raiz;
        mostrarpostOrder(raiz);
        System.out.println();


    }


}

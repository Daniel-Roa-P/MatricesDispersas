
package matrizdispersa;

public class NodoColumna {
    
    private int indiceColumna;
    private int cantidadFilas;
    private NodoColumna siguiente;
    private ListaFilas filas;
    
    NodoColumna(int indice){
        
        this.indiceColumna = indice;
        this.siguiente = null;
        this.filas = new ListaFilas();
   
    }

    public int getIndiceColumna() {
        return indiceColumna;
    }

    public void setIndiceColumna(int indiceColumna) {
        this.indiceColumna = indiceColumna;
    }

    public NodoColumna getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColumna siguiente) {
        this.siguiente = siguiente;
    }

    public ListaFilas getFilas() {
        return filas;
    }

    public void setFilas(ListaFilas filas) {
        this.filas = filas;
    }

    public int getCantidadFilas() {
        return cantidadFilas;
    }

    public void setCantidadFilas(int cantidadFilas) {
        this.cantidadFilas = cantidadFilas;
    }
    
}

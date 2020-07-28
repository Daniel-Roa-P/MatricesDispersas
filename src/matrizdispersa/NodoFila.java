
package matrizdispersa;

public class NodoFila {
    
    private int indiceFila;
    private double valor;
    private NodoFila abajo;
    
    NodoFila( int fila, double valor ){
        
        this.indiceFila = fila;
        this.valor = valor;
        this.abajo = null;
        
    }

    public int getIndiceFila() {
        return indiceFila;
    }

    public void setIndiceFila(int indiceFila) {
        this.indiceFila = indiceFila;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public NodoFila getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoFila abajo) {
        this.abajo = abajo;
    }
  
}

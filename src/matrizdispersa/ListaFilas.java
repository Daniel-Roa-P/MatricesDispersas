
package matrizdispersa;

public class ListaFilas {
    
    private NodoFila cabezaFila;
    private int filas;
    
    public void insertar(int indiceFila, double valor){
        
        NodoFila nuevaFila = new NodoFila(indiceFila, valor);
        boolean existe = false;
        
        if(cabezaFila == null){
        
            filas++;
            cabezaFila = nuevaFila;
            
        } else {
            
            NodoFila q = cabezaFila;
            NodoFila s = null;
            
            while(q != null){
            
                if(indiceFila <= q.getIndiceFila()){
                            
                    if(indiceFila == q.getIndiceFila()){
                    
                        existe = true;
                        
                    }
                    
                    break;
                    
                } else {
                
                    s=q;        
                    q = q.getAbajo();
                    
                }

            }
            
            if(q == null){
                
                filas++;
                s.setAbajo(nuevaFila);
                
            } else {
                
                if(existe){
                
                   q.setValor(valor);
                    
                } else {
                    
                    if(q == cabezaFila){
                
                        filas++;
                        
                        cabezaFila = nuevaFila;
                        nuevaFila.setAbajo(q);
                    
                    } else {

                        filas++;
                        
                        s.setAbajo(nuevaFila);
                        nuevaFila.setAbajo(q);

                    }
                    
                }

            }
            
        }
        
    }
    
    public void eliminar( int indiceFila ){
    
        NodoFila q = cabezaFila;
        NodoFila s = null;

        while(q != null){

            if(q.getIndiceFila() == indiceFila){

                break;

            } else {

                s=q;        
                q = q.getAbajo();

            }

        }
        
        if(q == null){
                
            System.out.println("No se encuentra el valor en las filas");

        } else if (s == null){
            
            filas--;
            cabezaFila = q.getAbajo();
            
        }else{

            filas--;
            s.setAbajo(q.getAbajo());
            q = null;

        }
        
    }
    
    public void imprimir(){
        
        NodoFila q = cabezaFila;
        
        while(q != null){
            
            System.out.print(q.getIndiceFila() + " ," + q.getValor() + " ---> ");
            q = q.getAbajo();
            
        }
        
        System.out.println(" ");
        
    }

    public double consultarFila(int indiceFila){
        
        NodoFila q = cabezaFila;

        while(q != null){

            if(q.getIndiceFila() == indiceFila){

                break;

            } else {
       
                q = q.getAbajo();

            }

        }
        
        if(q == null){
                
            return -100000.0;
            
        }else{

            return q.getValor();

        }
        
    }
    
    public NodoFila getCabezaFila() {
        return cabezaFila;
    }

    public void setCabezaFila(NodoFila cabezaFila) {
        this.cabezaFila = cabezaFila;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }
    
    
    
}

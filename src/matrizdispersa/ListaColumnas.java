
package matrizdispersa;

public class ListaColumnas {
    
    private NodoColumna cabezaColumna;
    private int columnas;    
    
    ListaColumnas(){
        
        this.cabezaColumna = null; 
        
    }
    
    public void insertar(int indice){
        
        NodoColumna nuevo = new NodoColumna(indice);
        
        if(cabezaColumna == null){
        
            cabezaColumna = nuevo;
            
        } else {
            
            NodoColumna q = cabezaColumna;
            NodoColumna s = null;
            
            while(q != null){
            
                if(indice < q.getIndiceColumna() ){

                    break;
                    
                } else {
                
                    s=q;        
                    q = q.getSiguiente();
                    
                }

            }
            
            if(q == null){
                
                s.setSiguiente(nuevo);
                
                
            } else {
                
                if(q == cabezaColumna){
                
                    cabezaColumna = nuevo;
                    nuevo.setSiguiente(q);
                    
                } else {
                    
                    s.setSiguiente(nuevo);
                    nuevo.setSiguiente(q);
                    
                }  
                
            }
            
        }
        
        columnas++;
        
    }
    
    public void eliminar( int indiceColumna ){
    
        NodoColumna q = cabezaColumna;
        NodoColumna s = null;

        while(q != null){

            if(q.getIndiceColumna() == indiceColumna){

                break;

            } else {

                s=q;        
                q = q.getSiguiente();

            }

        }
        
        if(q == null){
                
            System.out.println("No se encuentra en la lista");

        } else if (s == null){
            
            cabezaColumna = q.getSiguiente();
            columnas--;
            
        }else{

            s.setSiguiente(q.getSiguiente());
            q = null;
            columnas--;
            
        }
        
    }
    
    public void ingresarFila(int indiceColumna, int indiceFila, double valor){
        
        NodoColumna q = cabezaColumna;
        
        while(q != null){

            if(q.getIndiceColumna() == indiceColumna){

                break;

            } else {
   
                q = q.getSiguiente();

            }

        }
        
        if(q == null){
            
            insertar(indiceColumna);
            ingresarFila(indiceColumna, indiceFila, valor);
            
        } else {
            
            if(valor == 0){
            
                q.getFilas().eliminar(indiceFila);
                q.setCantidadFilas( q.getFilas().getFilas() );
                
                if(q.getFilas().getFilas() == 0){
                
                    eliminar(indiceColumna);
                    
                }
                
            } else {
                
                q.getFilas().insertar(indiceFila, valor);
                q.setCantidadFilas( q.getFilas().getFilas() );
                
            }
            
            
        }
        
    }
    
    public void imprimir(){
        
        NodoColumna q = cabezaColumna;
        
        while(q != null){
            
            System.out.println("Columna: " + q.getIndiceColumna());
            
            System.out.print("Filas: ");
            
            q.getFilas().imprimir();
            
            System.out.println(" ");
            
            q = q.getSiguiente();
            
        }
        
        System.out.println(" ");
        
    }

    public double consultar(int indiceColumna, int indiceFila){
        
        NodoColumna q = cabezaColumna;
        NodoColumna s = null;

        while(q != null){

            if(q.getIndiceColumna() == indiceColumna){

                break;

            } else {

                s=q;        
                q = q.getSiguiente();

            }

        }
        
        if(q == null){
                
            return -100000.0;

        } else{

            return q.getFilas().consultarFila(indiceFila);
            
        }
        
    }
    
    public NodoColumna getCabezaColumna() {
        return cabezaColumna;
    }

    public void setCabezaColumna(NodoColumna cabezaColumna) {
        this.cabezaColumna = cabezaColumna;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

}

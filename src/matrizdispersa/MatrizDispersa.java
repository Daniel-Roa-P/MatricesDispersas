
package matrizdispersa;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MatrizDispersa extends JFrame implements ActionListener {

    JButton botonIngresoA = new JButton("Ingresar en la matriz A");
    JButton botonIngresoB = new JButton("Ingresar en la matriz B");
    JButton botonSumar = new JButton("Sumar las dos matrices (A + B)");
    
    JTextField columnaA = new JTextField("5");
    JTextField columnaB = new JTextField("3");
    JTextField filaA = new JTextField("5");
    JTextField filaB = new JTextField("3");
    JTextField valorA = new JTextField("5");
    JTextField valorB = new JTextField("3");
    
    JLabel texto1 = new JLabel("Ingrese las coordenasa de la matriz A");
    JLabel texto2 = new JLabel("Ingrese las coordenasa de la matriz B");
    JLabel textoFA = new JLabel("Fila A : ");
    JLabel textoCA = new JLabel("Columna A :");
    JLabel textoVA = new JLabel("Valor: ");
    JLabel textoFB = new JLabel("Fila B : ");
    JLabel textoCB = new JLabel("Columna B :");
    JLabel textoVB = new JLabel("Valor: ");
    
    JScrollPane panelInternoA = new JScrollPane();
    JScrollPane panelInternoB = new JScrollPane();
    JScrollPane panelInternoR = new JScrollPane();
    JScrollPane panelExternoA = new JScrollPane();
    JScrollPane panelExternoB = new JScrollPane();
    JScrollPane panelExternoR = new JScrollPane();
    
    ListaColumnas matrizA = new ListaColumnas();
    ListaColumnas matrizB = new ListaColumnas();
    
    public static void main(String[] args) {

        MatrizDispersa md = new MatrizDispersa();
        md.setBounds(0, 0, 1255, 510);
        md.setTitle("Matriz Dispersa");
        md.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        md.setVisible(true); 
        
    }

    MatrizDispersa(){
        
        Container c = getContentPane();
        c.setLayout(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        c.add(texto1);
        c.add(texto2);
        c.add(textoCA);
        c.add(textoFA);
        c.add(textoVA);
        c.add(textoCB);
        c.add(textoFB);
        c.add(textoVB);
     
        c.add(columnaA);
        c.add(columnaB);
        c.add(filaA);
        c.add(filaB);
        c.add(valorA);
        c.add(valorB);
        
        c.add(botonIngresoA);
        c.add(botonIngresoB);
        c.add(botonSumar);
        
        c.add(panelExternoA);
        c.add(panelExternoB);
        c.add(panelExternoR);
        
        texto1.setBounds(10, 10, 300, 30);
        textoFA.setBounds(10, 40, 100, 30);
        textoCA.setBounds(80, 40, 100, 30);
        textoVA.setBounds(190, 40, 100, 30);
        
        filaA.setBounds(48, 45, 30, 20);
        columnaA.setBounds(150, 45, 30, 20);
        valorA.setBounds(230, 45, 30, 20);
        
        botonIngresoA.setBounds(10, 70, 250, 30);
        botonIngresoA.addActionListener(this);
        botonIngresoA.setBackground(Color.YELLOW);
        
        panelExternoA.setBounds(10, 110, 400, 350);
        panelExternoA.setPreferredSize(new Dimension(400, 350));
        panelExternoA.setBackground(Color.BLUE);
        
        panelInternoA.setBounds(10, 110, 2000, 2000);
        panelInternoA.setPreferredSize(new Dimension(2000, 2000));
        panelInternoA.setBackground(Color.LIGHT_GRAY);

        texto2.setBounds(370, 10, 300, 30);
        textoFB.setBounds(370, 40, 100, 30);
        textoCB.setBounds(450, 40, 100, 30);
        textoVB.setBounds(560, 40, 100, 30);
        
        filaB.setBounds(418, 45, 30, 20);
        columnaB.setBounds(520, 45, 30, 20);
        valorB.setBounds(600, 45, 30, 20);
        
        botonIngresoB.setBounds(420, 70, 250, 30);
        botonIngresoB.addActionListener(this);
        botonIngresoB.setBackground(Color.CYAN);
        
        panelExternoB.setBounds(420, 110, 400, 350);
        panelExternoB.setPreferredSize(new Dimension(400, 350));
        panelExternoB.setBackground(Color.BLUE);
        
        panelInternoB.setBounds(420, 110, 2000, 2000);
        panelInternoB.setPreferredSize(new Dimension(2000, 2000));
        panelInternoB.setBackground(Color.LIGHT_GRAY);
        
        botonSumar.setBounds(830, 70, 250, 30);
        botonSumar.addActionListener(this);
        botonSumar.setBackground(Color.GREEN);
        
        panelExternoR.setBounds(830, 110, 400, 350);
        panelExternoR.setPreferredSize(new Dimension(400, 350));
        panelExternoR.setBackground(Color.BLUE);
        
        panelInternoR.setBounds(830, 110, 2000, 2000);
        panelInternoR.setPreferredSize(new Dimension(2000, 2000));
        panelInternoR.setBackground(Color.LIGHT_GRAY);
        
    }
    
    public void pintar(JScrollPane panelInterno, JScrollPane panelExterno, ListaColumnas matriz){
        
        panelInterno.removeAll();
        
        NodoColumna columna = matriz.getCabezaColumna();
        System.out.println("Columnas: " + matriz.getColumnas());
        
        for(int i = 0; i < matriz.getColumnas(); i++){
            
            System.out.println("Filas: " + columna.getCantidadFilas());
            
            JLabel indiceColumna = new JLabel(String.valueOf(columna.getIndiceColumna()));
            indiceColumna.setBounds((i*80) , 0, 150, 30);
            
            panelInterno.add(indiceColumna);
            
            NodoFila fila = columna.getFilas().getCabezaFila();
            
            for(int j = 0; j < columna.getCantidadFilas(); j++){
            
                JLabel img = new JLabel();
        
                ImageIcon imgIcon = new ImageIcon(getClass().getResource("Abajo.png"));

                Image imgEscalada = imgIcon.getImage().getScaledInstance(30,50, Image.SCALE_SMOOTH);
                Icon iconoEscalado = new ImageIcon(imgEscalada);
                img.setBounds(i*80 , 40 + (j*100), 30, 50);
                img.setIcon(iconoEscalado);
                
                JLabel indiceFila = new JLabel(String.valueOf(fila.getIndiceFila() + ", " + fila.getValor()));
                indiceFila.setBounds(i*80 , 90 + (j*100), 150, 50);

                panelInterno.add(indiceFila);
                
                panelInterno.add(img);
                
                fila = fila.getAbajo();
                
            }
            
            if(i < matriz.getColumnas() -1){
                
                JLabel img2 = new JLabel();
        
                ImageIcon imgIcon = new ImageIcon(getClass().getResource("Derecha.png"));

                Image imgEscalada = imgIcon.getImage().getScaledInstance(50,30, Image.SCALE_SMOOTH);
                Icon iconoEscalado = new ImageIcon(imgEscalada);
                img2.setBounds(20 + (i*80) , 0, 50, 30);
                img2.setIcon(iconoEscalado);

                panelInterno.add(img2);
                
            }

            columna = columna.getSiguiente();
            
        }
        
        panelInterno.repaint();
        panelExterno.setViewportView(panelInterno);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource() == botonIngresoA){
        
            int indicefilaA = Integer.parseInt(filaA.getText());
            int indiceColA = Integer.parseInt(columnaA.getText());
            double contenidoA = Double.parseDouble(valorA.getText());
            
            matrizA.ingresarFila(indiceColA, indicefilaA, contenidoA);
            pintar(panelInternoA, panelExternoA, matrizA);
            
        } else if(e.getSource() == botonIngresoB){
        
            int indicefilaB = Integer.parseInt(filaB.getText());
            int indiceColB = Integer.parseInt(columnaB.getText());
            double contenidoB = Double.parseDouble(valorB.getText());
            
            matrizB.ingresarFila(indiceColB, indicefilaB, contenidoB);
            pintar(panelInternoB, panelExternoB, matrizB);
            
        } else if(e.getSource() == botonSumar){
        
            ListaColumnas matrizR = new ListaColumnas();
            
            NodoColumna columna = matrizA.getCabezaColumna();
            
            for(int i = 0; i < matrizA.getColumnas(); i++){
            
                NodoFila fila = columna.getFilas().getCabezaFila();

                for(int j = 0; j < columna.getCantidadFilas(); j++){

                    matrizR.ingresarFila(columna.getIndiceColumna(), fila.getIndiceFila(), fila.getValor());

                    fila = fila.getAbajo();

                }

                columna = columna.getSiguiente();
            
            }
            
            columna = matrizB.getCabezaColumna();
            
            NodoColumna tempColumna = matrizR.getCabezaColumna();
            
            for(int i = 0; i < matrizB.getColumnas(); i++){
            
                NodoFila fila = columna.getFilas().getCabezaFila();

                for(int j = 0; j < columna.getCantidadFilas(); j++){

                    if(matrizR.consultar(columna.getIndiceColumna(), fila.getIndiceFila()) != -100000.0){
                    
                        matrizR.ingresarFila(columna.getIndiceColumna(), fila.getIndiceFila(), fila.getValor() + matrizR.consultar(columna.getIndiceColumna(), fila.getIndiceFila()));
                        
                    } else {

                        matrizR.ingresarFila(columna.getIndiceColumna(), fila.getIndiceFila(), fila.getValor());
                        
                    }

                    fila = fila.getAbajo();

                }

                columna = columna.getSiguiente();
            
            }
            
            pintar(panelInternoR, panelExternoR, matrizR);
            
        }

    }
    
}

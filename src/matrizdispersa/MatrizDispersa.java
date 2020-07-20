
package matrizdispersa;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    JTextField columnaA = new JTextField();
    JTextField columnaB = new JTextField();
    JTextField filaA = new JTextField();
    JTextField filaB = new JTextField();
    JTextField valorA = new JTextField();
    JTextField valorB = new JTextField();
    
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
        
        c.add(panelInternoA);
        c.add(panelExternoA);
        c.add(panelInternoB);
        c.add(panelExternoB);
        c.add(panelInternoR);
        c.add(panelExternoR);
     
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
        
        panelInternoA.setBounds(10, 110, 400, 350);
        panelInternoA.setPreferredSize(new Dimension(400, 350));
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
        
        panelInternoB.setBounds(420, 110, 400, 350);
        panelInternoB.setPreferredSize(new Dimension(400, 350));
        panelInternoB.setBackground(Color.LIGHT_GRAY);
        
        botonSumar.setBounds(830, 70, 250, 30);
        botonSumar.addActionListener(this);
        botonSumar.setBackground(Color.GREEN);
        
        panelExternoR.setBounds(830, 110, 400, 350);
        panelExternoR.setPreferredSize(new Dimension(400, 350));
        panelExternoR.setBackground(Color.BLUE);
        
        panelInternoR.setBounds(830, 110, 400, 350);
        panelInternoR.setPreferredSize(new Dimension(400, 350));
        panelInternoR.setBackground(Color.LIGHT_GRAY);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource() == botonIngresoA){
        
            panelInternoA.removeAll();
            panelInternoA.repaint();
            
            panelExternoA.setViewportView(panelInternoA);
            
        } else if(e.getSource() == botonIngresoB){
        
            panelInternoB.removeAll();
            panelInternoB.repaint();
            
            panelExternoB.setViewportView(panelInternoB);
            
        } else if(e.getSource() == botonSumar){
        
            panelInternoR.removeAll();
            panelInternoR.repaint();
            
            panelExternoR.setViewportView(panelInternoR);
            
        }

    }
    
}

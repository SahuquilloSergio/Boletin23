package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Boletin23_1 {
    JFrame marco;
    JPanel panel;
    JButton boton1;
    
    public Boletin23_1(){
        
        //Instanciamos los objetos
        marco = new JFrame("Curso DAM");
        panel = new JPanel();
        boton1 = new JButton("Pulsar");
        
        //Aplicamos las características
        marco.setSize(400, 200);
        panel.add(boton1);
        marco.add(panel);
        mostrarMensaje men = new mostrarMensaje();
        
        // Se añade al botón el ActionListener
        boton1.addActionListener(men);
        
        // Se hace visible
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    // Clase interna:
    public class mostrarMensaje implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object boton = ae.getSource();
            if (boton == boton1) {
                JOptionPane.showMessageDialog(null, "Has pulsado el botón");
            }
        }
    }
}

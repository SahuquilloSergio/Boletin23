package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Boletin23_3 {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;

    public Boletin23_3() {
        
        // Se instancian los objetos
        marco = new JFrame("Boletin 23 Programacion");
        panel = new JPanel();
        boton1 = new JButton("Saludo");
        boton2 = new JButton("Despedida");
        
        // Se dan las características a los objetos
        marco.setSize(400, 200);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        mostrarMensaje mess = new mostrarMensaje();
        
        // Se añade a los botones el ActionListener
        boton1.addActionListener(mess);
        boton2.addActionListener(mess);
        
        // Se hace visible
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    // Clase interna
    public class mostrarMensaje implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            /*
             * Para poder diferenciar que botón es el pulsado utilizamos para el
             * ActionEvent su método .getSource.
             */
            Object boton = ae.getSource();
            if (boton == boton1) {
                JOptionPane.showMessageDialog(null, "Un saludo a DAM");
            } else {
                JOptionPane.showMessageDialog(null, "Fin de programa");
            }
        }

    }
    
}

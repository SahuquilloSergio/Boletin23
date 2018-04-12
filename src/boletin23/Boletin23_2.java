package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Boletin23_2 {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;

    public Boletin23_2() {
        // Se instancian los objetos
        
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton1 = new JButton("Programacion");
        boton2 = new JButton("Bases");
        // Se dan las características a los objetos
        
        marco.setSize(400, 200);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        cambiarTitulo tit = new cambiarTitulo();
        
        // Se añade a los botones el ActionListener
        boton1.addActionListener(tit);
        boton2.addActionListener(tit);
        
        // Se hace visible
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    // Clase interna:
    public class cambiarTitulo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            /*
             * Para poder diferenciar que botón es el pulsado utilizamos para el
             * ActionEvent su método .getSource.
             */
            Object boton = ae.getSource();
            if (boton == boton1) {
                marco.setTitle("Programacion");
            } else {
                marco.setTitle("Bases de Datos");
            }
        }

    }    
}

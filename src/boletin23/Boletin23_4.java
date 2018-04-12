package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Boletin23_4 {

    JFrame marco, marco2;
    JPanel panel, panel2;
    JLabel mensaje;
    JButton boton1;

    public Boletin23_4(){
       
        // Se instancian los objetos
        marco = new JFrame("Boletin 23 Programacion");
        marco2 = new JFrame("Nueva Ventana");
        panel = new JPanel();
        panel2 = new JPanel();
        mensaje = new JLabel("JBaited");
        boton1 = new JButton("Pulsa Aqui");
        
        // Se dan las características a los objetos
        marco.setSize(400, 200);
        marco2.setSize(250, 100);
        panel.add(boton1);
        panel2.add(mensaje);
        marco.add(panel);
        marco2.add(panel2);
        cambiar cam = new cambiar();
        
        // Se añade al boton el ActionListener
        boton1.addActionListener(cam);
        // Se hace visible:
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    // Clase interna:
    public class cambiar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            /*
             * Para poder diferenciar que botón es el pulsado utilizamos para el
             * ActionEvent su método .getSource.
             */
            Object boton = ae.getSource();
            if (boton == boton1) {
                marco.setVisible(false);
                marco2.setLocationRelativeTo(marco2);
                marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                marco2.setVisible(true);
            }
        }

    }
}

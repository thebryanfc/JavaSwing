import javax.swing.*;
import java.awt.event.*;

public class HolaMundoConBoton extends JFrame implements ActionListener {

    JButton boton;
    JLabel etiqueta;

    public HolaMundoConBoton() {
        boton = new JButton("Haz clic");
        boton.addActionListener(this);
        add(boton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {
        etiqueta = new JLabel("Hola mundo");
        add(etiqueta);
        pack();
    }

    public static void main(String[] args) {
        new HolaMundoConBoton();
    }
}

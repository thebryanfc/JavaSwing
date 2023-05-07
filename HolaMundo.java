import javax.swing.*;

public class HolaMundo extends JFrame {

    public HolaMundo() {
        JLabel etiqueta = new JLabel("Hola mundo");
        add(etiqueta);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new HolaMundo();
    }
}

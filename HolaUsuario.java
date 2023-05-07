import javax.swing.*;
import java.awt.event.*;

public class HolaUsuario extends JFrame implements ActionListener{
    private JTextField textfield1;
    private JLabel label1;
    private JButton botons,botone;
    
    public HolaUsuario(){
    setLayout(null);
    
    textfield1 =new JTextField();
    textfield1.setBounds(75,17,150,20);
    add (textfield1);
    
    botons = new JButton("cerrar");
    botons.setBounds(300,250,100,30);
    add(botons);
    botons.addActionListener(this);

    botone = new JButton("entrar");
    botone.setBounds(30,250,100,30);
        add(botone);
    botone.addActionListener(this);


    label1 = new JLabel("Nombre:");
    label1.setBounds(10,10,300,30);
    add (label1);
}
public void actionPerformed(ActionEvent e){
    if(e.getSource() == botone){
        String texto = textfield1.getText();
        setTitle(texto);
    //label1.setText("Has elegido la opcion 1");
}//fin de boton e
        if(e.getSource() == botons){
        System.exit(0);
 }//fin de boton salida
}//fin de la action 
public static void main(String args[]){
    HolaUsuario f1=new HolaUsuario();
    
    f1.setBounds(0,0,450,350);
    f1.setVisible(true);
    f1.setResizable(false);
    f1.setLocationRelativeTo(null);
         
    }//fin de main

}//fin de class
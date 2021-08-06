package src.window;
import javax.swing.*;

public class PrincipalF extends JFrame{
    
    public PrincipalF() {
        setTitle("Identificador");
        setBounds(200, 200, 300, 400);
        add(new PanelP());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}

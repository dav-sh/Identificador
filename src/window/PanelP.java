package src.window;
import javax.swing.*;
import src.tipos.*;
import java.awt.event.*;
import java.awt.*;


public class PanelP extends JPanel{

    JButton b1;
    JTextArea t1;
    JLabel l1;

    public PanelP(){
        createJPanel();
    }


    public JPanel createJPanel(){
        setLayout(new GridLayout(3,1));
        b1 = new JButton("Verificar");
        b1.setPreferredSize(new Dimension(15,50));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VerificaTipos tip = new VerificaTipos(t1.getText());
                l1.setText("Cambie el texto "+ t1.getText());
                //tip.getTipo();
                //tip.getTextos();
                l1.setText(imprimeLabel(tip.getTipo() , tip.getTextos() ));
            }
        });


        t1 = new JTextArea("Ingresa aqui el texto");
        t1.setPreferredSize(new Dimension(300,200));
        l1 = new JLabel("Info...");
        l1.setSize(50,50);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        l1.setPreferredSize(new Dimension(300,150));
        add(t1);add(b1);add(l1);
        return this;
    }

    public String imprimeLabel(TipoIdentificador[] tipos, String[] textos){
        String texto = "<html><body>";
        for(int i=0; i<tipos.length; i++){
            texto = texto + "<br>"+ " " +tipos[i].getTipo()+" " + textos[i]+ "<br>";

        }
        texto = texto + "</body></html>";
        return texto;
        
    }
    
}
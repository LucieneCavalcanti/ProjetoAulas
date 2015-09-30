
import javax.swing.JOptionPane;

public class boas_vindas {
    
    /** Creates a new instance of boas_vindas */
    public boas_vindas() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, funcoes.data_sistema(),"Boas Vindas", 3);
    }
    
}

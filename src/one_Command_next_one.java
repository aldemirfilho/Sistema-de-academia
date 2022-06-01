import javax.swing.JOptionPane;

public class one_Command_next_one implements Command{

    @Override
    public void execute(Academia academia) {
        JOptionPane.showMessageDialog(null, academia.toString());
        //break;
    }
    
    
}

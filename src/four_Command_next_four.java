import javax.swing.JOptionPane;

public class four_Command_next_four implements Command{

    @Override
    public void execute(Academia academia) {
        try {
            String cpfClientePagar = JOptionPane.showInputDialog("CPF: ");
            JOptionPane.showMessageDialog(null, academia.clientePagar(cpfClientePagar));
        } catch (cpfNaoExisteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        //break;

    }
}

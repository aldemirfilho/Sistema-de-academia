import javax.swing.JOptionPane;

public class two_Command_next_four implements Command{

    @Override
    public void execute(Academia academia) {
        try {
            String cpfFuncionarioAPagar = JOptionPane.showInputDialog("CPF: ");
            JOptionPane.showMessageDialog(null, academia.pagarFuncionario(cpfFuncionarioAPagar));
        } catch (cpfNaoExisteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        //break;
    }
}

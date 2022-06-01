import javax.swing.JOptionPane;

public class one_Command_next_six implements Command{

    @Override
    public void execute(Academia academia) {
        JOptionPane.showMessageDialog(null, "Você tem R$ " + academia.getContas().getaPagar() + " para pagar até o fim do mês.");
        //break;
    }
}

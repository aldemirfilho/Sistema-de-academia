import javax.swing.JOptionPane;

public class one_Command_next_five implements Command{

    @Override
    public void execute(Academia academia) {
        JOptionPane.showMessageDialog(null, "Você tem R$ " + academia.getContas().getaReceber() + " para receber até o fim do mês.");
        //break;

    }
}

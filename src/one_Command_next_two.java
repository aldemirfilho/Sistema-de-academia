import javax.swing.JOptionPane;

public class one_Command_next_two implements Command{

    @Override
    public void execute(Academia academia) {
        String novoNome = JOptionPane.showInputDialog("Digite o novo nome da Academia: ");
        academia.setNome(novoNome); //Altera o nome da Academia
        JOptionPane.showMessageDialog(null, "O nome da Academia foi alterado para " + academia.getNome());

        //break;
    }
}

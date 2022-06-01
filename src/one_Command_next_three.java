import javax.swing.JOptionPane;

public class one_Command_next_three implements Command{

    @Override
    public void execute(Academia academia) {
        String novoEmail = JOptionPane.showInputDialog("Digite o novo email da Academia");
        int novoDDD = 0, cont_aux = 0;
        while (cont_aux == 0) {
            try {
                novoDDD = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo DDD da Academia: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        int novoNumero = 0;
        while (cont_aux == 0) {
            try {
                novoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo Telefone da Academia: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        Telefone novoTelefone = new Telefone(novoNumero, novoDDD);
        Contato novoContato = new Contato(novoTelefone, novoEmail);
        academia.setContato(novoContato);
        JOptionPane.showMessageDialog(null, "O Telefone da Academia foi alterado para " + academia.getContato().getTelefone().getDd() + " " + academia.getContato().getTelefone().getNumero());
        JOptionPane.showMessageDialog(null, "O Email da Academia foi alterado para " + academia.getContato().getEmail());

        //break;
    }
}

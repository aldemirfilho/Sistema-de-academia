
import javax.swing.JOptionPane;

public class four_Command implements Command {

    @Override
    public void execute(Academia academia) {
        boolean sairCliente = false;
        while (!sairCliente) {
            int escolhaCliente = -1, cont_aux = 0;
            while (cont_aux == 0) {
                try {
                    escolhaCliente = Integer.parseInt(JOptionPane.showInputDialog("Menu Clientes " + academia.getNome() + "\n"
                            + "1 - Cadastrar\n"
                            + "2 - Listar\n"
                            + "3 - A Receber\n"
                            + "4 - Efetuar Pagamento \n"
                            + "0 - Voltar"));
                    cont_aux++;
                } catch (NumberFormatException Exception) {
                    JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
                }
            }
            cont_aux = 0;
            if (escolhaCliente == 0) {
                sairCliente = true;
                break;
            }
            Invoker_four.invoke(Integer.toString(escolhaCliente), academia);
        }
        //break;
    }

}

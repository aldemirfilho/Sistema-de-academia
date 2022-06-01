
import javax.swing.JOptionPane;

public class two_Command implements Command {

    @Override
    public void execute(Academia academia) {
        boolean sairFuncionario = false;
        while (!sairFuncionario) {
            int escolhaFuncionario = -1, cont_aux = 0;
            while (cont_aux == 0) {
                try {
                    escolhaFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Menu Funcionários " + academia.getNome() + "\n"
                        + "1 - Cadastrar\n"
                        + "2 - Listar\n"
                        + "3 - A Pagar\n"
                        + "4 - Efetuar Pagamento \n"
                        + "0 - Voltar"));
                    cont_aux++;
                } catch (NumberFormatException Exception) {
                    JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
                }
            }
            cont_aux = 0;
            if (escolhaFuncionario == 0) {
                sairFuncionario = true;
                break;
            }
            Invoker_two.invoke(Integer.toString(escolhaFuncionario), academia);
        }
        //break;
    }
}

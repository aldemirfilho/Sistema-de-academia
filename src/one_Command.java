
import javax.swing.JOptionPane;

public class one_Command implements Command{

    @Override
    public void execute(Academia academia) {
        boolean sairAcademia = false; //Condição para sair do menu da academia
        while (!sairAcademia) {
            int escolhaAcademia = -1, cont_aux = 0;
            while (cont_aux == 0) {
                try {
                    escolhaAcademia = Integer.parseInt(JOptionPane.showInputDialog("Menu Academia " + academia.getNome() + "\n"
                        + "1 - Dados\n"
                        + "2 - Alterar Nome\n"
                        + "3 - Alterar Contato\n"
                        + "4 - Alterar Endereço\n"
                        + "5 - Contas a receber\n"
                        + "6 - Contas a pagar\n"
                        + "0 - Voltar"));
                    cont_aux++;
                } catch (NumberFormatException Exception) {
                    JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
                }
            }
            cont_aux = 0;
            if (escolhaAcademia == 0) {
                sairAcademia = true; //Condição apra voltar ao menu anterior
                break;
            }
            Invoker_one.invoke(Integer.toString(escolhaAcademia), academia);
        }
                    //break;
    }
    
}

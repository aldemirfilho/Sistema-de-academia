
import javax.swing.JOptionPane;

public class three_Command implements Command {

    @Override
    public void execute(Academia academia) {
        boolean sairEquipamento = false;
        while (!sairEquipamento) {
            int escolhaEquipamento = -1, cont_aux = 0;
            while (cont_aux == 0) {
                try {
                    escolhaEquipamento = Integer.parseInt(JOptionPane.showInputDialog("Menu de Equipamentos da Academia " + academia.getNome() + "\n"
                        + "1 - Cadastrar\n"
                        + "2 - Remover\n"
                        + "3 - Listar\n"
                        + "0 - Voltar"));
                    cont_aux++;
                } catch (NumberFormatException Exception) {
                    JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
                }
            }
            cont_aux = 0;
            if (escolhaEquipamento == 0) {
                sairEquipamento = true;
                break;
            }
            Invoker_three.invoke(Integer.toString(escolhaEquipamento), academia);
        }

        //break;
    }

}

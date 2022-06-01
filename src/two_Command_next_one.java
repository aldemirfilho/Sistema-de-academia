import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class two_Command_next_one implements Command{

    @Override
    public void execute(Academia academia) {
        int cont_aux = 0, id = 0;
        while (cont_aux == 0) {
            try {
                id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
            }
        }
        cont_aux = 0;
        String nome = JOptionPane.showInputDialog("Nome: ");
        String CPF = JOptionPane.showInputDialog("CPF: ");
        int ddd = 0;
        while (cont_aux == 0) {
            try {
                ddd = Integer.parseInt(JOptionPane.showInputDialog("DDD: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
            }
        }
        cont_aux = 0;
        int numeroTel = 0;
        while (cont_aux == 0) {
            try {
                numeroTel = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
            }
        }
        cont_aux = 0;
        String emailFun = JOptionPane.showInputDialog("Email: ");
        String dataNasciFunc = JOptionPane.showInputDialog("Data de Nascimento: ");
        double valor = 0;
        while (cont_aux == 0) {
            try {
                valor = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        String cargaHoraria = JOptionPane.showInputDialog("Carga Horária: ");
        String estadoFunc = JOptionPane.showInputDialog("Estado do funcionário: ");
        String cidadeFunc = JOptionPane.showInputDialog("Cidade: ");
        String logradouroFunc = JOptionPane.showInputDialog("Logradouro: ");
        int numeroFunc = 0;
        while (cont_aux == 0) {
            try {
                numeroFunc = Integer.parseInt(JOptionPane.showInputDialog("Número da casa: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        String complementoFunc = JOptionPane.showInputDialog("Complemento: ");
        String bairroFunc = JOptionPane.showInputDialog("Bairro: ");

        Telefone tel = new Telefone(numeroTel, ddd);

        Contato contato = new Contato(tel, emailFun);

        Endereco enderecoFunc = new Endereco(logradouroFunc, numeroFunc, complementoFunc, bairroFunc, cidadeFunc, estadoFunc);

        Funcionario f = new Funcionario(id, nome, CPF, contato, enderecoFunc, dataNasciFunc, valor, cargaHoraria);

        academia.cadastrarFuncionario(f);

        //break;
    }
    
    
}

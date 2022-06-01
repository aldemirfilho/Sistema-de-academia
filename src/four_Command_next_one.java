import javax.swing.JOptionPane;

public class four_Command_next_one implements Command{

    @Override
    public void execute(Academia academia) {
        Plano planoCliente = new Plano();
        int cont_aux = 0, id = 0;
        while (cont_aux == 0) {
            try {
                id = Integer.parseInt(JOptionPane.showInputDialog("ID: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        String nomeCliente = JOptionPane.showInputDialog("Nome: ");
        String CPFCliente = JOptionPane.showInputDialog("CPF: ");
        int dddCliente = 0;
        while (cont_aux == 0) {
            try {
                dddCliente = Integer.parseInt(JOptionPane.showInputDialog("DDD: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        int numeroTelCliente = 0;
        while (cont_aux == 0) {
            try {
                numeroTelCliente = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        String emailCliente = JOptionPane.showInputDialog("Email: ");
        String dataNasciCliente = JOptionPane.showInputDialog("Data de Nascimento: ");

        String estadoCliente = JOptionPane.showInputDialog("Estado do cliente: ");
        String cidadeCliente = JOptionPane.showInputDialog("Cidade: ");
        String logradouroCliente = JOptionPane.showInputDialog("Logradouro: ");
        int numeroCliente = 0;
        while (cont_aux == 0) {
            try {
                numeroCliente = Integer.parseInt(JOptionPane.showInputDialog("Número da casa: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        String complementoCliente = JOptionPane.showInputDialog("Complemento: ");
        String bairroCliente = JOptionPane.showInputDialog("Bairro: ");
        int opcaoPlano = -1;
        while (cont_aux == 0) {
            try {
                opcaoPlano = Integer.parseInt(JOptionPane.showInputDialog("Opções de Plano:"
                    + "\n1-Plano Família"
                    + "\n2-Plano Universitário"
                    + "\n3-Plano Padrão"
                    + "\n4-Plano Natação"
                    + "\n5-Plano Luta"));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
            }
        }
        cont_aux = 0;
        planoCliente.setPlano(opcaoPlano);
        planoCliente.setValorPlano((int)planoCliente.getPlano());
        Telefone telCliente = new Telefone(numeroTelCliente, dddCliente);
        Contato contatoCliente = new Contato(telCliente, emailCliente);
        Endereco enderecoCliente = new Endereco(logradouroCliente, numeroCliente, complementoCliente, bairroCliente, cidadeCliente, estadoCliente);
        Cliente c = new Cliente(id, nomeCliente, CPFCliente, contatoCliente, enderecoCliente, dataNasciCliente, planoCliente);
        academia.cadastrarCliente(c);
        //break;
    }
}

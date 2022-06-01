import javax.swing.JOptionPane;

public class one_Command_next_four implements Command{

    @Override
    public void execute(Academia academia) {
        String novoLogradouroAcademia = JOptionPane.showInputDialog("Digite o Logradouro da Academia");
        int novoNumeroAcademia = 0, cont_aux = 0;
        while (cont_aux == 0) {
            try {
                novoNumeroAcademia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número da Academia"));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        String novoComplementoAcademia = JOptionPane.showInputDialog("Digite o Complemento");
        String novoBairroAcademia = JOptionPane.showInputDialog("Digite o Bairro da Academia");
        String novaCidadeAcademia = JOptionPane.showInputDialog("Digite a Cidade da Academia");
        String novoEstadoAcademia = JOptionPane.showInputDialog("Digite o Estado da Academia");

        Endereco novoEdereco = new Endereco(novoLogradouroAcademia, novoNumeroAcademia, novoComplementoAcademia, novoBairroAcademia, novaCidadeAcademia, novoEstadoAcademia);
        academia.setEndereco(novoEdereco);

        //break;

    }
}

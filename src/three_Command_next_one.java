import javax.swing.JOptionPane;

public class three_Command_next_one implements Command{

    @Override
    public void execute(Academia academia) {
        int IdEquipamento = 0, cont_aux = 0;
        while (cont_aux == 0) {
            try {
                IdEquipamento = Integer.parseInt(JOptionPane.showInputDialog("Digite um ID para o Equipamento: "));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        String nomeEquipamento = JOptionPane.showInputDialog("Digite o nome do Equipamento:");
        String tipoEquipamento = JOptionPane.showInputDialog("Digite o tipo do Equipamento:");
        double pesoMaterial = 0;
        while (cont_aux == 0) {
            try {
                pesoMaterial = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do material:"));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        String descricaoEquipamento = JOptionPane.showInputDialog("Digite a descrição do equipamento");
        Equipamento e = new Equipamento(nomeEquipamento, tipoEquipamento, pesoMaterial, IdEquipamento, descricaoEquipamento);
        academia.cadastrarEquipamento(e);

        //break;
    }
    
    
}

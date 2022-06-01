import javax.swing.JOptionPane;

public class three_Command_next_two implements Command{

    @Override
    public void execute(Academia academia) {
        int idEquipamentoRemover = 0, cont_aux = 0;
        while (cont_aux == 0) {
            try {
                idEquipamentoRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Equipamento para remover"));
                cont_aux++;
            } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "       Entrada Inválida\nInsira um número inteiro.");
            }
        }
        cont_aux = 0;
        academia.removerEquipamento(idEquipamentoRemover);
        //System.out.println(idEquipamentoRemover);
        //break;
    }
    
    
}

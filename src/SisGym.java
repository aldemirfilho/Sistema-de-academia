import javax.swing.JOptionPane;

public class SisGym {

    public static void main(String[] args) {
        
        String nomeAcademia = JOptionPane.showInputDialog("Digite o nome da Academia"); //Inicia pedindo o nome da Academia
        Academia academia = new Academia(nomeAcademia); 
    
        boolean sair = false; //condição para o menu geral funcionar
        while (!sair) {
            int escolha = -1, cont_aux = 0;
            while (cont_aux == 0) {
                try {
                    escolha = Integer.parseInt(JOptionPane.showInputDialog("Menu Academia " + academia.getNome() + "\n" //Menu Geral
                            + "1 - Academia\n"
                            + "2 - Funcionários\n"
                            + "3 - Equipamentos\n"
                            + "4 - Clientes\n"
                            + "0 - Sair"));
                    cont_aux++;
                } catch (NumberFormatException Exception) {
                JOptionPane.showMessageDialog(null, "         Entrada Inválida\n Insira um número inteiro.");
                }
            }
            cont_aux = 0;
            if(escolha == 0){
                JOptionPane.showMessageDialog(null, "Obrigado");
                sair = true;
                break;
            }
            Invoker.invoke(Integer.toString(escolha), academia);
        }
    }
}

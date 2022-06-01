import javax.swing.JOptionPane;

public class two_Command_next_three implements Command{

    @Override
    public void execute(Academia academia) {
        String listaFuncionariosPagar = "Lista de Funcionários a pagar: \n";
        
        Iterator Iterator_ArrayList = new Iterator_ArrayList_func(academia.getFuncionarios()); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Funcionario func = (Funcionario)Iterator_ArrayList.next();
            if (!func.isPagamento()) {
                listaFuncionariosPagar += func.toString() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, listaFuncionariosPagar);

        //break;
    }
}

import javax.swing.JOptionPane;

public class two_Command_next_two implements Command{

    @Override
    public void execute(Academia academia) {
        String lista = "Lista de Funcionários da Academia " + academia.getNome() + ":\n";
        
        Iterator Iterator_ArrayList = new Iterator_ArrayList_func(academia.getFuncionarios()); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Funcionario func = (Funcionario)Iterator_ArrayList.next();
            lista += func.toString() + ", \n";
       }
        JOptionPane.showMessageDialog(null, lista);

        //break;
    }
}

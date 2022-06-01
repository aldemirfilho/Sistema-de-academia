import javax.swing.JOptionPane;

public class four_Command_next_two implements Command{

    @Override
    public void execute(Academia academia) {
        String lista = "Lista de Clientes da Academia " + academia.getNome() + ":\n";
        
        Iterator Iterator_ArrayList = new Iterator_ArrayList_client(academia.getClientes()); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Cliente client = (Cliente)Iterator_ArrayList.next();
            lista += client.toString() + ", \n";
        }
        JOptionPane.showMessageDialog(null, lista);

        //break;
    }
    
    
}

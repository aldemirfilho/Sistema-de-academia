import javax.swing.JOptionPane;

public class four_Command_next_three implements Command{

    @Override
    public void execute(Academia academia) {
        String listaClientesDevendo = "Lista de Clientes Devendo: \n";
        
        Iterator Iterator_ArrayList = new Iterator_ArrayList_client(academia.getClientes()); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Cliente client = (Cliente)Iterator_ArrayList.next();
            if (!client.isPagamento()) {
                listaClientesDevendo += client.getNome() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, listaClientesDevendo);
        //break;
    }
}

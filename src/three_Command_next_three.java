import javax.swing.JOptionPane;

public class three_Command_next_three implements Command{

    @Override
    public void execute(Academia academia) {
        String listaEquipamentos = "Lista de Equipamentos da Academia " + academia.getNome() + "\n";
        
        Iterator Iterator_ArrayList = new Iterator_ArrayList_equip(academia.getEquipamentos()); //construtor list
        while (Iterator_ArrayList.hasNext()) {
            Equipamento equip = (Equipamento)Iterator_ArrayList.next();
            listaEquipamentos += equip.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, listaEquipamentos);

        //break;
    }
    
    
}

import java.util.HashMap;
import java.util.Map;

public class Invoker_four {
    
    public static Map<String, Command> comandos_four = new HashMap<String, Command>();   
    
    static{
        comandos_four.put("1", new four_Command_next_one());
        comandos_four.put("2", new four_Command_next_two());
        comandos_four.put("3", new four_Command_next_three());
        comandos_four.put("4", new four_Command_next_four());
    }
    
    public static void invoke(String command, Academia academia){
        comandos_four.get(command).execute(academia);
    }
}
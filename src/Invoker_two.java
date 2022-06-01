import java.util.HashMap;
import java.util.Map;

public class Invoker_two {
    
    public static Map<String, Command> comandos_two = new HashMap<String, Command>();   
    
    static{
        comandos_two.put("1", new two_Command_next_one());
        comandos_two.put("2", new two_Command_next_two());
        comandos_two.put("3", new two_Command_next_three());
        comandos_two.put("4", new two_Command_next_four());
    }
    
    public static void invoke(String command, Academia academia){
        comandos_two.get(command).execute(academia);
    }
}
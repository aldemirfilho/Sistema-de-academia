import java.util.HashMap;
import java.util.Map;

public class Invoker_one {
    
    public static Map<String, Command> comandos_one = new HashMap<String, Command>();   
    
    static{
        comandos_one.put("1", new one_Command_next_one());
        comandos_one.put("2", new one_Command_next_two());
        comandos_one.put("3", new one_Command_next_three());
        comandos_one.put("4", new one_Command_next_four());
        comandos_one.put("5", new one_Command_next_five());
        comandos_one.put("6", new one_Command_next_six());
    }
    
    public static void invoke(String command, Academia academia){
        comandos_one.get(command).execute(academia);
    }
}
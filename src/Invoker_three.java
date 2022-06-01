import java.util.HashMap;
import java.util.Map;

public class Invoker_three {
    
    public static Map<String, Command> comandos_three = new HashMap<String, Command>();   
    
    static{
        comandos_three.put("1", new three_Command_next_one());
        comandos_three.put("2", new three_Command_next_two());
        comandos_three.put("3", new three_Command_next_three());
    }
    
    public static void invoke(String command, Academia academia){
        comandos_three.get(command).execute(academia);
    }
}
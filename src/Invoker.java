import java.util.HashMap;
import java.util.Map;

public class Invoker {
    
    public static Map<String, Command> comandos_main = new HashMap<String, Command>();   
    
    static{
        comandos_main.put("1", new one_Command());
        comandos_main.put("2", new two_Command());
        comandos_main.put("3", new three_Command());
        comandos_main.put("4", new four_Command());
    }
    
    public static void invoke(String command, Academia academia){
        comandos_main.get(command).execute(academia);
    }
}

import java.util.HashMap;
import java.util.Map;

public class Invoker_Plano2 {
    
    public static Map<String, Command_Plano2> comandos_plano2 = new HashMap<String, Command_Plano2>();   
    
    static{
        comandos_plano2.put("1", new Command_Plano2_one());
        comandos_plano2.put("2", new Command_Plano2_two());
        comandos_plano2.put("3", new Command_Plano2_three());
        comandos_plano2.put("4", new Command_Plano2_four());
        comandos_plano2.put("5", new Command_Plano2_five());
    }
    
    public static String invoke(String command){
        return comandos_plano2.get(command).execute();
    }
}
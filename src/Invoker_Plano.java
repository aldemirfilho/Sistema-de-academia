import java.util.HashMap;
import java.util.Map;

public class Invoker_Plano {
    
    public static Map<String, Command_Plano> comandos_plano = new HashMap<String, Command_Plano>();   
    
    static{
        comandos_plano.put("1", new Command_Plano_one());
        comandos_plano.put("2", new Command_Plano_two());
        comandos_plano.put("3", new Command_Plano_three());
        comandos_plano.put("4", new Command_Plano_four());
        comandos_plano.put("5", new Command_Plano_five());
    }
    
    public static int invoke(String command){
        return comandos_plano.get(command).execute();
    }
}
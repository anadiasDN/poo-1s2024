package collections;
import java.util.HashMap;

public class ExemploHashMap {

    public static void main(String[] args) {
        HashMap<String, String>capitais = new HashMap<>();

        capitais.put("Brasil", "Brasilia");
        capitais.put("Franca", "Paris");
        capitais.put("Japao", "Toquio");
        capitais.put("Brasil", "Brasilia");

        System.out.println(capitais.get("brasil"));

        if(capitais.containsKey("brasil")){

            System.out.println("brasil esta no HashMap");
        }
        for (String chave : capitais.keySet()){

            System.out.println(chave + "-" + capitais.get (chave));
        }
    }
    
}

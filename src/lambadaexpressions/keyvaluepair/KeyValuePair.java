package lambadaexpressions.keyvaluepair;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyValuePair {
	  public static void main(String[] args) {
          
          Map<String , String>map=new HashMap<>();
          map.put("Bharath", "K N");
          map.put("Jai", "India");
          map.put("Core", "Java");
          map.put("Ram", "Sita");
          map.put("Jhon", "Cena");
          
          
          String result=map.entrySet()
                  .stream()
                  .map((entry)->entry.getKey()+" "+entry.getValue())
                  .collect(Collectors.joining(" , "));
          
          System.out.println(result);
          
      }

}

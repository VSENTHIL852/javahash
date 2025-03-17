import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        HashMap<String, Double> map=new HashMap<>();
        map.put("apple",0.10);
        map.put("grapes",0.50);
        map.put("orange",100.0);
        map.put("wine",10000.0);
        System.out.println(map);
        map.remove("apple");
        System.out.println(map);
        System.out.println(map.get("orange"));
        if(map.containsKey("wine")){
            System.out.print("value of wine is:");
            System.out.println(map.get("wine"));
        }
        else{
            System.out.println(map.get("value not found"));
        }
        System.out.println("overall size of the map is:" +map.size()); 
        
    }
}

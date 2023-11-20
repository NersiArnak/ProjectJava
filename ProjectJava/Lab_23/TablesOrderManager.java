package Lab_23;
import java.util.HashMap;
public class TablesOrderManager {
    HashMap<Integer, Object> orderHashMap = new HashMap<>();

    public Object getOrder(int table){
        return orderHashMap.get(table);
    }

    public void removeOrder(int table) {
        orderHashMap.remove(table);
    }
    public HashMap orders(){
        return orderHashMap;
    }

}

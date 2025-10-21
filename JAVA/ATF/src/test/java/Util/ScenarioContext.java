package Util;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private static final Map<DataKeys, Object> storage = new HashMap<>();
    public ScenarioContext(){

    }
        public static void saveData(DataKeys key, Object value){
            storage.put(key, value);
    }
    public static Object getData(DataKeys key){
        return storage.get(key);
    }
}


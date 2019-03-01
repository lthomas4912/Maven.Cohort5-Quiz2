package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Router {

   private Map<String, String> router = new TreeMap<>();
    public String add(String path, String controller) {
        return router.put(path, controller);
    }

    public Integer size() {
        return router.size();
    }

    public String getController(String path) {
        return router.get(path);
    }

    public void update(String path, String studentController) {
            router.put(path,studentController);
    }


    public void remove(String path) {
        router.remove(path);
    }

    public String toString(){
       String result = "";
//        Set<String> items = router.keySet();
//        for(String pop: items){
//            result += pop + " -> " + router.get(pop) + "\n";
//        } return result;
     Set<Map.Entry<String, String>> entries = router.entrySet();
            for(Map.Entry e : entries){
                String format = e.getKey() + " -> " + e.getValue() + "\n";
                result += format;
            }
                return result;
            }
}
//go through every single entry
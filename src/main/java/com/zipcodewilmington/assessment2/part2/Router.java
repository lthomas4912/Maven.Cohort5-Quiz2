package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Router {

    TreeMap<String, String> router = new TreeMap<>();
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
        Set<String> items = router.keySet();
        for(String pop: items){
            result += pop + " -> " + router.get(pop) + "\n";
        } return result;
     }
}

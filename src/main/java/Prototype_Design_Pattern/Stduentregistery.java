package Prototype_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

public class Stduentregistery {

    private Map<String , Student> studentMap = new HashMap<>();

    void register(String key, Student student){
        studentMap.put(key, student);

    }

    public Student get(String key){
        if(studentMap.containsKey(key)){
            return studentMap.get(key);
        }
        else{
            return null;
        }
    }


}

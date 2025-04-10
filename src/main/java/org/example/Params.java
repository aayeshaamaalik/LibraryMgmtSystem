package org.example;

import java.util.HashMap;
import java.util.Map;

// Params.java
public class Params {
    private Map<String, Object> parameters = new HashMap<>();

    public void addParam(String key, Object value) {
        parameters.put(key, value);
    }

    public Object getParam(String key) {
        return parameters.get(key);
    }
}


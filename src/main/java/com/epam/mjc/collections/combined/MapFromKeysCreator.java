package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        Set<Integer> integers = new HashSet<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Integer length = entry.getKey().length();
            if (result.containsKey(length)) {
                result.get(length).add(entry.getKey());
            } else {
                Set<String> setResult= new HashSet<>();
                setResult.add(entry.getKey());
                result.put(length, setResult);
            }
        }

        return result;
    }
}

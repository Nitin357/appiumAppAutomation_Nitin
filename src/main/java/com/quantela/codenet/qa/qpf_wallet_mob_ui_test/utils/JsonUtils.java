package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JsonUtils {

    public static Map<String, String> getJsonData(String jsonObjectName) {
        var filePath = System.getProperty("user.dir") + "/src/test/resources/com/quantela/codenet/qa/qpf_wallet_mob_ui_test/test_data/testData.json";
        

        Map<String, String> map = new HashMap<>();
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);
            JSONObject allJsonObject = new JSONObject((JSONObject) obj);
            JSONObject singleJsonObject = (JSONObject) allJsonObject.get(jsonObjectName);
            Set<String> keys = singleJsonObject.keySet();
            for (String jsonKey : keys) {
                map.put(jsonKey, (String) singleJsonObject.get(jsonKey));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}

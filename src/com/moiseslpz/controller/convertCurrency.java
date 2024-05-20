package com.moiseslpz.controller;

import com.moiseslpz.model.getInfoAPI;
import com.google.gson.Gson;
import com.moiseslpz.model.exchangerateAPI;
import java.util.HashMap;
import java.util.Map;

public class convertCurrency {
 
    
    public convertCurrency(){
        
    }
    
    public String requestAPI(String currencyFromConvert, String currencyToConvert){
        exchangerateAPI api = new exchangerateAPI();
        api.setCurrencyAPI(currencyFromConvert);
        String jsonResponse = api.requestAPI();
        
        Gson gson = new Gson();
        getInfoAPI consult = gson.fromJson(jsonResponse, getInfoAPI.class);
                
        String currencyInfo = consult.getConversionRates().toString();
        String[] keyValuePairs = currencyInfo.replace("{","[").replace("}","]").split(",");
        Map<String,String> map = new HashMap<>();
        for(String pair : keyValuePairs){
            String[] entry = pair.split("=");
            map.put(entry[0].trim(), entry[1].trim());
            
        }       
        
        return map.get(currencyToConvert);
    }

    
    
}

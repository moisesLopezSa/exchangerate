package com.moiseslpz.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class exchangerateAPI {
    private final String url = "https://v6.exchangerate-api.com/v6/";
    private final String keyAPI = "adbdaa57e16ed45aa3cc0064";
    private String currencyAPI;

    public exchangerateAPI() {
    }

    public void setCurrencyAPI(String currencyAPI) {
        this.currencyAPI = currencyAPI;
    }
    
    public String requestAPI(){
        String jsonResponse = null;
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url + keyAPI + "/latest/" + currencyAPI))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse
                    .BodyHandlers.ofString()); 
            jsonResponse = (String) response.body();
        }catch (IOException | InterruptedException e) {
            System.out.println(e);
        }
        
        return jsonResponse;
        
    }
}
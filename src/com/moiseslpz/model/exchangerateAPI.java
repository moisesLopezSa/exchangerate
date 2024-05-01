package com.moiseslpz.model;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class exchangerateAPI {
    private String currencyAPI;
    private String keyAPI = "adbdaa57e16ed45aa3cc0064";

    public void setCurrencyAPI(String currencyAPI) {
        this.currencyAPI = currencyAPI;
    }
    
    public void conect(){
        try{
            String jsonResponse;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/" + keyAPI + "/latest/" + currencyAPI))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); 
            jsonResponse = response.body();
            System.out.println(jsonResponse);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
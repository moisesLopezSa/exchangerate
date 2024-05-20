package com.moiseslpz.model;

import com.google.gson.annotations.SerializedName;

public class getInfoAPI{
    @SerializedName("base_code")
    private final String baseCode;
    @SerializedName("conversion_rates")
    private final Object conversionRates;
    
    public getInfoAPI(String baseCode, Object conversionRates){
        this.baseCode = baseCode;
        this.conversionRates = conversionRates; 
    }
    
    public String getBaseCode() {
        return baseCode;
    }

    public Object getConversionRates() {
        return conversionRates;
    }

}
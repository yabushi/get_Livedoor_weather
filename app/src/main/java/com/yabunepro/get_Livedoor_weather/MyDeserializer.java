package com.yabunepro.get_Livedoor_weather;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class MyDeserializer implements JsonDeserializer<Forcast> {
    @Override
    public Forcast deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {



        return null;
    }
}

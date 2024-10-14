package com.demobench.benchmark;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;

public class GsonStrategy implements JsonLibraryStrategy {
    private final Gson gson;

    public GsonStrategy() {
        this.gson = new Gson();
    }

    @Override
    public <T> T deserialize(String json, Class<T> clazz) throws IOException {
        try {
            return gson.fromJson(json, clazz);
        } catch (JsonSyntaxException e) {
            throw new IOException("Failed to deserialize JSON", e);
        }
    }


    @Override
    public <T> String serialize(T object) throws IOException {
        return gson.toJson(object);
    }
}

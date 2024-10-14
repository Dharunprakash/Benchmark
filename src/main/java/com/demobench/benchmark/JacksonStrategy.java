package com.demobench.benchmark;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonStrategy implements JsonLibraryStrategy {
    private final ObjectMapper objectMapper;

    public JacksonStrategy() {
        this.objectMapper = new ObjectMapper();
    }
    @Override
    public <T> T deserialize(String json, Class<T> clazz) throws IOException {

        return objectMapper.readValue(json, clazz);
    }


    @Override
    public <T> String serialize(T object) throws IOException {
        return objectMapper.writeValueAsString(object);
    }
}

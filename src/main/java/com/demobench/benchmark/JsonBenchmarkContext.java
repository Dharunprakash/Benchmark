package com.demobench.benchmark;

import java.io.IOException;

public class JsonBenchmarkContext {
    private final JsonLibraryStrategy strategy;

    public JsonBenchmarkContext(JsonLibraryStrategy strategy) {
        this.strategy = strategy;
    }

    public <T> T deserialize(String json, Class<T> clazz) throws IOException {
        return strategy.deserialize(json, clazz);
    }


    public <T> String serialize(T object) throws IOException {
        return strategy.serialize(object);
    }

}

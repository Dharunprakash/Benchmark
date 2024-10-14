package com.demobench.benchmark;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.io.IOException;

public class JsonBStrategy implements JsonLibraryStrategy {
    private final Jsonb jsonb;

    public JsonBStrategy() {
        this.jsonb = JsonbBuilder.create();
    }

    @Override
    public <T> T deserialize(String json, Class<T> clazz) throws IOException {
        try {
            return jsonb.fromJson(json, clazz);
        } catch (Exception e) {
            throw new IOException("Failed to deserialize JSON using JSON-B", e);
        }
    }

    @Override
    public <T> String serialize(T object) throws IOException {
        try {
            return jsonb.toJson(object);
        } catch (Exception e) {
            throw new IOException("Failed to serialize object using JSON-B", e);
        }
    }
}

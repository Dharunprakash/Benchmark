package com.demobench.benchmark;

import com.jsoniter.JsonIterator;
import com.jsoniter.output.JsonStream;

import java.io.IOException;

public class JsonIterStrategy implements JsonLibraryStrategy {

    @Override
    public <T> T deserialize(String json, Class<T> clazz) throws IOException {
        try {
            return JsonIterator.deserialize(json, clazz);
        } catch (Exception e) {
            throw new IOException("Failed to deserialize JSON using Jsoniter", e);
        }
    }

    @Override
    public <T> String serialize(T object) throws IOException {
        try {
            return JsonStream.serialize(object);
        } catch (Exception e) {
            throw new IOException("Failed to serialize object using Jsoniter", e);
        }
    }
}

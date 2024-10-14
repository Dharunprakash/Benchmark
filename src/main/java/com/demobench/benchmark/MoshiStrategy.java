package com.demobench.benchmark;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.io.IOException;

public class MoshiStrategy implements JsonLibraryStrategy {
    private final Moshi moshi;

    public MoshiStrategy() {
        this.moshi = new Moshi.Builder().build();
    }

    @Override
    public <T> T deserialize(String json, Class<T> clazz) throws IOException {
        JsonAdapter<T> adapter = moshi.adapter(clazz);
        return adapter.fromJson(json);
    }

    @Override
    public <T> String serialize(T object) throws IOException {
        JsonAdapter<T> adapter = moshi.adapter((Class<T>) object.getClass());
        return adapter.toJson(object);
    }
}

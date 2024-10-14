package com.demobench.benchmark;

import com.alibaba.fastjson.JSON;
import java.io.IOException;

public class FastJsonStrategy implements JsonLibraryStrategy {

    @Override
    public <T> T deserialize(String json, Class<T> clazz) throws IOException {
        try {
            return JSON.parseObject(json, clazz);
        } catch (Exception e) {
            throw new IOException("Failed to deserialize JSON using FastJSON", e);
        }
    }

    @Override
    public <T> String serialize(T object) throws IOException {
        try {
            return JSON.toJSONString(object);
        } catch (Exception e) {
            throw new IOException("Failed to serialize object using FastJSON", e);
        }
    }
}

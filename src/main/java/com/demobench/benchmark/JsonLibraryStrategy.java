package com.demobench.benchmark;

import java.io.IOException;

public interface JsonLibraryStrategy {

    <T> T deserialize(String json, Class<T> clazz) throws IOException;

    <T> String serialize(T object) throws IOException;

}

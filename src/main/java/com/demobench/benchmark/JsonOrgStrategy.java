package com.demobench.benchmark;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class JsonOrgStrategy implements JsonLibraryStrategy {

    @Override
    public <T> T deserialize(String json, Class<T> clazz) throws IOException {
        try {
            JSONObject jsonObject = new JSONObject(json);
            return mapJsonToObject(jsonObject, clazz);
        } catch (Exception e) {
            throw new IOException("Failed to deserialize JSON", e);
        }
    }

    public <T> T[] deserializeArray(String json, Class<T> clazz) throws IOException {
        try {
            JSONArray jsonArray = new JSONArray(json);
            T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, jsonArray.length());
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                T item = mapJsonToObject(jsonObject, clazz);
                array[i] = item;
            }
            return array;
        } catch (Exception e) {
            throw new IOException("Failed to deserialize JSON", e);
        }
    }

    @Override
    public <T> String serialize(T object) throws IOException {
        try {
            return new JSONObject(object).toString();
        } catch (Exception e) {

            throw new IOException("Failed to serialize object", e);
        }
    }


    private <T> T mapJsonToObject(JSONObject jsonObject, Class<T> clazz) throws IOException {
        try {
            Constructor<T> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            T instance = constructor.newInstance();

            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);

                if (jsonObject.has(field.getName())) {
                    Object value = jsonObject.get(field.getName());

                    // Handle nested objects (JSONObject)
                    if (value instanceof JSONObject) {
                        Class<?> fieldType = field.getType();
                        Object nestedObject = mapJsonToObject((JSONObject) value, fieldType);
                        field.set(instance, nestedObject);
                    }
                    // Handle lists (JSONArray)
                    else if (value instanceof JSONArray) {
                        Class<?> fieldType = field.getType();

                        // Ensure the field is a List
                        if (List.class.isAssignableFrom(fieldType)) {
                            // Extract the generic type (the type of the elements in the list)
                            Class<?> genericType = getGenericType(field);

                            JSONArray jsonArray = (JSONArray) value;
                            List<Object> list = new ArrayList<>();

                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject itemObject = jsonArray.getJSONObject(i);
                                Object item = mapJsonToObject(itemObject, genericType);
                                list.add(item);
                            }

                            field.set(instance, list);
                        } else {
                            // Set other non-collection types directly
                            field.set(instance, value);
                        }
                    } else {
                        // Set primitive or String values directly
                        field.set(instance, value);
                    }
                }
            }

            return instance;
        } catch (Exception e) {
            throw new IOException("Failed to map JSON to object", e);
        }
    }

    // Helper method to retrieve the generic type of the List
    private Class<?> getGenericType(Field field) {
        // Get the type of the field and cast it to ParameterizedType
        java.lang.reflect.ParameterizedType genericType = (java.lang.reflect.ParameterizedType) field.getGenericType();
        return (Class<?>) genericType.getActualTypeArguments()[0];
    }


}

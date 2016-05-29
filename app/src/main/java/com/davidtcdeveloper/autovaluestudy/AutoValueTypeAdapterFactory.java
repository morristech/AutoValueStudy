package com.davidtcdeveloper.autovaluestudy;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/**
 * Created by david on 28/05/16.
 */

public class AutoValueTypeAdapterFactory implements TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        Class<? super T> rawType = type.getRawType();
        if (PersonData.class.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) PersonData.typeAdapter(gson);
        }
        return null;
    }
}
package com.davidtcdeveloper.autovaluestudy;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

/**
 * Adapter factory for GSON integration
 * <p>
 * Created by david on 29/08/16.
 */
@GsonTypeAdapterFactory
abstract class AutoValueGsonAdapterFactory implements TypeAdapterFactory {

    static TypeAdapterFactory create() {
        return new AutoValueGson_AutoValueGsonAdapterFactory();
    }
}
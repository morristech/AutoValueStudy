package com.davidtcdeveloper.autovaluestudy;

import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

/**
 * Person data.
 * Created by david on 26/05/16.
 */
@AutoValue
public abstract class PersonData {

    abstract long id();

    abstract String name();

    abstract int status();

    abstract String eMail();

    abstract String profileUrl();

    @Nullable
    abstract String pictureImageUrl();

    static Builder builder() {
        return new AutoValue_PersonData.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder id(long value);

        abstract Builder name(String value);

        abstract Builder status(int value);

        abstract Builder eMail(String value);

        abstract Builder profileUrl(String value);

        abstract Builder pictureImageUrl(@Nullable String value);

        abstract PersonData build();
    }
}

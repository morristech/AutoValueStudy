package com.davidtcdeveloper.autovaluestudy;

import android.os.Parcelable;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * Person data.
 * Created by david on 26/05/16.
 */
@AutoValue
public abstract class PersonData implements Parcelable {

    abstract long id();

    abstract String name();

    abstract int status();

    abstract String eMail();

    abstract String profileUrl();

    @Nullable
    abstract String pictureImageUrl();

    public static TypeAdapter<PersonData> typeAdapter(Gson gson) {
        return new AutoValue_PersonData.GsonTypeAdapter(gson);
    }

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

    public boolean hasProfilePicure() {
        return this.profileUrl() != null;
    }
}

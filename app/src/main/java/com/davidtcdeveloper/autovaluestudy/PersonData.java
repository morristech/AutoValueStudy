package com.davidtcdeveloper.autovaluestudy;

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

    abstract String pictureImageUrl();

    public static PersonData create(
            long id,
            String name,
            int status,
            String eMail,
            String profileUrl,
            String pictureImageUrl) {
        return new AutoValue_PersonData(id,
                name,
                status,
                eMail,
                profileUrl,
                pictureImageUrl);
    }
}

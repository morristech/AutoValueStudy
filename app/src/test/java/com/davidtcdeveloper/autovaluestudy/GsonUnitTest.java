package com.davidtcdeveloper.autovaluestudy;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class GsonUnitTest {

    @Test
    public void json_isCorrect() throws Exception {
        final Gson gson =
                new GsonBuilder()
                        .registerTypeAdapterFactory(new AutoValueTypeAdapterFactory())
                        .create();

        PersonData personData = PersonData.builder()
                .id(1)
                .name("David Tiago Conceição")
                .eMail("david@david.com")
                .status(0)
                .profileUrl("twitter.com/davidtiagocon")
                .pictureImageUrl("https://pbs.twimg.com/profile_images/601894402198544384/FJupV0uC.jpg")
                .build();

        String personJson = gson.toJson(personData);

        PersonData personDataFromJson =
                gson.fromJson(personJson, PersonData.class);

        assertEquals(personData, personDataFromJson);
    }
}
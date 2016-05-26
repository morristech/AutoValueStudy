package com.davidtcdeveloper.autovaluestudy;

/**
 * Person data.
 * Created by david on 26/05/16.
 */

public class PersonData {

    private final long id;
    private final String name;
    private final int status;
    private final String eMail;
    private final String profileUrl;
    private final String pictureImageUrl;

    public PersonData(
            long id,
            String name,
            int status,
            String eMail,
            String profileUrl,
            String pictureImageUrl) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.eMail = eMail;
        this.profileUrl = profileUrl;
        this.pictureImageUrl = pictureImageUrl;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public String geteMail() {
        return eMail;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getPictureImageUrl() {
        return pictureImageUrl;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", eMail='" + eMail + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                ", pictureImageUrl='" + pictureImageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonData that = (PersonData) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        if (profileUrl != null ? !profileUrl.equals(that.profileUrl) : that.profileUrl != null)
            return false;
        return pictureImageUrl != null ? pictureImageUrl.equals(that.pictureImageUrl) : that.pictureImageUrl == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (profileUrl != null ? profileUrl.hashCode() : 0);
        result = 31 * result + (pictureImageUrl != null ? pictureImageUrl.hashCode() : 0);
        return result;
    }
}

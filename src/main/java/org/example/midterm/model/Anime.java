package org.example.midterm.model;

import java.io.Serializable;

public class Anime implements Serializable {

    private String title;
    private Long id;
    private String releaseDate;
    private Boolean isReleased;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getIsReleased() {
        return isReleased;
    }

    public void setReleased(Boolean released) {
        isReleased = released;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", releaseDate='" + releaseDate + '\'' +
                ", isReleased=" + isReleased +
                '}';
    }
}
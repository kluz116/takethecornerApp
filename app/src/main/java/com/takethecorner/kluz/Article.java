package com.takethecorner.kluz;

import java.io.Serializable;

/**
 * Created by com.takethecorner.kluz Musembya on 18/05/16.
 */
public class Article implements Serializable {
    private int id;
    private String title;
    private String author;
    private String thumbnail;
    private String articles;
    private String date_created;

    public Article() {
    }

    public Article(int id, String title, String author, String thumbnail, String articles, String date_created) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.thumbnail = thumbnail;
        this.articles = articles;
        this.date_created = date_created;
    }
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setSetTitle(String name) {
        this.title = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String numOfSongs) {
        this.author = numOfSongs;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getArticlel() {
        return articles;
    }

    public void setArtcile(String articles) {
        this.articles = articles;
    }
    public String getDateCreated() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }
}

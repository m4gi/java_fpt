/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.shortlink.model;

/**
 *
 * @author Magi
 */
public class ShortenURL {

    private String full_url;
    private String short_url;

    public ShortenURL() {
    }

    public ShortenURL(String full_url, String short_url) {
        this.full_url = full_url;
        this.short_url = short_url;
    }

    public String getFull_url() {
        return full_url;
    }

    public void setFull_url(String full_url) {
        this.full_url = full_url;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    @Override
    public String toString() {
        return "ShortenUrl{"
                + "full_url='" + full_url + '\''
                + ", short_url='" + short_url + '\''
                + '}';
    }
}
  
package com.example.ryan.flavoursdemo.network.model;

/**
 * Created by Ryan on 05/12/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Character {

    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("FirstURL")
    @Expose
    private String firstURL;
    @SerializedName("Result")
    @Expose
    private String result;
    @SerializedName("Icon")
    @Expose
    private Icon icon;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFirstURL() {
        return firstURL;
    }

    public void setFirstURL(String firstURL) {
        this.firstURL = firstURL;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

}

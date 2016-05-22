package com.carisewaoutdoor.carisewaoutoor;

import com.google.gson.annotations.SerializedName;

/**
 * Created by FatalError on 21/05/2016.
 */
public class Product {

    @SerializedName("pid")
    public int pid;

    @SerializedName("name")
    public String name;

    @SerializedName("qty")
    public int qty;

    @SerializedName("price")
    public float price;

    @SerializedName("image_url")
    public  String image_url;
}

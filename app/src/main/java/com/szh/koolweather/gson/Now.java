package com.szh.koolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by szh on 2017/7/1.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;


    public class More{
        @SerializedName("txt")
        public String info;
    }
}

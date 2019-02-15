package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DELL on 2019/1/24.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    public String wind_dir;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }

}

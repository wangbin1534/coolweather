package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DELL on 2019/1/25.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt")
        public String info;
    }

}

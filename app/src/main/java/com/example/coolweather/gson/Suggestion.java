package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DELL on 2019/1/25.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class Comfort {

        @SerializedName("txt")
        public String info;

        public String brf;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

        public String brf;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

        public String brf;

    }
}

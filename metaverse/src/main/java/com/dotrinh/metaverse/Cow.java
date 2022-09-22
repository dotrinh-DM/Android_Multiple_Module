/*
 * Created by dotrinh on 9/22/22, 10:05 PM
 * Copyright (c) 2022. dotr Inc. All rights reserved.
 */

package com.dotrinh.metaverse;


import static com.dotrinh.metaverse.tool.LogUtil.LogI;

public class Cow extends Animal {

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        LogI("country: " + country);
    }
}

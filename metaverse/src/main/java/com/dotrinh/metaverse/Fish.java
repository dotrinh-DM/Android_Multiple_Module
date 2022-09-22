/*
 * Created by dotrinh on 9/22/22, 10:05 PM
 * Copyright (c) 2022. dotr Inc. All rights reserved.
 */

package com.dotrinh.metaverse;


import static com.dotrinh.metaverse.tool.LogUtil.LogI;

public class Fish extends Animal {

    private String water;

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        LogI("water: " + water);
    }
}

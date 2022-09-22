/*
 * Created by dotrinh on 9/22/22, 10:05 PM
 * Copyright (c) 2022. dotr Inc. All rights reserved.
 */

package com.dotrinh.metaverse1;
import static com.dotrinh.metaverse.tool.LogUtil.LogI;

public class Planet {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        LogI("name: " + name);
    }
}

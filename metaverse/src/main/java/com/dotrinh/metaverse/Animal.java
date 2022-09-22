/*
 * Created by dotrinh on 9/22/22, 10:05 PM
 * Copyright (c) 2022. dotr Inc. All rights reserved.
 */

package com.dotrinh.metaverse;


import static com.dotrinh.metaverse.tool.LogUtil.LogI;

public class Animal {
    private String name;
    private float age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void printInfo() {
        LogI("name: " + getName());
        LogI("age: " + Math.round(getAge() * 30) + " day(s)");
    }
}

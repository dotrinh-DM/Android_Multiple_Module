/*
 * Created by dotrinh on 9/22/22, 9:53 PM
 * Copyright (c) 2022. dotr Inc. All rights reserved.
 */

package com.dotrinh.android_multiple_module;

import static com.dotrinh.metaverse.tool.LogUtil.LogI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dotrinh.metaverse.Cow;
import com.dotrinh.metaverse.Fish;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fish f0 = new Fish();
        f0.setName("Cá rô đồng");
        f0.setAge(0.2f);
        f0.setWater("Freshwater");

        Fish f1 = new Fish();
        f1.setName("Tuna");
        f1.setAge(0.6f);
        f1.setWater("Saltwater");

        Cow c1 = new Cow();
        c1.setName("Bò vàng");
        c1.setAge(3.1f);
        c1.setCountry("Việt Nam");

        //show
        f0.printInfo();
        LogI("---------------------");
        f1.printInfo();
        LogI("---------------------");
        c1.printInfo();
    }
}
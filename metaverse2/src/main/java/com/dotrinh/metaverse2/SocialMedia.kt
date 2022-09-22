/*
 * Created by dotrinh on 9/22/22, 10:55 PM
 * Copyright (c) 2022. dotr Inc. All rights reserved.
 */

package com.dotrinh.metaverse2

import com.dotrinh.metaverse.tool.LogUtil.LogI

class SocialMedia {
    private var snsName: String = ""
        get() = field
        set(value) {
            field = value
        }

    constructor(SNS_Name: String) {
        this.snsName = SNS_Name
    }

    fun printInfo() {
        LogI("name: " + this.snsName)
    }
}
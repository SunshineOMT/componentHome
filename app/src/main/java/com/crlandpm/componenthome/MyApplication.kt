package com.crlandpm.componenthome

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.hm.lifecycle.api.BuildConfig

/**
 * Author: Danny Yang
 * Date: 2022/02/23/5:29 下午
 */

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(this)
    }
}
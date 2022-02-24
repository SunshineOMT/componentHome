package com.crlandpm.componenthome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Author: Danny Yang
 * Date: 2022/02/23/5:27 下午
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ARouter.getInstance().build("/componenthome/homeActivity").navigation()
        finish()
    }
}
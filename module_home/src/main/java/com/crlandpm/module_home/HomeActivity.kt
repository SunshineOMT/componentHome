package com.crlandpm.module_home

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Author: Danny Yang
 * Date: 2022/02/23/5:23 下午
 */

@Route(path = "/componenthome/homeActivity")
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btn_go_cart).setOnClickListener {
            ARouter.getInstance().build("/componenta/moduleaActivity").navigation()
        }

    }
}
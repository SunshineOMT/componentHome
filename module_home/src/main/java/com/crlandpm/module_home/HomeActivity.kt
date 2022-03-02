package com.crlandpm.module_home

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.crlandpm.module_export.ARouterTable
import com.crlandpm.module_export.AServiceUtils

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
            AServiceUtils.navigateToA("param1")
        }
        findViewById<TextView>(R.id.tv_cart_product_count).text = AServiceUtils.getTips().tips

        val transaction = supportFragmentManager.beginTransaction()
        val fragment = ARouter.getInstance().build(ARouterTable.PAth_FRAGMENT_A).navigation() as Fragment

        transaction.add(R.id.fl_fragment, fragment, "tag")
        transaction.commit()
    }
}
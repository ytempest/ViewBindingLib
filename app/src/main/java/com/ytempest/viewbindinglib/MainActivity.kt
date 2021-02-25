package com.ytempest.viewbindinglib

import android.os.Bundle
import android.view.View
import com.ytempest.viewbinding.BaseBindingActivity
import com.ytempest.viewbinding.BaseBindingDialog
import com.ytempest.viewbindinglib.databinding.ActivityMainBinding
import com.ytempest.viewbindinglib.databinding.DialogContentBinding

class MainActivity : BaseBindingActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.tvTitle.text = "welcome view binding"

        binding.tvTitle.setOnClickListener {
            val dialog = object : BaseBindingDialog<DialogContentBinding>(this) {
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    binding.tvContent.text = "From binding dialog"
                }
            }
            dialog.show()
        }
    }


}


package com.ytempest.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/**
 * @author heqidu
 * @since 21-2-24
 */
abstract class BaseBindingActivity<VB : ViewBinding>() : AppCompatActivity() {

    lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBindingGeneric(layoutInflater)
        setContentView(binding.root)
    }
}
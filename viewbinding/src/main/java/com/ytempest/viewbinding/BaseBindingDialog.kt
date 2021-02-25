package com.ytempest.viewbinding

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.viewbinding.ViewBinding

/**
 * @author heqidu
 * @since 21-2-24
 */
abstract class BaseBindingDialog<VB : ViewBinding> constructor(
    context: Context,
    themeResId: Int
) : Dialog(context, themeResId) {

    lateinit var binding: VB

    constructor(context: Context) : this(context, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBindingGeneric(layoutInflater)
        setContentView(binding.root)
    }
}
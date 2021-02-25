package com.ytempest.viewbinding

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

/**
 * @author heqidu
 * @since 21-2-24
 */
open class ViewBindingHolder<VB : ViewBinding>(val binding: VB) :
    RecyclerView.ViewHolder(binding.root)
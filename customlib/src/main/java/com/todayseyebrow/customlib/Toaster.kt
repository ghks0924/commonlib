package com.todayseyebrow.customlib

import android.content.Context
import android.widget.Toast

class Toaster {

    companion object {
        fun showToast(context: Context, string:String){
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
        }
    }
}
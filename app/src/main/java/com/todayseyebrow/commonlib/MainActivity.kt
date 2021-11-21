package com.todayseyebrow.commonlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.todayseyebrow.customlib.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.showToast(this, "스에에에에")
    }
}
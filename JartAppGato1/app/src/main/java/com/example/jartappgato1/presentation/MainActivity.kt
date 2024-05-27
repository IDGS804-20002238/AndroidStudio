package com.example.jartappgato1.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.jartappgato1.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(android.R.style.Theme_DeviceDefault)
        setContentView(R.layout.main_activity)
    }
}



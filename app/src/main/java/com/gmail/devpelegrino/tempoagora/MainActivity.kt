package com.gmail.devpelegrino.tempoagora

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.gmail.devpelegrino.tempoagora.utils.Constants.SPLASH_SCREEN_DELAY

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSplashScreen(splashScreen = splashScreen)
    }

    private fun setSplashScreen(splashScreen: SplashScreen) {
        var keep = true
        splashScreen.setKeepOnScreenCondition { keep }
        Handler(Looper.getMainLooper()).postDelayed({ keep = false }, SPLASH_SCREEN_DELAY)
    }
}
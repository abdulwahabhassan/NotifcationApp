package com.decagon.notifcationapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        var notificationTextView:TextView = findViewById(R.id.notificationTextView)
        notificationTextView.text = getString(R.string.active_notification_text)

    }
}
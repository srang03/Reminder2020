package com.example.reminder2020

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.google.android.gms.location.GeofencingEvent


class ReminderReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val geofencingEvent = GeofencingEvent.fromIntent(intent)
//        val geofencingTransition= geofencingEvent.geo

//        val text = intent.getStringExtra("message")
//        context.toast(text)
    }

}
package com.example.reminder2020

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fabOpened = false;

        fab_main.setOnClickListener {
            if (!fabOpened) {
                fabOpened = true;
                fab_map.animate().translationY(-resources.getDimension(R.dimen.standard_66))
                fab_time.animate().translationY(-resources.getDimension(R.dimen.standard_116))
            }
            else {
                fabOpened = false;
                fab_map.animate().translationY(0f);
                fab_time.animate().translationY(0f);
            }
        }


        fab_time.setOnClickListener {
            toast("TimeActivity");
            var intent = Intent(applicationContext, TimeActivity::class.java);
            startActivity(intent);

        }

        fab_map.setOnClickListener {
            toast("MapActivity");
            var intent = Intent(applicationContext, MapActivity::class.java);
            startActivity(intent);
        }

        val data = arrayOf("oulu", "Halsinki", "Tampate","oulu", "Halsinki", "Tampate","oulu", "Halsinki", "Tampate")

        val reminderAdapter = ReminderAdapter(applicationContext, data)
        list.adapter = reminderAdapter

    }
}

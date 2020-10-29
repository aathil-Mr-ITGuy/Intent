package com.aathil.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class ImplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun send(view: View){
        Log.d("Clicked", "Started")
        val intent = Intent(Intent.ACTION_SEND)

        val title= "Share with..."

        var chooser: Intent = Intent.createChooser(intent, title)

        if(intent.resolveActivity(packageManager) != null){
            Log.d("Intent", "Started")
            startActivity(chooser)
        }
        else{
            Toast.makeText(this, "No app can perfome this task", Toast.LENGTH_LONG).show()

        }
    }
}
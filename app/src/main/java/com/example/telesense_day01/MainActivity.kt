package com.example.telesense_day01

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.telesense_day01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var btn: Button? = null;
    var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        btn = findViewById(R.id.btn_pause)
        Notify("onCreate")
        btn!!.setOnClickListener {
            onPause();
        }
    }
    fun Notify(msg: String)
    {
        Log.i("notify", msg);
    }

    override fun onStart() {
        super.onStart()
        Notify("onStart")
    }

    override fun onResume() {
        super.onResume()
        Notify("onResume")
    }

    override fun onStop() {
        super.onStop()
        Notify("onStop")
    }

    override fun onPause() {
        super.onPause()
        Notify("onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Notify("onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Notify("onDestroy")
    }

}
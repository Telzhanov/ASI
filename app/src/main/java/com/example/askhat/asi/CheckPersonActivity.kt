package com.example.askhat.asi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_check_person.*

class CheckPersonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_person)
        var counter = 1
        shtrafi.setOnClickListener {
            counter++
            if (counter%2==0){
                shtrafLayout.visibility = View.VISIBLE
            }
            else{
                shtrafLayout.visibility = View.GONE
            }

        }
        poisk.setOnClickListener {
            if (poiskText.text.toString().equals("990830300790")){
                personLayout.visibility = View.VISIBLE
            }
            else{
                personLayout.visibility = View.GONE
            }
        }
    }
}

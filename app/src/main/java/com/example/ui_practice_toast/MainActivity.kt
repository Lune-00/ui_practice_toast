package com.example.ui_practice_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    logIn.setOnClickListener {

        val checkId = inputId.text.toString()
        val checkPw = inputPw.text.toString()

        if (checkId == "admin@test.com" && checkPw == "qwer") {
            Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
        }

        else {
            Toast.makeText(this, "로그인실패", Toast.LENGTH_SHORT).show()
        }
    }
    }
}
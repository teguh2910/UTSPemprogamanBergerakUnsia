package com.rival.tutorialloginregist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_direct_message.kirim_btn
import kotlinx.android.synthetic.main.activity_profil.*

class DirectMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direct_message)
        supportActionBar?.hide()
        intentBottonDM()
    }
    private fun intentBottonDM() {
        kirim_btn.setOnClickListener {
            startActivity(Intent(this, ActivityProfil::class.java))
        }
    }
}
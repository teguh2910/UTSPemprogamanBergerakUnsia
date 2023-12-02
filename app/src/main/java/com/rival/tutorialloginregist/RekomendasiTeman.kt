package com.rival.tutorialloginregist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rekomendasi_teman.*

class RekomendasiTeman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rekomendasi_teman)
        supportActionBar?.hide()
        intentBottonFollow()
        intentBottonDm()
    }
    private fun intentBottonFollow() {
        follow_btn.setOnClickListener {
            startActivity(Intent(this, ActivityProfil::class.java))
        }
    }
    private fun intentBottonDm() {
        dm_btn.setOnClickListener {
            startActivity(Intent(this, DirectMessage::class.java))
        }
    }
}
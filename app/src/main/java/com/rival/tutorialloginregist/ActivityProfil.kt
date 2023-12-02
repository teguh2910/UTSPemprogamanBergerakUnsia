package com.rival.tutorialloginregist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profil.*

class ActivityProfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        supportActionBar?.hide()

        intentBottonRubahProfil()
        intentBottonRekomendasiTeman()
        intentBottonChannel()
        intentBottonPost()
    }

    private fun intentBottonRubahProfil() {
        rubah_btn.setOnClickListener {
            startActivity(Intent(this, ActivityRubahProfil::class.java))
        }
    }
    private fun intentBottonRekomendasiTeman() {
        rekomendasi_teman_btn.setOnClickListener {
            startActivity(Intent(this, RekomendasiTeman::class.java))
        }
    }
    private fun intentBottonChannel() {
        channel_btn.setOnClickListener {
            startActivity(Intent(this, Channel::class.java))
        }
    }
    private fun intentBottonPost() {
        post_btn.setOnClickListener {
            startActivity(Intent(this, Post::class.java))
        }
    }

}
package com.rival.tutorialloginregist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_profil.rubah_btn
import kotlinx.android.synthetic.main.activity_rubah_profil.*

class ActivityRubahProfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rubah_profil)
        supportActionBar?.hide()
        intentBottonEditProfil()
    }

    private fun intentBottonEditProfil() {
        edit_btn.setOnClickListener {
            startActivity(Intent(this, ActivityProfil::class.java))
        }
    }

}
package com.example.warnawarni

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_welcome)

    val btnMasuk = findViewById<Button>(R.id.btnMasuk)
    val btnPialaDunia = findViewById<Button>(R.id.btnPialaDunia)

    btnMasuk.setOnClickListener {
      val intent = Intent(this, MainActivity::class.java)
      startActivity(intent)
    }

    btnPialaDunia.setOnClickListener {
      val intent = Intent(this, BenderaActivity::class.java)
      startActivity(intent)
    }
  }
}
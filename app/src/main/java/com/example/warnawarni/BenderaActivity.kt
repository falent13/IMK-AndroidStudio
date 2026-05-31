package com.example.warnawarni

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class BenderaActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_bendera)

    val rootLayoutBendera = findViewById<LinearLayout>(R.id.rootLayoutBendera)
    val tvInstruksiBendera = findViewById<TextView>(R.id.tvInstruksiBendera)

    val btnBelanda = findViewById<MaterialButton>(R.id.btnBelanda)
    val btnArgentina = findViewById<MaterialButton>(R.id.btnArgentina)
    val btnBrasil = findViewById<MaterialButton>(R.id.btnBrasil)
    val btnJerman = findViewById<MaterialButton>(R.id.btnJerman)
    val btnJepang = findViewById<MaterialButton>(R.id.btnJepang)
    val btnItaly = findViewById<MaterialButton>(R.id.btnItaly)

    btnBelanda.setOnClickListener {
      rootLayoutBendera.setBackgroundResource(R.drawable.bendera_belanda)
      tvInstruksiBendera.setTextColor(Color.BLACK) // Teks putih agar kontras di atas bendera
    }

    btnArgentina.setOnClickListener {
      rootLayoutBendera.setBackgroundResource(R.drawable.bendera_argentina)
      tvInstruksiBendera.setTextColor(Color.BLACK)
    }

    btnBrasil.setOnClickListener {
      rootLayoutBendera.setBackgroundResource(R.drawable.bendera_brasil)
      tvInstruksiBendera.setTextColor(Color.BLACK)
    }

    btnJerman.setOnClickListener {
      rootLayoutBendera.setBackgroundResource(R.drawable.bendera_jerman)
      tvInstruksiBendera.setTextColor(Color.WHITE)
    }

    btnJepang.setOnClickListener {
      rootLayoutBendera.setBackgroundResource(R.drawable.bendera_jepang)
      tvInstruksiBendera.setTextColor(Color.BLACK)
    }

    btnItaly.setOnClickListener {
      rootLayoutBendera.setBackgroundResource(R.drawable.bendera_italy)
      tvInstruksiBendera.setTextColor(Color.BLACK)
    }
  }
}
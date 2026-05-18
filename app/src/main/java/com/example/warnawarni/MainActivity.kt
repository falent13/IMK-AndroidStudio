package com.example.warnawarni

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val rootLayout = findViewById<LinearLayout>(R.id.rootLayout)
    val tvInstruksi = findViewById<TextView>(R.id.tvInstruksi)

    val btnMerah = findViewById<Button>(R.id.btnMerah)
    val btnHijau = findViewById<Button>(R.id.btnHijau)
    val btnBiru = findViewById<Button>(R.id.btnBiru)
    val btnKuning = findViewById<Button>(R.id.btnKuning)
    val btnHitam = findViewById<Button>(R.id.btnHitam)
    val btnOranye = findViewById<Button>(R.id.btnOranye)

    btnMerah.setOnClickListener {
      rootLayout.setBackgroundColor(Color.parseColor("#E57373"))
      tvInstruksi.setTextColor(Color.WHITE)
    }

    btnHijau.setOnClickListener {
      rootLayout.setBackgroundColor(Color.parseColor("#81C784"))
      tvInstruksi.setTextColor(Color.WHITE)
    }

    btnBiru.setOnClickListener {
      rootLayout.setBackgroundColor(Color.parseColor("#64B5F6"))
      tvInstruksi.setTextColor(Color.WHITE)
    }

    btnKuning.setOnClickListener {
      rootLayout.setBackgroundColor(Color.parseColor("#FFF176"))
      tvInstruksi.setTextColor(Color.WHITE)
    }

    btnHitam.setOnClickListener {
      rootLayout.setBackgroundColor(Color.parseColor("#2c2c2c"))
      tvInstruksi.setTextColor(Color.WHITE)
    }

    btnOranye.setOnClickListener {
      rootLayout.setBackgroundColor(Color.parseColor("#FFB74D"))
      tvInstruksi.setTextColor(Color.WHITE)
    }
  }
}
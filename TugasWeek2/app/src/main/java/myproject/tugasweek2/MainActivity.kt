package myproject.tugasweek2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edSuhu : EditText = findViewById(R.id.edSuhu)

        val btnReamur : Button = findViewById(R.id.btnReamur)
        val btnKelvin : Button = findViewById(R.id.btnKelvin)
        val btnFahrenheit : Button = findViewById(R.id.btnFahrenheit)

        val tvSuhu : TextView = findViewById(R.id.tvkonversi)

        btnReamur.setOnClickListener {
            val input = edSuhu.text.toString()
            if (input.isNotEmpty()) {
                val celcius = input.toDouble()
                val hasil = (4.0 / 5.0) * celcius
                tvSuhu.text = getString(R.string.hasil_konversi, hasil, "°R")
            } else {
                edSuhu.error = getString(R.string.error_konversi)
            }
        }

        btnKelvin.setOnClickListener {
            val input = edSuhu.text.toString()
            if (input.isNotEmpty()) {
                val celcius = input.toDouble()
                val hasil = celcius + 273.15
                tvSuhu.text = getString(R.string.hasil_konversi, hasil, "°K")
            } else {
                edSuhu.error = getString(R.string.error_konversi)
            }
        }

        btnFahrenheit.setOnClickListener {
            val input = edSuhu.text.toString()
            if (input.isNotEmpty()) {
                val celcius = input.toDouble()
                val hasil = (9.0 / 5.0) * celcius + 32
                tvSuhu.text = getString(R.string.hasil_konversi, hasil, "°F")
            } else {
                edSuhu.error = getString(R.string.error_konversi)
            }
        }

    }
}
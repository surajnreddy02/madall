import android.os.Bundle
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timePicker = findViewById<TimePicker>(R.id.timePicker)
        timePicker.setIs24HourView(false) // Set to false for AM/PM, true for 24-hour

        timePicker.setOnTimeChangedListener { _, hour, minute ->
            val amPm = if (hour >= 12) "PM" else "AM"
            val hourFormatted = if (hour == 0 || hour == 12) 12 else hour % 12
            val minFormatted = String.format("%02d", minute)
            val msg = "Time is: $hourFormatted:$minFormatted $amPm"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }
    }
}

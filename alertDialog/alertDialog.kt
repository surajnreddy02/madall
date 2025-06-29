import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Delete File")
            builder.setMessage("Deleting file would harm the system")
            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes") { _, _ ->
                Toast.makeText(applicationContext, "Clicked Yes", Toast.LENGTH_LONG).show()
                // Add logic to delete or simulate action here
            }

            builder.setNeutralButton("Cancel") { dialog, _ ->
                dialog.dismiss() // just dismiss
            }

            builder.setNegativeButton("No") { _, _ ->
                Toast.makeText(applicationContext, "Clicked No", Toast.LENGTH_LONG).show()
            }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}
class MainActivity : AppCompatActivity() { 
override fun onCreate(savedInstanceState: Bundle?) { 
super.onCreate(savedInstanceState) 
setContentView(R.layout.activity_main) 
val b1 = findViewById<Button>(R.id.buttonShowToast) 
b1.setOnClickListener { 
val ctoastlayout = 
layoutInflater.inflate(R.layout.customtoast,findViewById(R.i
 d.customcontainer)) 
val customToast = Toast(this) 
customToast.view = ctoastlayout 
customToast.setGravity(Gravity.CENTER,0,0) 
customToast.duration = Toast.LENGTH_LONG 
customToast.show() 
} 
} 
}
package vcmsa.alvin.mathsappst10486137

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ReportFragment.Companion.reportFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.editTextView2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }   //end of ViewCompat

        //code starts here


        // create
        val MathsIsRad = findViewById<EditText>(R.id.editText)
        val Number = findViewById<EditText>(R.id.editText3)
        val ClickMe = findViewById<Button>(R.id.btnButton)
        val maths = findViewById<EditText>(R.id.editText4)
        //add a number of your choice

        //button.setOnClickListner

        var number = interger.text.toString()
        var ClickMe = ClickMe.text.toString()
        var maths = answer.text.toString()
        if (ntnumber = null && intnumber)
          val number1 = input1.toInterger()
          val number2 = input2.toInterger()
          val result = number1 + number2
          maths.text = result (number1 + number2)

        if (number1 = null){
            resultTextView.text = ('Please enter valid whole numbers')
            return
        }

        var number = interger.text.toString()
        var ClickMe = ClickMe.text.toString()
        var maths = answer.text.toString()
        if (ntnumber = null &&intnumber)
            val number1 = input1.toInterger()
            val number2 = input2.toInterger()
            val result = number1 + number2
            maths.text = result (number1 + number2)

        if (number2 = null){
            resultTextView.text = ('Please enter valid whole numbers')
            return








        }

}
package com.example.a2341565

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a2341565.ui.theme._2341565Theme

import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main)
        val name: EditText = findViewById(R.id.name)
        val nameDisplay: TextView = findViewById(R.id.nameDisplay)
        name.addTextChangedListener {
            val username = name.text.toString()
            nameDisplay.text = "Welcome $username"
        }
        val num1: EditText = findViewById(R.id.num1)
        val num2: EditText = findViewById(R.id.num2)
        val sumBtn: Button = findViewById(R.id.button)
        val numOP: TextView = findViewById(R.id.numRes)
        sumBtn.setOnClickListener(){
            val a = num1.text.toString().toInt()
            val b: Int = num2.text.toString().toInt()
            val c:Int = a+b
            numOP.text = c.toString()
        }
        val showBtn: Button=findViewById(R.id.button2)
        showBtn.setOnClickListener(){
            setContentView(R.layout.home)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _2341565Theme {
        Greeting("Android")
    }
}
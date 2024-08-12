package com.example.a2341565

import android.annotation.SuppressLint
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

private const val s1 = "="

class MainActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main)
        val name: EditText = findViewById(R.id.name)
        val nameDisplay: TextView = findViewById(R.id.nameDisplay)
        name.addTextChangedListener {
            val username = name.text.toString()
            val s = "Welcome $username"
            nameDisplay.text = s
        }
        val num1: EditText = findViewById(R.id.num1)
        val num2: EditText = findViewById(R.id.num2)
        val sumBtn: Button = findViewById(R.id.button6)
        val subBtn:Button = findViewById(R.id.button)
        val mulBtn:Button = findViewById(R.id.button5)
        val divBtn:Button = findViewById(R.id.button7)
        val numOP: TextView = findViewById(R.id.numRes)
        val operation: TextView = findViewById(R.id.operation2)
        val equals: TextView = findViewById(R.id.operation)
        sumBtn.setOnClickListener(){
            val a = num1.text.toString().toInt()
            val b: Int = num2.text.toString().toInt()
            val c:Int = a+b
            operation.text = sumBtn.text
            equals.text = s1
            numOP.text = c.toString()
        }
        subBtn.setOnClickListener(){
            val a = num1.text.toString().toInt()
            val b: Int = num2.text.toString().toInt()
            val c:Int = a-b
            operation.text = subBtn.text
            equals.text = s1
            numOP.text = c.toString()
        }
        mulBtn.setOnClickListener(){
            val a = num1.text.toString().toInt()
            val b: Int = num2.text.toString().toInt()
            val c:Int = a*b
            operation.text = mulBtn.text
            equals.text = s1
            numOP.text = c.toString()
        }
        divBtn.setOnClickListener(){
            val a = num1.text.toString().toInt()
            val b: Int = num2.text.toString().toInt()
            val c:Int = a/b
            operation.text = divBtn.text
            equals.text = s1
            numOP.text = c.toString()
        }
        val showBtn: Button=findViewById(R.id.button8)
        showBtn.setOnClickListener() {
            setContentView(R.layout.home)
            val backBtn: Button=findViewById(R.id.button3)
            backBtn.setOnClickListener(){
                setContentView(R.layout.main)
            }
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
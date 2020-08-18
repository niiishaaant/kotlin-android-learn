package kedar.nishant.buttonclickapp

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//import android.text.method.ScrollingMovementMethod as ScrollingMovementMethod1

private const val TAG = "MainActivity"
private const val TEXT_CONTENT = "TextContent"


class MainActivity : AppCompatActivity() {

    //private var userInput: EditText? = null
    //private var button: Button? = null
    private var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        userInput.text.clear()
        textView?.text = ""

        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            Log.d(TAG, "onClick: called")
            textView?.append("${userInput.text}\n")
            userInput.text.clear()
        }
    }

    override fun onPause() {
        Log.d(TAG, "onPause: called")
        super.onPause()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState: called")
        super.onRestoreInstanceState(savedInstanceState)
        textView?.text = savedInstanceState.getString(TEXT_CONTENT, "")
    }

    override fun onStart() {
        Log.d(TAG, "onStart: called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume: called")
        super.onResume()
    }

    override fun onStop() {
        Log.d(TAG, "onStop: called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy: called")
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState: called")
        super.onSaveInstanceState(outState)
        outState.putString(TEXT_CONTENT, textView?.text.toString())
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart: called")
        super.onRestart()
    }
}
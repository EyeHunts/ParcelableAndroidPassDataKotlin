package `in`.eyehunt.parcelableandroidpassdatakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_send.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("student", Student(243, "Rohit Kanojia", 27))
            startActivity(intent)
        })
    }
}

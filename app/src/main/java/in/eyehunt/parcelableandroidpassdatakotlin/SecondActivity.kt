package `in`.eyehunt.parcelableandroidpassdatakotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data = intent.extras
        val student = data.getParcelable<Student>("student")

        textView_stu.text = student.id.toString() + " " + student.name + " " + student.age
    }
}

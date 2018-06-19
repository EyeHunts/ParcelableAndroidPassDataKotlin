package `in`.eyehunt.parcelableandroidpassdatakotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
/**
 * Created by Eyehunt Team on 19/06/18.
 */
@Parcelize
data class Student (val id:Long, val name: String, val age: Int) : Parcelable  {

}

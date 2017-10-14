package fk.locateme

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val db = Room.databaseBuilder(applicationContext, RoomDatabase::class.java, "LocateMeDb").build()
        db.userDao().insert(User(1, "Filip", "Korpalski"))

        var u = db.userDao().getAll()
    }
}

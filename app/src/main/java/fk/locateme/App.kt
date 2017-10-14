package fk.locateme

import android.app.Application
import android.arch.persistence.room.Room

/**
 * Created by korpalsk on 2017-10-12.
 */
class App:Application() {

    companion object {
        var db: RoomDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        App.db =  Room.databaseBuilder(this, RoomDatabase::class.java, "LocateMeDb").build()
    }
}
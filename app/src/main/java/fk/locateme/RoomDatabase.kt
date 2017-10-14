package fk.locateme

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database



/**
 * Created by korpalsk on 2017-10-12.
 */
@Database(entities = arrayOf(User::class), version = 1, exportSchema = false)
abstract class RoomDatabase : RoomDatabase() {
    abstract fun userDao(): UserDAO
}
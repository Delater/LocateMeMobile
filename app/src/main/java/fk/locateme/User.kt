package fk.locateme

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by korpalsk on 2017-10-12.
 */
@Entity(tableName = "users")
data class User(@PrimaryKey var id: Long, var name: String, var surname: String)
package com.lattaro.passweird.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lattaro.passweird.data.local.dao.PasswordDao
import com.lattaro.passweird.data.local.entity.PasswordEntity

@Database(entities = [PasswordEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun passwordDao(): PasswordDao
}
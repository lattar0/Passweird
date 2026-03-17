package com.lattaro.passweird.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "passwords")
data class PasswordEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val description: String,
    val username: String,
    val password: String,
    val url: String?
)
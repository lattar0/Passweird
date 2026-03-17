package com.lattaro.passweird.domain.repository

import com.lattaro.passweird.domain.model.Password
import kotlinx.coroutines.flow.Flow

interface PasswordRepository {
    fun getAllPasswords(): Flow<List<Password>>

    suspend fun getPasswordById(id: Int): Password?

    suspend fun insertPassword(password: Password)

    suspend fun deletePassword(password: Password)

    suspend fun updatePassword(password: Password)
}

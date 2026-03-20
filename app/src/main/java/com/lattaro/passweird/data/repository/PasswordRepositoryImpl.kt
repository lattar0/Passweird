package com.lattaro.passweird.data.repository

import com.lattaro.passweird.data.local.dao.PasswordDao
import com.lattaro.passweird.data.mapper.toEntity
import com.lattaro.passweird.data.mapper.toModel
import com.lattaro.passweird.domain.model.Password
import com.lattaro.passweird.domain.repository.PasswordRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PasswordRepositoryImpl @Inject constructor(
    private val dao: PasswordDao
): PasswordRepository {
    override fun getAllPasswords(): Flow<List<Password>> {
        return dao.getAllPasswords().map {list ->
            list.map { entity -> entity.toModel() }
        }
    }

    override suspend fun getPasswordById(id: Int): Password? {
        return dao.getPasswordById(id)?.toModel()
    }

    override suspend fun insertPassword(password: Password) {
        return dao.insertPassword(password.toEntity())
    }

    override suspend fun deletePassword(password: Password) {
        return dao.deletePassword(password.toEntity())
    }

    override suspend fun updatePassword(password: Password) {
        return dao.updatePassword(password.toEntity())
    }
}
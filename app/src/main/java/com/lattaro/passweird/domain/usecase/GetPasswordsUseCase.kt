package com.lattaro.passweird.domain.usecase

import com.lattaro.passweird.domain.model.Password
import com.lattaro.passweird.domain.repository.PasswordRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPasswordsUseCase @Inject constructor(
    private val repository: PasswordRepository
) {
    operator fun invoke(): Flow<List<Password>> {
        return repository.getAllPasswords()
    }
}
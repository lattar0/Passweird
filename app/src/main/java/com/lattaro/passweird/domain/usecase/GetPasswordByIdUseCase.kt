package com.lattaro.passweird.domain.usecase

import com.lattaro.passweird.domain.model.Password
import com.lattaro.passweird.domain.repository.PasswordRepository
import javax.inject.Inject

class GetPasswordByIdUseCase @Inject constructor(
    private val repository: PasswordRepository
) {
    suspend operator fun invoke(id: Int): Password? {
        return repository.getPasswordById(id)
    }
}
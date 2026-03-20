package com.lattaro.passweird.domain.usecase

import com.lattaro.passweird.domain.model.Password
import com.lattaro.passweird.domain.repository.PasswordRepository
import javax.inject.Inject

class UpdatePasswordUseCase @Inject constructor(
    private val repository: PasswordRepository
) {
    suspend operator fun invoke(password: Password) {
        return repository.updatePassword(password)
    }
}
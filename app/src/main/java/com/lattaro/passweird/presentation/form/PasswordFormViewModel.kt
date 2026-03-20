package com.lattaro.passweird.presentation.form

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lattaro.passweird.domain.model.Password
import com.lattaro.passweird.domain.usecase.InsertPasswordUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class PasswordFormViewModel @Inject constructor(
    private val insertPasswordUseCase: InsertPasswordUseCase
) : ViewModel() {
    fun createPassword(password: Password) {
        viewModelScope.launch {
            insertPasswordUseCase(password)
        }
    }
}
package com.lattaro.passweird.presentation.form

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lattaro.passweird.domain.model.Password
import com.lattaro.passweird.domain.usecase.InsertPasswordUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class PasswordFormViewModel @Inject constructor(
    private val insertPasswordUseCase: InsertPasswordUseCase
) : ViewModel() {
    private val _description = MutableStateFlow("")
    val description: StateFlow<String> = _description

    private val _user = MutableStateFlow("")
    val user: StateFlow<String> = _user

    private val _password = MutableStateFlow("")
    val password: StateFlow<String> = _password

    fun onPasswordInputChange(newValue: String) {
        _password.value = newValue
    }

    fun onUserInputChange(newValue: String) {
        _user.value = newValue
    }

    fun onDescriptionInputChange(newValue: String) {
        _description.value = newValue
    }

    fun createPassword(password: Password) {
        viewModelScope.launch {
            insertPasswordUseCase(password)
        }
    }
}
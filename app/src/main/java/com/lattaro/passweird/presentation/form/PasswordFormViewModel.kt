package com.lattaro.passweird.presentation.form

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lattaro.passweird.domain.model.Password
import com.lattaro.passweird.domain.usecase.InsertPasswordUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PasswordFormViewModel @Inject constructor(
    private val insertPasswordUseCase: InsertPasswordUseCase
) : ViewModel() {
    private val _state = MutableStateFlow(PasswordFormState())
    val state: StateFlow<PasswordFormState> = _state

    fun onDescriptionChange(description: String) {
        _state.value = _state.value.copy(description = description)
    }

    fun onUsernameChange(username: String) {
        _state.value = _state.value.copy(username = username)
    }

    fun onPasswordChange(password: String) {
        _state.value = _state.value.copy(password = password)
    }

    fun onUrlChange(url: String) {
        _state.value = _state.value.copy(url = url)
    }

    fun onSavePassword() {
        val currentState = _state.value
        val password = Password(
            description = currentState.description,
            username = currentState.username,
            password = currentState.password,
            url = currentState.url
        )

        viewModelScope.launch {
            insertPasswordUseCase(password)
        }
    }
}
package com.lattaro.passweird.presentation.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lattaro.passweird.domain.model.Password
import com.lattaro.passweird.domain.usecase.GetPasswordsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject
import kotlin.collections.emptyList

@HiltViewModel
class PasswordListViewModel @Inject constructor(
    private val getPasswordsUseCase: GetPasswordsUseCase
) : ViewModel() {
    val passwords: StateFlow<List<Password>> = getPasswordsUseCase().stateIn(viewModelScope,
        SharingStarted.Eagerly, emptyList())
}
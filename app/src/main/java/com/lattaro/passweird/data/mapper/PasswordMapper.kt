package com.lattaro.passweird.data.mapper

import com.lattaro.passweird.data.local.entity.PasswordEntity
import com.lattaro.passweird.domain.model.Password

fun PasswordEntity.toModel(): Password {
    return Password(
        id = this.id,
        description = this.description,
        username = this.username,
        password = this.password,
        url = this.url
    )
}

fun Password.toEntity(): PasswordEntity {
    return PasswordEntity(
        id = this.id,
        description = this.description,
        username = this.username,
        password = this.password,
        url = this.url
    )
}
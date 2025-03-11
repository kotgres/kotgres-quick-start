package io.kotgres

import io.kotgres.orm.annotations.Generated
import io.kotgres.orm.annotations.PrimaryKey
import io.kotgres.orm.annotations.Table
import java.time.LocalDateTime

@Table(name = "users")
data class User(
    @PrimaryKey
    @Generated
    val id: Int,
    val name: String,
    val email: String,
    val age: Int,
    val description: String?,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
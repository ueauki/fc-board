package com.fastcampus.fcboard.dto

import java.time.LocalDateTime

data class PostReponse(
    val id: Long,
    val content: String,
    val createdBy: String,
    val createdAt: LocalDateTime,
    val updatedBy: String?,
    val updatedAt: LocalDateTime?
)

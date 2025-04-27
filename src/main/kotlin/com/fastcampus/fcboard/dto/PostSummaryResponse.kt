package com.fastcampus.fcboard.dto

import java.time.LocalDateTime

data class PostSummaryResponse(
    val id: Long,
    val content: String,
    val createdBy: String,
    val createdAt: LocalDateTime,
)

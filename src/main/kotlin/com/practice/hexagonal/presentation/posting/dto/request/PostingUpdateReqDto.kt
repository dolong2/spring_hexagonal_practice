package com.practice.hexagonal.presentation.posting.dto.request

import com.practice.hexagonal.domain.posting.Posting

class PostingUpdateReqDto(
    val title: String,
    val content: String
){
    fun toEntity(id: String, writer: String): Posting =
        Posting(
            id = id,
            title = title,
            content = content,
            writer = writer
        )
}
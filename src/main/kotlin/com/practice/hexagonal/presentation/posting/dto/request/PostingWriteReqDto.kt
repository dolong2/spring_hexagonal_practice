package com.practice.hexagonal.presentation.posting.dto.request

import com.practice.hexagonal.domain.posting.Posting
import java.util.UUID

class PostingWriteReqDto(
    val title: String,
    val content: String,
    val writer: String,
){
    fun toEntity(): Posting{
        return Posting(
            id = UUID.randomUUID().toString().split("-")[0],
            title = title,
            content = content,
            writer = writer,
        )
    }
}
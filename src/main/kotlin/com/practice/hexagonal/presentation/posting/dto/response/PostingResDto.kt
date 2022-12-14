package com.practice.hexagonal.presentation.posting.dto.response

import com.practice.hexagonal.domain.posting.Posting

class PostingResDto(
    val id: String,
    val title: String,
    val content: String,
    val writer: String,
){
    constructor(posting: Posting) : this(
        id = posting.id,
        title = posting.title,
        content = posting.content,
        writer = posting.writer
    )
}
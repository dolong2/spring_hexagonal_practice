package com.practice.hexagonal.application.posting.usecase

import com.practice.hexagonal.application.posting.port.GetAllPostingPort
import com.practice.hexagonal.infraStructure.global.annotation.useCase.ReadOnlyUseCase
import com.practice.hexagonal.presentation.posting.dto.response.PostingListResDto
import com.practice.hexagonal.presentation.posting.dto.response.PostingResDto

@ReadOnlyUseCase
class GetAllPostingUseCase(
    private val getAllPostingPort: GetAllPostingPort
){
    fun execute(): PostingListResDto =
        PostingListResDto(
            list = getAllPostingPort.getAll()
                .map { PostingResDto(it) }
        )
}
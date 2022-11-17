package com.practice.hexagonal.application.posting.usecase

import com.practice.hexagonal.application.posting.port.GetOnePostingPort
import com.practice.hexagonal.infraStructure.global.annotation.useCase.ReadOnlyUseCase
import com.practice.hexagonal.presentation.posting.dto.response.PostingResDto

@ReadOnlyUseCase
class GetOnePostingUseCase(
    private val getOnePostingPort: GetOnePostingPort,
){
    fun execute(id: String): PostingResDto =
        PostingResDto(getOnePostingPort.getOne(id))
}
package com.practice.hexagonal.application.posting.usecase

import com.practice.hexagonal.application.posting.port.WritePostingPort
import com.practice.hexagonal.infraStructure.global.useCase.UseCase
import com.practice.hexagonal.presentation.posting.dto.request.PostingWriteReqDto

@UseCase
class WritePostingUseCase(
    private val writePostingPort: WritePostingPort,
){
    fun execute(postingWriteReqDto: PostingWriteReqDto) =
        writePostingPort.write(postingWriteReqDto.toEntity())
}
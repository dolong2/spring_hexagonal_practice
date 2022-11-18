package com.practice.hexagonal.application.posting.usecase

import com.practice.hexagonal.application.posting.port.GetOnePostingPort
import com.practice.hexagonal.application.posting.port.UpdatePostingPort
import com.practice.hexagonal.domain.posting.exception.PostingUserNotSameException
import com.practice.hexagonal.infraStructure.global.annotation.useCase.UseCase
import com.practice.hexagonal.presentation.posting.dto.request.PostingUpdateReqDto

@UseCase
class UpdatePostingUseCase(
    private val updatePort: UpdatePostingPort,
    private val getOnePostingPort: GetOnePostingPort,
){
    fun execute(postingUpdateReqDto: PostingUpdateReqDto, id:String, writer: String){
        val one = getOnePostingPort.getOne(id)
        if(one.writer != writer)
            throw PostingUserNotSameException()
        updatePort.updatePosting(postingUpdateReqDto.toEntity(id, writer))
    }
}
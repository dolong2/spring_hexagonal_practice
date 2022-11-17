package com.practice.hexagonal.application.posting.usecase

import com.practice.hexagonal.application.posting.port.DeletePostingPort
import com.practice.hexagonal.application.posting.port.GetOnePostingPort
import com.practice.hexagonal.infraStructure.global.annotation.useCase.UseCase

@UseCase
class DeletePostingUseCase(
    private val deletePostingPort: DeletePostingPort,
    private val getOnePostingPort: GetOnePostingPort,
){
    fun execute(id: String, writer: String){
        val posting = getOnePostingPort.getOne(id)
        if(posting.writer != writer)
            throw RuntimeException()
        deletePostingPort.delete(posting)
    }
}
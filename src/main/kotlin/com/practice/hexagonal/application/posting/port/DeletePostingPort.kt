package com.practice.hexagonal.application.posting.port

import com.practice.hexagonal.domain.posting.Posting
import com.practice.hexagonal.infraStructure.repository.PostingRepository
import org.springframework.stereotype.Component

@Component
class DeletePostingPort(
    private val postingRepository: PostingRepository,
){
    fun delete(id: String) =
        postingRepository.deleteById(id)
    fun delete(posting: Posting) =
        postingRepository.delete(posting)
}
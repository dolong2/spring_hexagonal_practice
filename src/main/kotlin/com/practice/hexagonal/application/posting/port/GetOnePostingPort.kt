package com.practice.hexagonal.application.posting.port

import com.practice.hexagonal.domain.posting.Posting
import com.practice.hexagonal.infraStructure.repository.PostingRepository
import org.springframework.stereotype.Component

@Component
class GetOnePostingPort(
    private val postingRepository: PostingRepository,
){
    fun getOne(id: String): Posting =
        postingRepository.findById(id)
            .orElseThrow { throw RuntimeException() }
}
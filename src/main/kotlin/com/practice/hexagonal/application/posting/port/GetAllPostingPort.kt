package com.practice.hexagonal.application.posting.port

import com.practice.hexagonal.domain.posting.Posting
import com.practice.hexagonal.infraStructure.repository.PostingRepository
import org.springframework.stereotype.Component

@Component
class GetAllPostingPort(
    private val postingRepository: PostingRepository,
){
    fun getAll(): List<Posting> =
        postingRepository.findAll()
}
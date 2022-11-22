package com.practice.hexagonal.infraStructure.persistence.posting.adapter

import com.practice.hexagonal.application.posting.port.PostingPort
import com.practice.hexagonal.domain.posting.Posting
import com.practice.hexagonal.domain.posting.exception.PostingNotFindException
import com.practice.hexagonal.infraStructure.persistence.posting.repository.PostingRepository
import org.springframework.stereotype.Component
import java.lang.RuntimeException

@Component
class PostingPersistenceAdapter(
    private val postingRepository: PostingRepository,
): PostingPort{
    override fun write(posting: Posting) {
        postingRepository.save(posting)
    }

    override fun getAll(): List<Posting> =
        postingRepository.findAll()

    override fun getOne(id: String): Posting =
        postingRepository.findById(id)
            .orElseThrow { throw PostingNotFindException() }

    override fun delete(posting: Posting) =
        postingRepository.delete(posting)

    override fun updatePosting(newPosting: Posting) {
        postingRepository.save(newPosting)
    }
}
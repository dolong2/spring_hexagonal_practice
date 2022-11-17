package com.practice.hexagonal.application.posting.port

import com.practice.hexagonal.domain.posting.Posting
import com.practice.hexagonal.infraStructure.posting.repository.PostingRepository
import org.springframework.stereotype.Component

interface WritePostingPort{
    fun write(posting: Posting)
}
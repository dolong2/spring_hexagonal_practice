package com.practice.hexagonal.application.posting.port

import com.practice.hexagonal.domain.posting.Posting

interface UpdatePostingPort {
    fun updatePosting(newPosting: Posting)
}
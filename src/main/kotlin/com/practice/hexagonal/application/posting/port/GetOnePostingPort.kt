package com.practice.hexagonal.application.posting.port

import com.practice.hexagonal.domain.posting.Posting

interface GetOnePostingPort{
    fun getOne(id: String): Posting
}
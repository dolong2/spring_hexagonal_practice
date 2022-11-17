package com.practice.hexagonal.application.posting.port

import com.practice.hexagonal.domain.posting.Posting

interface GetAllPostingPort{
    fun getAll(): List<Posting>
}
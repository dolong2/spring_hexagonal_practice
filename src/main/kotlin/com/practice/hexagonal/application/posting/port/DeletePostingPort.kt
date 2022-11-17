package com.practice.hexagonal.application.posting.port

import com.practice.hexagonal.domain.posting.Posting

interface DeletePostingPort{
    fun delete(posting: Posting)
}
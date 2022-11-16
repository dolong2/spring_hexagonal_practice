package com.practice.hexagonal.infraStructure.repository

import com.practice.hexagonal.domain.posting.Posting
import org.springframework.data.jpa.repository.JpaRepository

interface PostingRepository: JpaRepository<Posting, String> {
}
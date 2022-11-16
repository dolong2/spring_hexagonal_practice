package com.practice.hexagonal.domain.posting

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Posting(
    @Id
    val id: String,
    val title: String,
    val content: String,
    val writer: String,
)
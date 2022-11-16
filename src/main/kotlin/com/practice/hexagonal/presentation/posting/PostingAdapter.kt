package com.practice.hexagonal.presentation.posting

import com.practice.hexagonal.application.posting.usecase.WritePostingUseCase
import com.practice.hexagonal.infraStructure.global.adapter.Adapter
import com.practice.hexagonal.presentation.posting.dto.request.PostingWriteReqDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Adapter
@RequestMapping("/posting")
class PostingAdapter(
    private val writePostingUseCase: WritePostingUseCase,
){
    @PostMapping
    fun writePosting(@RequestBody postingWriteReqDto: PostingWriteReqDto): ResponseEntity<Void>{
        writePostingUseCase.execute(postingWriteReqDto)
        return ResponseEntity.ok().build()
    }
}
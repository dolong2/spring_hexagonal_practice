package com.practice.hexagonal.presentation.posting

import com.practice.hexagonal.application.posting.usecase.DeletePostingUseCase
import com.practice.hexagonal.application.posting.usecase.GetAllPostingUseCase
import com.practice.hexagonal.application.posting.usecase.WritePostingUseCase
import com.practice.hexagonal.infraStructure.global.annotation.adapter.Adapter
import com.practice.hexagonal.presentation.posting.dto.request.PostingWriteReqDto
import com.practice.hexagonal.presentation.posting.dto.response.PostingListResDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping

@Adapter
@RequestMapping("/posting")
class PostingAdapter(
    private val writePostingUseCase: WritePostingUseCase,
    private val deletePostingUseCase: DeletePostingUseCase,
    private val getAllPostingUseCase: GetAllPostingUseCase,
){
    @PostMapping
    fun writePosting(@RequestBody postingWriteReqDto: PostingWriteReqDto): ResponseEntity<Void>{
        writePostingUseCase.execute(postingWriteReqDto)
        return ResponseEntity.noContent().build()
    }

    @DeleteMapping("/{id}")
    fun deletePosting(@PathVariable id: String, @RequestHeader writer: String): ResponseEntity<Void>{
        deletePostingUseCase.execute(id, writer)
        return ResponseEntity.ok().build()
    }

    @GetMapping
    fun getAllPosting(): ResponseEntity<PostingListResDto> =
        ResponseEntity.ok(getAllPostingUseCase.execute())
}
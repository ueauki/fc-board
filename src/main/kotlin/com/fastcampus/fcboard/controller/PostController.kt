package com.fastcampus.fcboard.controller

import com.fastcampus.fcboard.dto.PostReponse
import com.fastcampus.fcboard.dto.PostSearchRequest
import com.fastcampus.fcboard.dto.PostSummaryResponse
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posts")
class PostController {

    @PostMapping
    fun createBoard(
        @RequestBody postReponse: PostReponse
    ):ResponseEntity<String> {
        return ResponseEntity.ok("1")
    }

    @PutMapping("/{id}")
    fun updateBoard(
        @PathVariable id: Long,
        @RequestBody postReponse: PostReponse
    ):ResponseEntity<String> {
        return ResponseEntity.ok(id.toString())
    }

    @DeleteMapping("/{id}")
    fun deleteBoard(
        @PathVariable id: Long,
        @RequestParam createdBy: CreatedBy
    ): ResponseEntity<String> {
        return ResponseEntity.ok(
            id.toString() + createdBy
        )
    }

    @GetMapping("/{id}")
    fun findBoard(
        @PathVariable id: Long
    ):ResponseEntity<String> {
        return ResponseEntity.ok("content")
    }

    @GetMapping
    fun findBoardList(
        pageable: Pageable,
        searchRequest: PostSearchRequest
    ): Page<PostSummaryResponse> {
        return Page.empty()
    }
}

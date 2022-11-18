package com.practice.hexagonal.infraStructure.exception

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestControllerAdvice
class GlobalExceptionHandler {
    private val log = LoggerFactory.getLogger(this.javaClass.simpleName)
    @ExceptionHandler(BasicException::class)
    fun basicExceptionHandling(request: HttpServletRequest, response: HttpServletResponse, ex:BasicException): ResponseEntity<ErrorResponse> {
        log.error(request.requestURI)
        log.error(ex.message)
        ex.printStackTrace()
        val errorResponse = ErrorResponse(ex.errorCode.code, ex.errorCode.msg)
        return ResponseEntity(errorResponse, HttpStatus.valueOf(ex.errorCode.code))
    }
}
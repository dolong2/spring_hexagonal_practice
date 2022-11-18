package com.practice.hexagonal.infraStructure.exception

enum class ErrorCode(
    val code: Int,
    val msg: String,
){
    BAD_REQUEST(400, "잘못된 요청."),

    UNAUTHORIZED(401, "권한 없음."),
    USER_NOT_SAME(401, "유저가 일치하지 않음."),

    FORBIDDEN(403, "금지된 요청."),

    NOT_FOUND(404, "해당 리소스를 찾을수 없음."),
    POSTING_NOT_FIND(404, "포스팅을 찾을 수 없음."),
}
package com.practice.hexagonal.infraStructure.exception

open class BasicException(
    val errorCode: ErrorCode,
): RuntimeException()
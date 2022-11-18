package com.practice.hexagonal.domain.posting.exception

import com.practice.hexagonal.infraStructure.exception.BasicException
import com.practice.hexagonal.infraStructure.exception.ErrorCode

class PostingUserNotSameException: BasicException(
    ErrorCode.USER_NOT_SAME
)
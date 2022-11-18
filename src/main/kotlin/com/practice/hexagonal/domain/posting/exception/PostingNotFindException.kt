package com.practice.hexagonal.domain.posting.exception

import com.practice.hexagonal.infraStructure.exception.BasicException
import com.practice.hexagonal.infraStructure.exception.ErrorCode

class PostingNotFindException: BasicException(
    ErrorCode.POSTING_NOT_FIND
)
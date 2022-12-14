package com.practice.hexagonal.infraStructure.global.annotation.useCase

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(rollbackFor = [Exception::class], readOnly = true)
annotation class ReadOnlyUseCase()

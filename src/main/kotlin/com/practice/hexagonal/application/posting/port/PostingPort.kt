package com.practice.hexagonal.application.posting.port

interface PostingPort:
    WritePostingPort,
    GetAllPostingPort,
    GetOnePostingPort,
    DeletePostingPort,
    UpdatePostingPort
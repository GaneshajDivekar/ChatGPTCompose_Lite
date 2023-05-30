package com.chatgptlite.wanted.data.fake

import com.chatgptlite.wanted.models.MessageModel
import java.util.*

val fakeMessages: List<MessageModel> = listOf(
    MessageModel(
        question = "Who is Ganesh Divekar?",
        answer = "I'm Ganesh Divekar, currently working as the Manager of Mobile engg Team At Bajaj Finserv",
        createdAt = Date()
    ),
    MessageModel(
        question = "Who is lambiengcode?",
        answer = "I'm Devesh Tebrewal, currently working as the Byte Intern of Mobile engg Team At Bajaj Finserv",
        createdAt = Date()
    ),
)

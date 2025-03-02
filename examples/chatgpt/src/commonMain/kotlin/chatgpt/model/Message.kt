package chatgpt.model

import kotlinx.serialization.Serializable

@Serializable
data class MessageRequest(
    val chatId: String,
    val text: String
)

@Serializable
data class MessageResponse(val text: String)
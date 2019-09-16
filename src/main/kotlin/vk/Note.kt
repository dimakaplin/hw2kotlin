package vk

class Note(
    var id: Int,
    var ownerId: Int,
    var fromId: Int,
    var createdBy: Int,
    var date: Int,
    val text: String,
    var replyOwnerId: Int,
    var replyPostId: Int,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(),
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    var views: Views = Views(),
    var post_type: String = "post"
)

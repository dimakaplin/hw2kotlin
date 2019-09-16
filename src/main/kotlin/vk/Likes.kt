package vk

class Likes(
    count: Int = 0,
    var userLikes: Boolean = true,
    var canLike: Boolean = true,
    var canPublish: Boolean = true
): UsersManipulate(count)
package profile.model

class Profile (
    val id: Int,
    var login: String,
    var name: String,
    var firstName: String,
    var status: String,
    var avatar: String,
    var fullName: String = "$name $firstName"
)


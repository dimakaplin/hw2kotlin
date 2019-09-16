package profile

import profile.model.Profile

fun main() {
    val  pr = Profile( 123,
                    "Dima143",
                    "Dima",
                    "Kaplin",
                    "Life",
                    "/dd/dd")
    println(pr.fullName)
}
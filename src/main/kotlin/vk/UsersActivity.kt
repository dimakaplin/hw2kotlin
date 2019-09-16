package vk

open class UsersManipulate(var count: Int = 0) {
    fun create() {
        count++
        println(count)
    }
}
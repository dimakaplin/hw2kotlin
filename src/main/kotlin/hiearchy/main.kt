package hiearchy

import hiearchy.views.TextView
import hiearchy.views.ButtonView
import hiearchy.views.ViewGroup

fun main() {
    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened

    val main = ViewGroup()
    val title = TextView("Main Screen")
    println(title.text)

    val content = ViewGroup()
    val readMore = ButtonView("Read more")
    content.addView(readMore)
    content.view.click()
}
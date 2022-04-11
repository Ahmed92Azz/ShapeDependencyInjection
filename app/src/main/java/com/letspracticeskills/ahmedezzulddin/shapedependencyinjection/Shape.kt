package com.letspracticeskills.ahmedezzulddin.shapedependencyinjection

import javax.inject.Inject

class Shape @Inject constructor(val rectangle: Rectangle, val circle: Circle, val square: Square) {

    fun draw() {
        println("Drawing now...")
    }
}
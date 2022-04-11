package com.letspracticeskills.ahmedezzulddin.shapedependencyinjection

import dagger.Component

@Component
interface ShapeComponent {
    fun getShape(): Shape
}
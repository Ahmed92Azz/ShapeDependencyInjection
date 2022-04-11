package com.letspracticeskills.ahmedezzulddin.shapedependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val rectangle = Rectangle()
//        val circle = Circle()
//        val square = Square()
//
//        val shape = Shape(rectangle, circle, square)
//        shape.draw()

        val shape = DaggerShapeComponent.create().getShape()
        shape.draw()

    }
}





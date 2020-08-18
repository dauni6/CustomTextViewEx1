package com.dontsu.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customView = CustomView("무더위 물러가라",this@MainActivity)
        frameLayout.addView(customView)
    }
}

class CustomView(text: String, context: Context) : View(context) {
    val text: String = text

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //canvas는 그리기 도구이다. 그림판과 함께 그림을 그리기 위해 draw로 시작하는 메서드들이 제공된다.
        val paint = Paint()
        paint.color = Color.BLACK
        paint.textSize = 100f
        canvas?.drawText(text, 0f, 100f, paint)
    }

}
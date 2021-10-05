package ni.edu.uca.creacionvistas.modelo

import android.widget.ImageView
import android.widget.TextView
import ni.edu.uca.creacionvistas.R

class Triangulo (val numLados: Int) {
    fun escoger(): Int {
        return (1..numLados).random()
    }
}
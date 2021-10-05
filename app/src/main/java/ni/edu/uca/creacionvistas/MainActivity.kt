package ni.edu.uca.creacionvistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import ni.edu.uca.creacionvistas.modelo.Triangulo
import ni.edu.uca.creacionvistas.modelo.TriangulosR

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val elegir: Button = findViewById(R.id.btnGo)
        val tr = Triangulo()
        elegir.setOnClickListener {
            tr.Buscar()
        }
//Eduardo Gomez y Diana Marin


    }
    fun Buscar() {

        val lados = Triangulo(3)
        val escoger = lados.escoger()

        val respuesta = TextView = findViewById(R.id.Tnombre)
        respuesta.text = Triangulo.toString()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (escoger) {
            1 -> R.drawable.Equilatero
            2 -> R.drawable.Isosceles
            else -> R.drawable.Escaleno
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = escoger.toString()
    }
}

}




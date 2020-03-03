package acatictla.alan.netflix


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_pelicula.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_screen_inicio.*

class DetallePelicula : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)
        val bundle = intent.extras

        if (bundle != null) {
            detalle_img.setImageResource(bundle.getInt("header"))
            detalle_titulo.text = bundle.getString("titulo")
            titulo_sinopsis.text = bundle.getString("sinopsis")
        }
    }
}

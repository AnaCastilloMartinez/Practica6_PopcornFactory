package castillo.ana.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detalle_contenido.*


class DetalleContenido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_contenido)
        val bundle = intent.extras
        if (bundle !=null){
            this.iv_movie_imagen.setImageResource(bundle.getInt("header"))
            this.tv_name.setText(bundle.getString("name"))
            this.tv_sinopsis.setText(bundle.getString("sinopsis"))
        }
    }
}

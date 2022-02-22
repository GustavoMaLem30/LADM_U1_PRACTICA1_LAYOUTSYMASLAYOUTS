package mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts.databinding.ActivityFullscreenBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        receta.setOnClickListener(){
            val otraVentana = Intent (this,ScrollingActivity::class.java)
            startActivity(otraVentana)
        }
        recetaS.setOnClickListener(){
            val otraVentana = Intent (this,FullscreenActivity::class.java)
            startActivity(otraVentana)
        }
    }


}
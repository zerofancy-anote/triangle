package top.ntutn.drawtriangle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.ntutn.drawtriangle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
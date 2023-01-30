package uz.umarov.homework16_2_instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.umarov.homework16_2_instagram.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
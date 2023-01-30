package uz.umarov.homework16_2_instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import uz.umarov.homework16_2_instagram.bottom_fragments.firstbn
import uz.umarov.homework16_2_instagram.bottom_fragments.secondbn
import uz.umarov.homework16_2_instagram.bottom_fragments.thirdbn
import uz.umarov.homework16_2_instagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment(firstbn())
        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.homeNav -> {
                    loadFragment(firstbn())
                    true
                }
                R.id.likeNav -> {
                    loadFragment(secondbn())
                    true
                }
                R.id.myAccNav -> {
                    loadFragment(thirdbn())
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout,fragment)
        transaction.commit()
    }


}
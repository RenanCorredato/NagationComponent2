package com.renancorredato.componentesvisuaisnavegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.renancorredato.componentesvisuaisnavegacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupToolbar()
        setupBottomNavigationView()
    }

    private fun setupBottomNavigationView() {
        val navHostFragment = getNavHostFragment()
        binding.bottomNavigationView.setupWithNavController(navHostFragment.navController)

    }

    private fun setupToolbar() {
        val navHostFragment = getNavHostFragment()
        val appBarConfiguration = AppBarConfiguration(navHostFragment.navController.graph)
        binding.toolbar.setupWithNavController(navHostFragment.navController, appBarConfiguration)
    }

    private fun getNavHostFragment(): NavHostFragment = supportFragmentManager
        .findFragmentById(binding.fragmentContainerView.id)
            as NavHostFragment

}
package com.renancorredato.componentesvisuaisnavegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.renancorredato.componentesvisuaisnavegacao.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupActionBar()

    }

    private fun setupActionBar() {
        val navHostFragment = getNavHostFragment()
        appBarConfiguration = AppBarConfiguration(navHostFragment.navController.graph)
        setupActionBarWithNavController(navHostFragment.navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(binding.fragmentContainerView2.id)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun getNavHostFragment(): NavHostFragment = supportFragmentManager
        .findFragmentById(binding.fragmentContainerView2.id)
            as NavHostFragment
}
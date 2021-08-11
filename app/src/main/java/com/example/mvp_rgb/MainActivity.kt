package com.example.mvp_rgb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityContract.MainView {
    val presenter = MainActivityPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         btRed.setOnClickListener { presenter.showRedFragment() }
         btGreen.setOnClickListener { presenter.showGreenFragment() }
         btBlue.setOnClickListener { presenter.showBlueFragment() }
    }

    override fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flFragment, fragment)
            .commit()
    }

    override fun updateTopMenu(enumItem: Int) {

    }
}
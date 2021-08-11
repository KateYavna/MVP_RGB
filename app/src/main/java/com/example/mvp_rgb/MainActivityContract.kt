package com.example.mvp_rgb

import androidx.fragment.app.Fragment

class MainActivityContract {
    interface MainView{
        fun setFragment(fragment: Fragment)
        fun updateTopMenu(enumItem: Int)
    }
    interface RedFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface GreenFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface BlueFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface Presenter{
        fun getDbData()
        fun getServerData()
        fun showRedFragment()
        fun showGreenFragment()
        fun showBlueFragment()
    }
}
package com.example.mvp_rgb

class MainActivityPresenter (val mainView: MainActivityContract.MainView): MainActivityContract.Presenter  {

    override fun getDbData() {

    }
    override fun getServerData() {

    }

    override fun showRedFragment() {
        val fragment = RedFragment.newInstance("", "")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showGreenFragment() {
        val fragment = GreenFragment.newInstance("", "")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showBlueFragment() {
        val fragment = BlueFragment.newInstance("", "")
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }


}
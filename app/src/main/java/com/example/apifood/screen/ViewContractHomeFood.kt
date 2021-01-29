package com.example.apifood.screen

import com.example.apifood.data.model.Food
import com.example.apifood.utils.BasePresenter
import java.lang.Exception

interface ViewContractHomeFood {

    interface View {
        fun onGetViewSuccess(foods: MutableList<Food>)
        fun onError(exception: Exception?)
    }

    interface Presenter : BasePresenter<View> {
        fun getMovie()
    }
}

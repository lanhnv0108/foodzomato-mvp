package com.example.apifood.data.source

import com.example.apifood.data.model.Food
import com.example.apifood.data.source.remote.OnFetchDataListener

interface FoodDataSource {

    interface Local
    interface Remote {
        fun getFood(listener: OnFetchDataListener<MutableList<Food>>)
    }
}

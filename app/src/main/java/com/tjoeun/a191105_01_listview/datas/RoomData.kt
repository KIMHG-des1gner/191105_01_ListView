package com.tjoeun.a191105_01_listview.datas

import android.util.Log

class RoomData(price:Int, adress:String, floor:Int) {


    var price:Int = 0
    var adress:String = ""
    var floor:Int = 1 // 음수 : 지하. -층 : 지하1층 0층 : 반지하

    init {
        this.price = price
        this.adress = adress
        this.floor = floor

    }

    constructor() : this(0, "미입력" 0) {
        Log.d("룸데이터", "보조생성자(빈칸) 호출")

    }

    constructor(adress: String) : this (-1, address, -1) {
        Log.d("룸데이터", "보조생성자(빈칸) 호출")

    }

}
package com.tjoeun.a191105_01_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a191105_01_listview.adapters.RoomDataAdapter
import com.tjoeun.a191105_01_listview.datas.RoomData

class MainActivity : AppCompatActivity() {

    var roomList = ArrayList<RoomData>()
    var roomAdapter:RoomDataAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRooms()

        roomAdapter = RoomDataAdapter(this,R.layout.room_list_item, roomList)

        roomListView.adapter = roomAdapter

    }

//  Ex. 두 숫자(인자)의 합계를 리턴(Int)해주는 함수 생성.



    fun sum(num1:Int, num2:Int) = num1 + num2


    fun addRooms() {

        var room1 = RoomData()
        room1.price = 8000
        room1.adress = "마포구 서교동"
        room1.floor = 1
        roomList.add(room1)


        var room2 = RoomData()
        room2.price = 28500
        room2.adress = "마포구 서교동"
        room2.floor = 3
        roomList.add(room2)


        var room3 = RoomData()
        room3.price = 12000
        room3.adress = "마포구 성산동"
        room3.floor = 5
        roomList.add(room3)

        var room4 = RoomData( 0,"마포구 망원3동", 3)
        roomList.add(room4)

        roomList.add(RoomData (15000, "마포구 망원동", 2))

        roomList.add(RoomData ("은평구 불광동"))

    }

}

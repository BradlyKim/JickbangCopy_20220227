package com.neppplus.jickbangcopy_20220227

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20220227.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

//        RoomData, MainActivity 에서 만든 Serializable -> RoomData 로 가져다쓰는 명령어
        val roomData = intent.getSerializableExtra("room") as RoomData

//        activity_view_room_detail 에서 자료를 가져와야 함.
        txtPrice.text = roomData.getFormattedPrice()
        txtDescription.text = roomData.description
        txtAddress.text = roomData.address
        txtFloor.text = roomData.getFormattedFloor()

    }
}
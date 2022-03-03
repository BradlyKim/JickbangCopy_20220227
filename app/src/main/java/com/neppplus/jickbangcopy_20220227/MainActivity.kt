package com.neppplus.jickbangcopy_20220227

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20220227.adapters.RoomAdapter
import com.neppplus.jickbangcopy_20220227.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    ListView 사용법 메뉴얼 -> 5번 항목 작업 1
    val mRoomList = ArrayList<RoomData>()

    //    ListView 사용법 메뉴얼 -> 6번 항목 작업 1
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //    ListView 사용법 메뉴얼 -> 5번 항목 작업 2
        mRoomList.add( RoomData(8000, "서울시 동대문구", 7, "1번째 방입니다.") )
        mRoomList.add( RoomData(15000, "서울시 동대문구", 10, "2번째 방입니다.") )
        mRoomList.add( RoomData(27000, "서울시 동대문구", 17, "3번째 방입니다.") )
        mRoomList.add( RoomData(6500, "서울시 중랑구", -1, "4번째 방입니다.") )
        mRoomList.add( RoomData(3800, "서울시 서대문구", 0, "5번째 방입니다.") )
        mRoomList.add( RoomData(5000, "서울시 강남구", -2, "6번째 방입니다.") )
        mRoomList.add( RoomData(5500, "서울시 강북구", 5, "7번째 방입니다.") )
        mRoomList.add( RoomData(10000, "서울시 송파구", 11, "8번째 방입니다.") )
        mRoomList.add( RoomData(8500, "서울시 강동구", 12, "9번째 방입니다.") )
        mRoomList.add( RoomData(3000, "서울시 노원구", 1, "10번째 방입니다.") )

        //    ListView 사용법 메뉴얼 -> 6번 항목 작업 2
        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

    }
}
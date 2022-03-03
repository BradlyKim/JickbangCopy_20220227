package com.neppplus.jickbangcopy_20220227.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy_20220227.R
import com.neppplus.jickbangcopy_20220227.datas.RoomData

class RoomAdapter(
    val mContext : Context,
    val resdId : Int,
    val mList : ArrayList<RoomData>,
) : ArrayAdapter<RoomData>(mContext, resdId, mList ) {   //  ctrl + P => 지원 생성자 목록조회


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {

            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)

        }

        val row = tempRow!!

        return row

//        여기까지가 room_list_item 생성한 1목록을 어댑터에 담아두는 코드임.

    }

}
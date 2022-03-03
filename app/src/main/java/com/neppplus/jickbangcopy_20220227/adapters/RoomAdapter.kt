package com.neppplus.jickbangcopy_20220227.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.jickbangcopy_20220227.datas.RoomData

class RoomAdapter(
    val mContext : Context,
    val resdId : Int,
    val mList : ArrayList<RoomData>,
) : ArrayAdapter<RoomData>(mContext, resdId, mList ) {
}
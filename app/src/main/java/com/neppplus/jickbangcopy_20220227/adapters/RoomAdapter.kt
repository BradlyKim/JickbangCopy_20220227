package com.neppplus.jickbangcopy_20220227.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jickbangcopy_20220227.R
import com.neppplus.jickbangcopy_20220227.datas.RoomData
import org.w3c.dom.Text

//    ListView 사용법 메뉴얼 -> 4번 항목 작업
class RoomAdapter(
    val mContext : Context,
    resdId : Int,
    val mList : ArrayList<RoomData>,
) : ArrayAdapter<RoomData>(mContext, resdId, mList ) {   //  ctrl + P => 지원 생성자 목록조회


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {

            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)

        }

        val row = tempRow!!

//        여기까지가 (아래 return row 포함) room_list_item 생성한 1목록을 어댑터에 담아두는 코드임.

//    ListView 사용법 메뉴얼 -> 7번 항목 작업
        val data = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressFloor = row.findViewById<TextView>(R.id.txtAddressFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)


        //        RoomData.kt 에서 만든 함수 반영
        txtPrice.text = data.getFormattedPrice()
        
//        RoomData.kt 에서 만든 함수 반영
        txtAddressFloor.text = "${data.address}, ${data.getFormattedFloor()}"
        txtDescription.text = data.description

        return row


    }

}
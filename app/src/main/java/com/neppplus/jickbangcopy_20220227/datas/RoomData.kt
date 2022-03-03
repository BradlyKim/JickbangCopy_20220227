package com.neppplus.jickbangcopy_20220227.datas

import android.icu.text.NumberFormat
import java.util.*

//   ListView 사용법 메뉴얼 -> 3번 항목 작업
//   하나의 방 -> 가격, 행정구역, 층수, 설명문구 멤버변수로

class RoomData(

    val price : Int,
    val address : String,
    val floor : Int,
    val description : String,

) {
    
//    ListView 사용법 메뉴얼 ->  7번3) 데이터 가공 함수 작업
//    층수값 => "1층, 반지하, 지하1층" 형태로 가공 함수
    fun getFormattedFloor() : String {

        val floorStr : String

        if (floor > 0){
            floorStr = "${floor}층"
        }
        else if (floor == 0) {
            floorStr = "반지하"
        }
        else {
            floorStr = "지하 ${ -floor }층"
        }
        return floorStr

    }
    
//    가격값 => "8,500", "2억3,500" 형태로 가공 함수

    fun getFormattedPrice() : String {

        if (price < 10000) {

//            구글링해서 쉼표찍는 법 검색 "android int comma"
            val formattedPrice = java.text.NumberFormat.getNumberInstance(Locale.KOREA).format(price)

            return formattedPrice

        }
        else {

//            26500 / 10000 = 2  나눗셈은 몫을 구하는 공식이다. => "2억 6,500" 변경 함수
            val uk = price / 10000
            val leftNumber = price % 10000
            val formattedLeftNumber = java.text.NumberFormat.getNumberInstance(Locale.KOREA).format(leftNumber)

            return "${uk}억 ${formattedLeftNumber}"
        }

    }
    
}
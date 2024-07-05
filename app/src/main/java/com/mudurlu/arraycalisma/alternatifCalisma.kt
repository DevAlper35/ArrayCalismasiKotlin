package com.mudurlu.arraycalisma

fun main(){

    /*
    val arrayOrnegi = arrayOf("Ali","Ahmet","Mehmet","Hamza")

    arrayOrnegi.map {
        println(it)
    }


    val yemekKaloriMap = hashMapOf<String, Int>()
    // Key String, Value Int olsun dedik

    yemekKaloriMap.put("Elma",100)
    yemekKaloriMap.put("Armut",150)
    yemekKaloriMap.put("Karpuz",800)


    println(yemekKaloriMap["Armut"])
*/


    val mapOrnek = mapOf<Int,String>(
        1 to "Ahmet",
        2 to "Mahmet",
        3 to "Ahiret",
        4 to "Mehmet",
        5 to "Alper"
        )

    print(mapOrnek.keys)
    print(mapOrnek.values)
    println(mapOrnek[4])



}
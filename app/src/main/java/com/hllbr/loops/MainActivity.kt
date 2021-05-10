package com.hllbr.loops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Loops
        //For Loop

        var myArrayNumbers = arrayOf(12,15,18,21,24,27,30,33,36,39)
        var q = myArrayNumbers[0] /3 * 5
        println(q)

        for(number in myArrayNumbers){
            var z = number / 3 * 5
            println(z)
        }
        println("*********************************************************************************")
        for(i in myArrayNumbers.indices){
            //indices bize tek tek indexleri veriyor çok kullanılan bir yöntem değil
            var qz = myArrayNumbers[i] /3 * 5
            println(qz)
        }
        //For dizilerle kullanım açısından çok elverişlidir.Sadece dizilerle kullanılmazlar farklı kullanım alanlarıda mevcuttur
        println("*********************************************************************************")
        for(b in 0..9){
            println(b)
        }
        println("*********************************************************************************")

        val myStringList = ArrayList<String>()
        myStringList.add("hllbr")
        myStringList.add("HALIL")
        myStringList.add("IBRAHIM")
        myStringList.add("KOCAK")
        for(str in myStringList){
            println(str)
        }
        //bu işlemin for each yapısından hiçbir farkı yok
        println("*********************************************************************************")

        myStringList.forEach { println(it) }

        //While Loop

        /*
        For loop temelinde ne kadar eleman varsa o kadar işlem yap gibi bir mantığa sahip fakat while() yapsında bu işlem biraz daha farklı işlemin ne zaman biteceğine biz karar veriyoruz diyebiliriz
        örneğin bir j değerin olsun 10 değerinden küçük olduğu sürece bir işlemin sürekli olarak tekrarlanmasını istiyorum
        yada bir boolean değerim var ve true olarak ifade etmişim false olana kadar işlemin devam etmesini istiyorum şeklinde ifade eebilirim

         */
        println("*********************************************************************************")
        println("While Loop")
        var j = 0
        while (j <10){
            println(j)
            j++
        }
        //while döngülerinde en çok dikkat edilmesi gereken unsur yapının sonsuz döngüde kalmasıdır.Bunu önüne geçmessek app çöker bu sebeple bir noktada döngüyü kesmek gerekiyor.

    }
}
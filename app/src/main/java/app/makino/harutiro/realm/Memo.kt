package app.makino.harutiro.realm

import io.realm.RealmObject

open class Memo ( //メモのクラスを定義 //openを書くのはRealmを使う際に必要
    open var title: String = "",  //保存するデータの要素となる変数を定義する
    open var content:String = ""
):RealmObject() //RealmObjectという方を継承している部分 メモというクラスをRealmで保存できる型にすることができる
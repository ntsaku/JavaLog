package com.example.naosan.javalog;

import android.util.Log;

/**
 * Created by NAOSAN on 2016/08/01.
 */
public class Human extends Animal implements Thinkable {

    String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは人間クラスです。");
    }

    // メンバ関数

    public void say() {
        Log.d("javatest", "私の名前は" +  this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" +  this.hobby + "について考える");
    }
}

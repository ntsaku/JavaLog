package com.example.naosan.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Human human = new Human("桜井", 54, "プロ野球");
        Human daughter = new Human("娘", 15, "高校受験");

        human.say();
        human.think();

        daughter.say();
        daughter.think();

    }
}

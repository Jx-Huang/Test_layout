package com.example.administrator.test_layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button to_LinearLaout_button = findViewById(R.id.To_LinearLayout);  //跳转到线性布局的按钮
        Button to_ConstraintLayout_button = findViewById(R.id.To_ConstraintLayout);     //跳转到相对布局的按钮
        Button to_TableLayout_button = findViewById(R.id.To_TableLayout);       //跳转到表格布局的按钮

        to_LinearLaout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //实现跳转功能
                Intent intent = new Intent(MainActivity.this,
                        Show_LinearLayout_Activity.class);
                startActivity(intent);
            }
        });
        to_ConstraintLayout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //实现跳转功能
                Intent intent = new Intent(MainActivity.this,
                        Shouw_ConstraintLayout_Activity.class);
                startActivity(intent);
            }
        });
        to_TableLayout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //实现跳转功能
                Intent intent = new Intent(MainActivity.this,
                        Show_TableLayout_Activity.class);
                startActivity(intent);
            }
        });
    }
}

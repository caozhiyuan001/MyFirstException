package com.example.myfirstexception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//MainActiveity(用来编写控件的功能)
//res/layout/activity_main.xml(用来控制界面以及添加控件类型)
public class MainActivity extends AppCompatActivity {
    //    求和按钮
    Button button1;
    //    结果
    TextView t1;
    //    两个输入
    EditText e1, e2;
    Boolean aa = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) this.findViewById(R.id.textView5);
        e1 = (EditText) this.findViewById(R.id.editText);
        e2 = (EditText) this.findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new L1());
    }

    class L1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            String inputText1 = e1.getText().toString();
            String inputText2 = e2.getText().toString();
            try {
                int num1 = Integer.valueOf(inputText1).intValue();
                int num2 = Integer.valueOf(inputText2).intValue();
                num1 = num1 + num2;
                inputText1 = String.valueOf(num1);
                t1.setText(inputText1);
            } catch (Exception e) {
                t1.setText("输入不合法");
            }


        }
    }
}

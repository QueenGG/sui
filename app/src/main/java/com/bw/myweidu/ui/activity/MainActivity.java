package com.bw.myweidu.ui.activity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.bw.myweidu.R;

public class MainActivity extends AppCompatActivity {

    private Button button_ui;
    private TextView text_is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_ui = findViewById(R.id.button_ui);
        text_is = findViewById(R.id.text_is);

        button_ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text_is.getText().toString();

            }
        });

    }

}

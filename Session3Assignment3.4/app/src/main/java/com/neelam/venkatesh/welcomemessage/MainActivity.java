package com.neelam.venkatesh.welcomemessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        EditText etText1 = (EditText) findViewById(R.id.etText1);
        EditText etText2 = (EditText) findViewById(R.id.etText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
                intent1.putExtra("UserName", "Neelam");
                intent1.putExtra("Password", "1234");
                startActivity(intent1);

            }
        });

    }
}

package com.example.streetreport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView img_addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_addButton = (ImageView) findViewById(R.id.add_button);

        img_addButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);  //카메라실행
//                startActivity(intent);

            final Intent intent = new Intent(getApplicationContext(), ShareActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
                finish();
            }
        });
    }



}

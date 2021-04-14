package com.example.inbetween;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HowToPlay extends AppCompatActivity {
    Button buttonmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
        buttonmain=findViewById(R.id.BTN_mainmenu);

        buttonmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainmenu();
            }
        });
    }
    public void mainmenu(){
        Intent intent=new Intent (this,InBetweenIntro.class);
        startActivity(intent);

}
}
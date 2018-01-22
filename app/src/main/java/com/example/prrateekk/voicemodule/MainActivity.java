package com.example.prrateekk.voicemodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void speak(View v) {
        EditText eText = (EditText) findViewById(R.id.editText);
        String text = eText.getText().toString();
        TextToSpeechModule ttsm = new TextToSpeechModule(text, getApplicationContext());
    }
}

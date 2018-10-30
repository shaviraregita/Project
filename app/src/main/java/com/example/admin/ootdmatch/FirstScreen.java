package com.example.admin.ootdmatch;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstscreen);
    }
    public void Pindah(View view) {
        Intent intent = new Intent(FirstScreen.this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}

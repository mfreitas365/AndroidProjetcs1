package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


public void onItemClick(View view, int position) {
    Intent packageContent = null;
    Intent intent;
    intent = new Intent(null MainActivity.this, ProductActivity.Class);
    intent.putExtra(name: "produto", produtoList.get(position));
    startActivity(intent);

}

    private void startActivity() {
    }

}







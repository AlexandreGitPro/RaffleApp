package br.alexdev.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chooseNumber(View view){
        TextView textView = findViewById(R.id.textView3);
        int number = new Random().nextInt(11);

        textView.setText("Número: " + number);
    }
}
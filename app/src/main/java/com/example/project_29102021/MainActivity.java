package com.example.project_29102021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textOutput;
    EditText textInput;
    Button applyTextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = findViewById(R.id.text_input);
        textOutput = findViewById(R.id.text_output);
        applyTextBtn = findViewById(R.id.apply_text_btn);

        applyTextBtn.setOnClickListener((View v) -> {
            Editable text = textInput.getText();
            if (text.length() == 0) showEmptyTextFieldToast();
            else textOutput.setText(textInput.getText());
        });
    }

    void showEmptyTextFieldToast() {
        Toast.makeText(this, "Text field can not be empty", Toast.LENGTH_LONG).show();
    }
}
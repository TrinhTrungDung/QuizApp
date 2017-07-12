package com.example.brucewayne.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        int score = 0;
        String name = ((EditText) findViewById(R.id.name)).getText().toString();
        CheckBox checkBoxQuiz1B = (CheckBox) findViewById(R.id.ans_b_quiz_1);
        CheckBox checkBoxQuiz1C = (CheckBox) findViewById(R.id.ans_c_quiz_1);
        RadioButton radioButton2A = (RadioButton) findViewById(R.id.ans_a_quiz_2);
        RadioButton radioButton3D = (RadioButton) findViewById(R.id.ans_d_quiz_3);
        EditText editText4 = (EditText) findViewById(R.id.ans_quiz_4);

        if (checkBoxQuiz1B.isChecked() && checkBoxQuiz1C.isChecked()) {
            score += 1;
        }

        if (radioButton2A.isChecked()) {
            score += 1;
        }

        if (radioButton3D.isChecked()) {
            score += 1;
        }

        if (editText4.getText().toString().equals("4")) {
            score += 1;
        }

        // display message after submitting
        if (score > 3) {
            Toast.makeText(getApplicationContext(),
                    "Congratulations " + name + "! You have a perfect score",
                    Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(),
                    "Your score is: " + score + "\nBetter luck next time :)",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
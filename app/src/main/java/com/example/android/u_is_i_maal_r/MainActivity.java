package com.example.android.u_is_i_maal_r;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    double Uwaarde;
    double Iwaarde;
    double Rwaarde;

    public void calculate(View view) {
        EditText uEditText = findViewById(R.id.uTextView);
        String uString = uEditText.getText().toString();
        double uDouble = Double.parseDouble(uString);

        EditText iEditText = findViewById(R.id.iTextView);
        String iString = iEditText.getText().toString();
        double iDouble = Double.parseDouble(iString);

        EditText rEditText = findViewById(R.id.rTextView);
        String rString = rEditText.getText().toString();
        double rDouble = Double.parseDouble(rString);

        if (uDouble != 0) {
            if (iDouble != 0) {
                if (rDouble == 0) {
                    double rAnswer = uDouble / iDouble;
                    displayAnswer(rAnswer);
                }
            }
        }

        if (uDouble != 0) {
            if (rDouble != 0) {
                if (iDouble == 0) {
                    double iAnswer = uDouble / rDouble;
                    displayAnswer(iAnswer);
                }
            }
        }

        if (iDouble != 0) {
            if (rDouble != 0) {
                if (uDouble == 0) {
                    double uAnswer = iDouble * rDouble;
                    displayAnswer(uAnswer);
                }
            }
        }


    }

    public void displayAnswer(double answer) {
        TextView answerText = findViewById(R.id.answerTextView);
        String answerString = Double.toString(answer);
        answerText.setText(answerString);

    }
}

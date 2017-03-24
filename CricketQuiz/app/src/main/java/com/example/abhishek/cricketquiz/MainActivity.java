package com.example.abhishek.cricketquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String answer1;
    String answer3;
    String answer4;
    String answer5;
    String answer6;
    String resultMsg;
    int score;

    RadioGroup radioAnswerGroup;
    RadioButton radioAnswerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = getString(R.string.ans_1);
        answer3 = getString(R.string.ans_1);
        answer4 = getString(R.string.ans_4);
        answer5 = getString(R.string.ans_5);
        answer6 = getString(R.string.ans_6);
    }


    /**
     * This function is called on the submit button is clicked
     */
    public void submitQuiz(View view) {

        // Gets which Radio button is clicked

        radioAnswerGroup = (RadioGroup) findViewById(R.id.answer_1);
        int selectedId = radioAnswerGroup.getCheckedRadioButtonId();
        radioAnswerButton = (RadioButton) findViewById(selectedId);

        // Gets which all CheckBox is checked

        CheckBox option1Checkbox = (CheckBox) findViewById(R.id.option1_ans2);
        boolean hasOption1 = option1Checkbox.isChecked();

        CheckBox option2Checkbox = (CheckBox) findViewById(R.id.option2_ans2);
        boolean hasOption2 = option2Checkbox.isChecked();

        CheckBox option3Checkbox = (CheckBox) findViewById(R.id.option3_ans2);
        boolean hasOption3 = option3Checkbox.isChecked();

        CheckBox option4Checkbox = (CheckBox) findViewById(R.id.option4_ans2);
        boolean hasOption4 = option4Checkbox.isChecked();


        // Get the value of edit text for answer3 and stores it

        EditText ans3Text = (EditText) findViewById(R.id.answer_3);
        String userAnswer3 = ans3Text.getText().toString();
        userAnswer3.trim();

        // Get the value of edit text for answer4 and stores it

        EditText ans4Text = (EditText) findViewById(R.id.answer_4);
        String userAnswer4 = ans4Text.getText().toString();
        userAnswer4.trim();

        // Get the value of edit text for answer5 and stores it

        EditText ans5Text = (EditText) findViewById(R.id.answer_5);
        String userAnswer5 = ans5Text.getText().toString();
        userAnswer5.trim();

        // Get the value of edit text for answer6 and stores it

        EditText ans6Text = (EditText) findViewById(R.id.answer_6);
        String userAnswer6 = ans6Text.getText().toString();
        userAnswer6.trim();

        //Matches the answer for question 1

        try{
            if(radioAnswerButton.getText().equals(answer1)){
                resultMsg = "" + "answer1 : correct\n";
                score++;
            }
            else
                resultMsg = "" + "answer1 : incorrect\n";

        }catch (Exception e){
            e.printStackTrace();
        }

        //Matches the answer for question 2

        if (hasOption1 && hasOption2 && hasOption3 && !hasOption4) {
            resultMsg = resultMsg + "answer2 : correct\n";
            score++;
        }
        else
            resultMsg = resultMsg + "answer2 : incorrect\n";

        //Matches the answer for question 3

        if (userAnswer3.equalsIgnoreCase(answer3)) {
            resultMsg = resultMsg + "answer3 : correct\n";
            score++;
        }
        else
            resultMsg = resultMsg + "answer3 : incorrect\n";

        //Matches the answer for question 4

        if (userAnswer4.equalsIgnoreCase(answer4)) {
            resultMsg = resultMsg + "answer4 : correct\n";
            score++;
        }
        else
            resultMsg = resultMsg + "answer4 : incorrect\n";

        //Matches the answer for question 5

        if (userAnswer5.equalsIgnoreCase(answer5)) {
            resultMsg = resultMsg + "answer5 : correct\n";
            score++;
        }
        else
            resultMsg = resultMsg + "answer5 : incorrect\n";

        //Matches the answer for question 6

        if (userAnswer6.equalsIgnoreCase(answer6)) {
            resultMsg = resultMsg + "answer6 : correct\n";
            score++;
        }
        else
            resultMsg = resultMsg + "answer6 : incorrect\n";

        Toast.makeText(MainActivity.this,"Score : " + score + "\n\n" + resultMsg, Toast.LENGTH_LONG).show();

        resultMsg = "";
        score = 0;
    }
}

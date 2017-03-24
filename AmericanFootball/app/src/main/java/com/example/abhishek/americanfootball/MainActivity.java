package com.example.abhishek.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Update the score of Seattle Seahawks by 3 points
     */
    public void addThreePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Update the score of Seattle Seahawks by 6 points
     */
    public void addSixPointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Update the score of Seattle Seahawks by 1 points
     */
    public void addOnePointForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Update the score of Seattle Seahawks by 2 points
     */
    public void addTwoPointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Update the score of Seattle Green Bay Packers by 3 points
     */
    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Update the score of Seattle Green Bay Packers by 6 points
     */
    public void addSixPointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Update the score of Seattle Green Bay Packers by 1 points
     */
    public void addOnePointForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Update the score of Seattle Green Bay Packers by 2 points
     */
    public void addTwoPointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the score for team Seattle Seahawks
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for team Green Bay Packers
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the score to 0 for both the team
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

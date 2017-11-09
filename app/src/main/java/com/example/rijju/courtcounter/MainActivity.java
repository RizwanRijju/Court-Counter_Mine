package com.example.rijju.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int undoA = 0;
    int undoB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    public void points3A(View view) {
        scoreA=scoreA+3;
        undoA = 3;
        displayForTeamA(scoreA);
    }

    public void points2A(View view) {
        scoreA=scoreA+2;
        undoA = 2;
        displayForTeamA(scoreA);
    }

    public void freeThrowA(View view) {
        scoreA=scoreA+1;
        undoA = 1;
        displayForTeamA(scoreA);
    }

    public void undoA(View view) {
        scoreA=scoreA - undoA;
        undoA = 0;
        displayForTeamA(scoreA);
    }

    public void points3B(View view) {
        scoreB=scoreB+3;
        undoB = 3;
        displayForTeamB(scoreB);
    }

    public void points2B(View view) {
        scoreB=scoreB+2;
        undoB = 2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View view) {
        scoreB=scoreB+1;
        undoB = 1;
        displayForTeamB(scoreB);
    }
    public void undoB(View view) {
        scoreB=scoreB - undoB;
        undoB = 0;
        displayForTeamB(scoreB);
    }

    public void reset(View view) {
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}

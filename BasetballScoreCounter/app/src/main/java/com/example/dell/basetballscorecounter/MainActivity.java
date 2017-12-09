package com.example.dell.basetballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreeForA(View view){
        scoreTeamA += 3;
        displayScoreA(scoreTeamA);
    }

    public void plusTwoForA(View view){
        scoreTeamA += 2;
        displayScoreA(scoreTeamA);
    }

    public void freeThrowA(View view){
        scoreTeamA++;
        displayScoreA(scoreTeamA);
    }

    public  void displayScoreA(int i){
        TextView scoreA=(TextView) findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(i));
    }

    public void plusThreeForB(View view){
        scoreTeamB += 3;
        displayScoreB(scoreTeamB);
    }

    public void plusTwoForB(View view){
        scoreTeamB += 2;
        displayScoreB(scoreTeamB);
    }

    public void freeThrowB(View view){
        scoreTeamB++;
        displayScoreB(scoreTeamB);
    }

    public  void displayScoreB(int i){
        TextView scoreB=(TextView) findViewById(R.id.scoreB);
        scoreB.setText(String.valueOf(i));
    }

    public void resetScores(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }
}

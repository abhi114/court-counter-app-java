package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA =0;
    int foulTeamA=0;
    int scoreTeamB =0;
    int foulTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ScoreForA(View view){
        scoreTeamA =scoreTeamA+1;
        displayScoreForTeamA(scoreTeamA);
    }
    public void scoreForB(View view){
        scoreTeamB =scoreTeamB+1;
        displayScoreForTeamB(scoreTeamB);
    }
    public void  foulForA(View view){
        foulTeamA = foulTeamA+1;
        displayFoulForTeamA(foulTeamA);
    }

    public void  foulForB(View view){
        foulTeamB = foulTeamB+1;
        displayFoulForTeamB(foulTeamB);
    }

    public void resetScore(View view){
        scoreTeamA=0;
        foulTeamA=0;
        foulTeamB=0;
        scoreTeamB=0;
        displayScoreForTeamA(scoreTeamA);
        displayFoulForTeamA(foulTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulForTeamB(foulTeamB);

    }


    public void displayScoreForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayFoulForTeamA(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));

    }
    public void displayFoulForTeamB(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));

    }


}

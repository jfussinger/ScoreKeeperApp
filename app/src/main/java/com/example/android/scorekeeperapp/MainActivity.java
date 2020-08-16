package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForCincinnatiBengals = 0;

    int scoreForSanFrancisco49ers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForCincinnatiBengals(scoreForCincinnatiBengals);
    }

    /**
     * Increases the score for Cincinnati Bengals by 7 points.
     */

    public void addSevenForCincinnatiBengals(View view) {
        scoreForCincinnatiBengals = (scoreForCincinnatiBengals + 7);
        displayForCincinnatiBengals(scoreForCincinnatiBengals);
    }

    /**
     * Increases the score for Cincinnati Bengals by 3 points.
     */

    public void addThreeForCincinnatiBengals(View view) {
        scoreForCincinnatiBengals = (scoreForCincinnatiBengals + 3);
        displayForCincinnatiBengals(scoreForCincinnatiBengals);
    }

    /**
     * Increases the score for Cincinnati Bengals by 2 points.
     */

    public void addTwoForCincinnatiBengals(View view) {
        scoreForCincinnatiBengals = (scoreForCincinnatiBengals + 2);
        displayForCincinnatiBengals(scoreForCincinnatiBengals);
    }

    /**
     * Increases the score for Cincinnati Bengals by 1 points.
     */

    public void addOneForCincinnatiBengals(View view) {
        scoreForCincinnatiBengals = (scoreForCincinnatiBengals + 1);
        displayForCincinnatiBengals(scoreForCincinnatiBengals);
    }

    /**
     * Displays the given score for Cincinati Bengals.
     */
    public void displayForCincinnatiBengals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreForCincinnatiBengals);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increases the score for San Francisco 49ers by 7 points.
     */

    public void addSevenForSanFrancisco49ers(View view) {
        scoreForSanFrancisco49ers = (scoreForSanFrancisco49ers + 7);
        displayForSanFrancisco49ers(scoreForSanFrancisco49ers);
    }

    /**
     * Increases the score for San Francisco 49ers by 3 points.
     */

    public void addThreeForSanFrancisco49ers(View view) {
        scoreForSanFrancisco49ers = (scoreForSanFrancisco49ers + 3);
        displayForSanFrancisco49ers(scoreForSanFrancisco49ers);
    }

    /**
     * Increases the score for San Francisco 49ers by 2 points.
     */

    public void addTwoForSanFrancisco49ers(View view) {
        scoreForSanFrancisco49ers = (scoreForSanFrancisco49ers + 2);
        displayForSanFrancisco49ers(scoreForSanFrancisco49ers);
    }

    /**
     * Increases the score for San Francisco 49ers by 1 points.
     */

    public void addOneForSanFrancisco49ers(View view) {
        scoreForSanFrancisco49ers = (scoreForSanFrancisco49ers + 1);
        displayForSanFrancisco49ers(scoreForSanFrancisco49ers);
    }

    /**
     * Displays the given score for San Francisco 49ers.
     */
    public void displayForSanFrancisco49ers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreForSanFrancisco49ers);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both teams back to 0.
     */

    public void resetScore(View view) {
        scoreForCincinnatiBengals = 0;
        scoreForSanFrancisco49ers = 0;
        displayForCincinnatiBengals(scoreForCincinnatiBengals);
        displayForSanFrancisco49ers(scoreForSanFrancisco49ers);

    }
}

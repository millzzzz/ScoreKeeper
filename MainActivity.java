package com.example.andorid.scorekeeper;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Left side variable
     */

    TextView textViewL;
    AlertDialog dialogL;
    EditText editTextL;

    TextView textViewR;
    AlertDialog dialogR;
    EditText editTextR;




    /**
     * Left side- These are variables for the plus button
     */
    int quantityF = 0;
    int quantityO = 0;
    int quantityD = 0;
    int quantityE = 0;
    int quantityB = 0;

    int quantityFR = 0;
    int quantityOR = 0;
    int quantityDR = 0;
    int quantityER = 0;
    int quantityBR = 0;



    /**
     * This method automatically shows up when the app is opened
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**BBOY/CREW
         * Left side of the app
         */

        textViewL = (TextView) findViewById(R.id.left_side);
        dialogL = new AlertDialog.Builder(this).create();
        editTextL = new EditText(this);

        dialogL.setTitle("Name");
        dialogL.setView(editTextL);
        dialogL.setButton(DialogInterface.BUTTON_POSITIVE, "Save Name", new DialogInterface.OnClickListener() {

            /**
             * Left side- This method is used for editing the text view
             */
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                textViewL.setText(editTextL.getText());
            }
        });

        textViewL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextL.setText(textViewL.getText());
                dialogL.show();
            }
        });

        /**BBOY/CREW
         * Right side of the app
         */

        textViewR = (TextView) findViewById(R.id.right_side);
        dialogR = new AlertDialog.Builder(this).create();
        editTextR = new EditText(this);

        dialogR.setTitle("Name");
        dialogR.setView(editTextR);
        dialogR.setButton(DialogInterface.BUTTON_POSITIVE, "Save Name", new DialogInterface.OnClickListener() {

            /**
             * Left side- This method is used for editing the text view
             */
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                textViewR.setText(editTextR.getText());
            }
        });

        textViewR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextR.setText(textViewR.getText());
                dialogR.show();
            }
        });

    }

    /**
     * INCREMENT
     * Left side- This method is used for increase the foundation score.
     */
    public void incrementFoundation(View view) {
        quantityF = quantityF + 1;
        displayFoundation(quantityF);

    }

    private void displayFoundation(int number) {
        TextView quantityTextView = findViewById(R.id.foundation_left);
        quantityTextView.setText("" + number);
    }

    /**
     * INCREMENT
     * Left side- This method is used for increase the originality score.
     */
    public void incrementOriginality(View view) {
        quantityO = quantityO + 1;
        displayOriginality(quantityO);

    }

    private void displayOriginality(int number) {
        TextView quantityTextView = findViewById(R.id.originality_left);
        quantityTextView.setText("" + number);
    }

    /**
     * INCREMENT
     * Left side- This method is used for increase the dynamics score.
     */
    public void incrementDynamics(View view) {
        quantityD = quantityD + 1;
        displayDynamics(quantityD);

    }

    private void displayDynamics(int number) {
        TextView quantityTextView = findViewById(R.id.dynamics_left);
        quantityTextView.setText("" + number);
    }

    /**
     * INCREMENT
     * Left side- This method is used for increase the execution score.
     */
    public void incrementExecution(View view) {
        quantityE = quantityE + 1;
        displayExecution(quantityE);

    }

    private void displayExecution(int number) {
        TextView quantityTextView = findViewById(R.id.execution_left);
        quantityTextView.setText("" + number);
    }

    /**
     * INCREMENT
     * Left side- This method is used for increase the battle score.
     */
    public void incrementBattle(View view) {
        quantityB = quantityB + 1;
        displayBattle(quantityB);

    }

    private void displayBattle(int number) {
        TextView quantityTextView = findViewById(R.id.battle_left);
        quantityTextView.setText("" + number);
    }


    /**
     * DECREMENT
     * Left side- This method is used for decrease the foundation score.
     */
    public void decrementFoundation(View view) {
        quantityF = quantityF - 1;
        displayDecrementFoundation(quantityF);
        ;

    }

    private void displayDecrementFoundation(int number) {
        TextView quantityTextView = findViewById(R.id.foundation_left);
        quantityTextView.setText("" + number);
    }

    /**
     * DECREMENT
     * Left side- This method is used for decrease the originality score.
     */
    public void decrementOriginality(View view) {
        quantityO = quantityO - 1;
        displayDecrementOriginality(quantityO);
        ;

    }

    private void displayDecrementOriginality(int number) {
        TextView quantityTextView = findViewById(R.id.originality_left);
        quantityTextView.setText("" + number);
    }

    /**
     * DECREMENT
     * Left side- This method is used for decrease the dynamics score.
     */
    public void decrementDynamics(View view) {
        quantityD = quantityD - 1;
        displayDecrementDynamics(quantityD);
        ;

    }

    private void displayDecrementDynamics(int number) {
        TextView quantityTextView = findViewById(R.id.dynamics_left);
        quantityTextView.setText("" + number);
    }

    /**
     * DECREMENT
     * Left side- This method is used for increase the execution score.
     */
    public void decremenExecution(View view) {
        quantityE = quantityE - 1;
        displayDecrementExecution(quantityE);
        ;

    }

    private void displayDecrementExecution(int number) {
        TextView quantityTextView = findViewById(R.id.execution_left);
        quantityTextView.setText("" + number);
    }

    /**
     * DECREMENT
     * Left side- This method is used for decrease the battle score.
     */
    public void decrementBattle(View view) {
        quantityB = quantityB - 1;
        displayDecrementBattle(quantityB);

    }

    private void displayDecrementBattle(int number) {
        TextView quantityTextView = findViewById(R.id.battle_left);
        quantityTextView.setText("" + number);
    }




    /**
     * This method is called when the check button is clicked.
     */

    public void onClick(View view) {
        Score(view);//no need to call the displayScore again as this one also displays
        ScoreR(view);
    }


    /**
     * INCREMENT
     * Right side- This method is used for increase the foundation score.
     */
    public void incrementFoundationR(View view) {
        quantityFR = quantityFR + 1;
        displayFoundationR(quantityFR);

    }

    private void displayFoundationR(int number) {
        TextView quantityTextView = findViewById(R.id.foundation_right);
        quantityTextView.setText("" + number);
    }

    /**
     * INCREMENT
     * Right side- This method is used for increase the originality score.
     */
    public void incrementOriginalityR(View view) {
        quantityOR = quantityOR + 1;
        displayOriginalityR(quantityOR);

    }

    private void displayOriginalityR(int number) {
        TextView quantityTextView = findViewById(R.id.originality_right);
        quantityTextView.setText("" + number);
    }

    /**
     * INCREMENT
     * Right side- This method is used for increase the dynamics score.
     */
    public void incrementDynamicsR(View view) {
        quantityDR = quantityDR + 1;
        displayDynamicsR(quantityDR);

    }

    private void displayDynamicsR(int number) {
        TextView quantityTextView = findViewById(R.id.dynamics_right);
        quantityTextView.setText("" + number);
    }

    /**
     * INCREMENT
     * Right side- This method is used for increase the execution score.
     */
    public void incrementExecutionR(View view) {
        quantityER = quantityER + 1;
        displayExecutionR(quantityER);

    }

    private void displayExecutionR(int number) {
        TextView quantityTextView = findViewById(R.id.execution_right);
        quantityTextView.setText("" + number);
    }

    /**
     * INCREMENT
     * Right side- This method is used for increase the battle score.
     */
    public void incrementBattleR(View view) {
        quantityBR = quantityBR + 1;
        displayBattleR(quantityBR);

    }

    private void displayBattleR(int number) {
        TextView quantityTextView = findViewById(R.id.battle_right);
        quantityTextView.setText("" + number);
    }


    /**
     * DECREMENT
     * Right side- This method is used for decrease the foundation score.
     */
    public void decrementFoundationR(View view) {
        quantityFR = quantityFR - 1;
        displayDecrementFoundationR(quantityFR);

    }

    private void displayDecrementFoundationR(int number) {
        TextView quantityTextView = findViewById(R.id.foundation_right);
        quantityTextView.setText("" + number);
    }

    /**
     * DECREMENT
     * Right side- This method is used for decrease the originality score.
     */
    public void decrementOriginalityR(View view) {
        quantityOR = quantityOR - 1;
        displayDecrementOriginalityR(quantityOR);
        ;

    }

    private void displayDecrementOriginalityR(int number) {
        TextView quantityTextView = findViewById(R.id.originality_right);
        quantityTextView.setText("" + number);
    }

    /**
     * DECREMENT
     * Left side- This method is used for decrease the dynamics score.
     */
    public void decrementDynamicsR(View view) {
        quantityDR = quantityDR - 1;
        displayDecrementDynamicsR(quantityDR);
        ;

    }

    private void displayDecrementDynamicsR(int number) {
        TextView quantityTextView = findViewById(R.id.dynamics_right);
        quantityTextView.setText("" + number);
    }

    /**
     * DECREMENT
     * Left side- This method is used for increase the execution score.
     */
    public void decremenExecutionR(View view) {
        quantityER = quantityER - 1;
        displayDecrementExecutionR(quantityER);
        ;

    }

    private void displayDecrementExecutionR(int number) {
        TextView quantityTextView = findViewById(R.id.execution_right);
        quantityTextView.setText("" + number);
    }

    /**
     * DECREMENT
     * Left side- This method is used for decrease the battle score.
     */
    public void decrementBattleR(View view) {
        quantityBR = quantityBR - 1;
        displayDecrementBattleR(quantityBR);

    }

    private void displayDecrementBattleR(int number) {
        TextView quantityTextView = findViewById(R.id.battle_right);
        quantityTextView.setText("" + number);
    }




    /**
     * FINAL SCORE Left side
     */
    public void Score(View view) {
        int priceL = quantityF + quantityO + quantityD + quantityE + quantityB;
        displayScore(priceL);

    }

    private void displayScore(int price) {
        TextView quantityTextView = findViewById(R.id.score_a);
        quantityTextView.setText("" + price);
    }


    /**
     * FINAL SCORE Right side
     */

    public void ScoreR(View view) {
        int priceR = quantityFR + quantityOR + quantityDR + quantityER + quantityBR;
        displayScoreR(priceR);

    }

    private void displayScoreR(int price) {
        TextView quantityTextView = findViewById(R.id.score_b);
        quantityTextView.setText("" + price);
    }

    public void ResetScore(View view)   {
        displayScore(0);
        displayScoreR(0);
    }
}






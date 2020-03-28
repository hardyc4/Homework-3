package org.insideranken.christopher_hardy.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton rock;
    ImageButton paper;
    ImageButton scissors;
    TextView computerAnswer;
    TextView userAnswer;
    TextView winnerIs;
    Button totals;

    int HumanScore, ComputerScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);
        computerAnswer = findViewById(R.id.computerAnswer);
        userAnswer = findViewById(R.id.userAnswer);
        winnerIs = findViewById(R.id.winnerIs);
        totals = findViewById(R.id.totals);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAnswer.setText("Your Answer: Rock");
                playTurn("Rock");
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAnswer.setText("Your Answer: Paper");
                playTurn("Paper");
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userAnswer.setText("Your Answer: Scissors");
                playTurn("Scissors");
            }
        });

        totals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                winnerIs.setText(" User's Score: " + HumanScore + "               Computer's Score: " + ComputerScore);
            }
        });
    }
    public void playTurn( String playerChoice)
    {
        String computerChoice = "";

        Random r = new Random();

        int computerChoiceNumber = r.nextInt(3) + 1;

        if (computerChoiceNumber == 1)
        {
            computerAnswer.setText("Computer's Answer: Rock");
            computerChoice = "Rock";
        }
        if (computerChoiceNumber == 2)
        {
            computerAnswer.setText("Computer's Answer: Paper");
            computerChoice = "Paper";
        }
        if (computerChoiceNumber == 3)
        {
            computerAnswer.setText("Computer's Answer: Scissors");
            computerChoice = "Scissors";
        }

        // ********************************************************

        if (playerChoice == "Rock" && computerChoice == "Rock")
        {
            winnerIs.setText("DRAW!");
        }
        if (playerChoice == "Paper" && computerChoice == "Paper")
        {
            winnerIs.setText("DRAW!");
        }
        if (playerChoice == "Scissors" && computerChoice == "Scissors")
        {
            winnerIs.setText("DRAW!");
        }
        if (playerChoice == "Rock" && computerChoice == "Scissors")
        {
            winnerIs.setText("Point To User! Congrats!!!");
            HumanScore++;
        }
        if (playerChoice == "Rock" && computerChoice == "Paper")
        {
            winnerIs.setText("Point To Computer! :P");
            ComputerScore++;
        }
        if (playerChoice == "Paper" && computerChoice == "Rock")
        {
            winnerIs.setText("Point To User! Congrats!!!");
            HumanScore++;
        }
        if (playerChoice == "Paper" && computerChoice == "Scissors")
        {
            winnerIs.setText("Point To Computer! :P");
            ComputerScore++;
        }
        if (playerChoice == "Scissors" && computerChoice == "Rock")
        {
            winnerIs.setText("Point To Computer! :P");
            ComputerScore++;
        }
        if (playerChoice == "Scissors" && computerChoice == "Paper")
        {
            winnerIs.setText("Point To User! Congrats!!!");
            HumanScore++;
        }
    }
}

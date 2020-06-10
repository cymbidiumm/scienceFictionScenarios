package com.gmailcymbidiumm.sciencefictionscenarios;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private Button getScenarioBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getScenarioBtn = (Button) findViewById(R.id.getScenarioBtn);
        final TextView show = (TextView) findViewById(R.id.welcomeText);
        ImageButton touchh = (ImageButton) findViewById(R.id.imageBut);

        touchh.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                switch (motionEvent.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        show.setTextSize(5);
                        show.setText("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##########@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#########((#########@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@##@######((((((((######&##@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@##%########((((((((((########%##@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@##%%%%#####((((((((((((((((#####%%%%##@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@#@%%%######((((((((((((((((((((######%%%@#@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@&@@@%%######(((((((((((((((((((#((######%%&@@%@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@%@@@@%%#####((((((((((((((((((((((((#####%%&@@@#@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@#@@@@%#%###(#((((((((((((((((((((((#(###%#%@@@@#@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@##@@@&%%####(((((((((((((((((((((((((((###%%@@@&##@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@&%#@&@&%####((((((((((((((((((((((((((#(###%%%@&@#%%@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@%@#@@&%#%######((((((((((((((((((((((########%&@@#@%@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@#@#%&%%%%######((((((((((((((((((((((######%%%%%%#@%@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@###@%%%%%##%#####((((((((((((((((((#####%##%%%%%@###@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@##%##%#&@@@%%#####((((#((((((#((((#####%%@@@&#%##%##@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@%&###((#######%###(((((#((((((((((###%#######((###&#@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@&%%%%##(#((((######((#((((##(######(((((###%%%%&@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@####(((#######(#((#((######(((####@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@%@@@@@@@@@@&%%######&######&#####%%%%@@@@@@@@@@&&@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@&&@@@@@@@@@@@@@#@@%%%########%#%&@#@@@@@@@@@@@@@&%@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@##@@%@@@@@@@@@@@%&#@@&####&@@#&#@@@@@@@@@@@%@@##@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@&#@%@@&@@@@@%@%@%%%######%%&@&@%@@@@@@@@%@#&@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@&&&###%&&%%@%@@###%&##&%##%@@&@%%@&%###%&@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@######%%#%#@#&@@##@&&#&#%#%%######@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@#@#####(@%##%&&##&&%##%@(#####@#@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@%####%###(#%######(#%#&####%@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##(%#(########%###(#&(%#@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%##################%&@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##%&@@@@@@&%##&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@####%@@@@%####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&#####(####@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@##########@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                                "☆☆☆☆☆☆☆☆☆☆☆☆☆brainStorming-time☆☆☆☆☆☆☆☆☆☆☆☆☆");
                        return true;

                    case MotionEvent.ACTION_UP:

                        show.setTextSize(12);
                        show.setText(" go pick a sample of a scenario and create some mind-blowing stories ");
                        return true;
                }

                return false;
            }
        });

        getScenarioBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(startIntent);

            }


        });

}
}

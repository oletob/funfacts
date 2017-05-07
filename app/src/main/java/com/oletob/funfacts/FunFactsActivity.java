package com.oletob.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();

    // Declare our View variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assings the Views from the layout file to the corresponding variables
        factTextView = (TextView) findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);

        // Declares a listener for button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The button was clicked, so update the fact TextView with a new fact

                // Update the screen with out dynamic fact
                factTextView.setText(factBook.getFact());
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}

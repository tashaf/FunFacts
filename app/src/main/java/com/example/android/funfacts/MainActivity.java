package com.example.android.funfacts;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView factsTextView;
    private Button showFactsButton;

    private FactsBook factsBook = new FactsBook();

    private ConstraintLayout mConstraintLayout;
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factsTextView = findViewById(R.id.facts_textView);
        showFactsButton = findViewById(R.id.show_facts_button);
        factsBook = new FactsBook();
        mConstraintLayout = findViewById(R.id.main_layout);

        showFactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mConstraintLayout.setBackgroundColor(Integer.parseInt(mColorWheel.getColors()));
                factsTextView.setText(factsBook.getFacts());
            }
        });
    }


}

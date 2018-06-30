package gr.georkouk.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static String JOKE_INTENT = "jokeIntent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = "";

        if (getIntent().getExtras() != null && getIntent().hasExtra(JOKE_INTENT)) {
            joke = getIntent().getExtras().getString(JOKE_INTENT);
        }

        TextView testing = findViewById(R.id.tvJoke);
        testing.setText(joke);
    }

}

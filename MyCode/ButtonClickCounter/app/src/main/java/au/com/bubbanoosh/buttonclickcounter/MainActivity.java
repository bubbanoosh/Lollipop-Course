package au.com.bubbanoosh.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //EW. Declare the shizz
    private Button circuitButton;
    private Button hiitButton;
    private Button workoutButton;
    private Button resetButton;
    private TextView textTopMessage;
    private TextView textLarge;

    private int circuitClicked = 0;
    private int hiitClicked = 0;
    private int workoutClicked = 0;
    private boolean beginAgain = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //EW. This must happen 1st. LINK the actual code to our layout here
        setContentView(R.layout.activity_main);

        //EW. Link the buttons and textview stuff.
        circuitButton = (Button) findViewById(R.id.btnCircuit);
        hiitButton = (Button) findViewById(R.id.btnHiit);
        workoutButton = (Button) findViewById(R.id.btnWorkout);
        resetButton = (Button) findViewById(R.id.btnReset);
        textTopMessage = (TextView) findViewById(R.id.textView);
        textLarge = (TextView) findViewById(R.id.textViewLarge);

        //EW. Add the click listeners
        View.OnClickListener circuitButtonOnClickListener  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (beginAgain) blankLargeText();;
                circuitClicked++;
                String totes = Integer.toString(circuitClicked);
                String totesMessage = "Circuit clicked " + totes + " time" ;
                totesMessage += (circuitClicked > 1)? "s." : ".";
                textTopMessage.setText(totesMessage);
            }
        };
        View.OnClickListener hiitButtonOnClickListener  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (beginAgain) blankLargeText();;
                hiitClicked++;
                String totes = Integer.toString(hiitClicked);
                String totesMessage = "Hiit clicked " + totes + " time" ;
                totesMessage += (hiitClicked > 1)? "s." : ".";
                textTopMessage.setText(totesMessage);
            }
        };
        View.OnClickListener workoutButtonOnClickListener  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (beginAgain) blankLargeText();;
                workoutClicked++;
                String totes = Integer.toString(workoutClicked);
                String totesMessage = "Workout clicked " + totes + " time" ;
                totesMessage += (workoutClicked > 1)? "s." : ".";
                textTopMessage.setText(totesMessage);
            }
        };
        View.OnClickListener resetButtonOnClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                beginAgain = true;
                resetAll(true);
            }
        };
        //EW. Register the Listeners
        circuitButton.setOnClickListener(circuitButtonOnClickListener);
        hiitButton.setOnClickListener(hiitButtonOnClickListener);
        workoutButton.setOnClickListener(workoutButtonOnClickListener);
        resetButton.setOnClickListener(resetButtonOnClickListener);
    }

    protected void resetAll(boolean blankTextTop)
    {
        circuitClicked = hiitClicked = workoutClicked = 0;
        if (blankTextTop) textTopMessage.setText("");
        textLarge.setText("RESET THAT SHIT!");
    }

    protected void blankLargeText()
    {
        beginAgain = false;
        textTopMessage.setText("This is a really basic freaking APP...");
        textLarge.setText("");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            //A floating message unobtrusive message to the user
            String message = "Fucking button tapped!";
            int myInt = 25;
            String toStringMessage = " Here's Integer.toString() - " + Integer.toString(myInt);
            message += toStringMessage;

            if (circuitClicked > 0 || hiitClicked > 0 || workoutClicked > 0) {
                int totals = circuitClicked + hiitClicked + workoutClicked;
                message = "Total buttons clicked is " + Integer.toString(totals);
            }


            Toast toastMessage = Toast.makeText(this, message, Toast.LENGTH_LONG);
            toastMessage.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

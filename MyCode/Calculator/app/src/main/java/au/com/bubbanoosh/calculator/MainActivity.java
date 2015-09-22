package au.com.bubbanoosh.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView operand1, operand2, txtResult;
    private Button btn1, btn2, btn3, btn4 ,btn5, btn6, btn7, btn8, btn9, btn0, btnDot, btnEquals, btnPlus, btnMinus, btnDivide, btnMultiply;
    private String value1 = "";
    private String value2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.etxtOperand1);
        operand2 = (EditText) findViewById(R.id.etxtOperand1);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnDot = (Button) findViewById(R.id.dot);
        btnEquals = (Button) findViewById(R.id.equals);
        btnPlus = (Button) findViewById(R.id.plus);
        btnMinus = (Button) findViewById(R.id.minus);
        btnDivide = (Button) findViewById(R.id.divide);
        btnMultiply = (Button) findViewById(R.id.multiply);

        //EW. SET and REGISTER the listener both
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double double1 = validDouble(operand1.getText().toString());
                double double2 = validDouble(operand2.getText().toString());

                double result = double1 + double2;
                txtResult.setText(Double.toString(result));

                value1 = "0";
                value2 = "0";
                operand1.setText(value1.toString());
                operand2.setText(value2.toString());
            }
        });
        //EW. SET and REGISTER the listener both
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double double1 = validDouble(operand1.getText().toString());
                double double2 = validDouble(operand2.getText().toString());

                double result = double1 - double2;
                txtResult.setText(Double.toString(result));

                value1 = "0";
                value2 = "0";
                operand1.setText(value1.toString());
                operand2.setText(value2.toString());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn1.getText().toString();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn2.getText().toString();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn3.getText().toString();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn4.getText().toString();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn5.getText().toString();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn6.getText().toString();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn7.getText().toString();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn8.getText().toString();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn9.getText().toString();
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btn0.getText().toString();
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 += btnDot.getText().toString();
            }
        });

    }

    protected double validDouble(String entry)
    {
        return Double.parseDouble(entry.toString());
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

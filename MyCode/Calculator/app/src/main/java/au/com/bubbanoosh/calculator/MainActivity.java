package au.com.bubbanoosh.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView operand1, operand2, txtResult;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnDot;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnDivide;
    private Button btnMultiply;
    private Button btnClear;
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
        btnClear = (Button) findViewById(R.id.clear);
        btnPlus = (Button) findViewById(R.id.plus);
        btnMinus = (Button) findViewById(R.id.minus);
        btnDivide = (Button) findViewById(R.id.divide);
        btnMultiply = (Button) findViewById(R.id.multiply);

        //EW. SET and REGISTER the listener both
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double double1 = validDouble(operand1.getText().toString());
                    double double2 = validDouble(operand2.getText().toString());

                    double result = double1 + double2;
                    txtResult.setText(Double.toString(result));

                    resetValues();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter stuff", Toast.LENGTH_LONG).show();
                }
            }
        });
        //EW. SET and REGISTER the listener both
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double double1 = validDouble(operand1.getText().toString());
                    double double2 = validDouble(operand2.getText().toString());

                    double result = double1 - double2;
                    txtResult.setText(Double.toString(result));

                    resetValues();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter stuff", Toast.LENGTH_LONG).show();
                }
            }
        });
        //EW. SET and REGISTER the listener both
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double double1 = validDouble(operand1.getText().toString());
                    double double2 = validDouble(operand2.getText().toString());

                    double result = double1 / double2;
                    txtResult.setText(Double.toString(result));

                    resetValues();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter stuff", Toast.LENGTH_LONG).show();
                }
            }
        });
        //EW. SET and REGISTER the listener both
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length()>0) && (operand2.getText().length()>0)) {
                    double double1 = validDouble(operand1.getText().toString());
                    double double2 = validDouble(operand2.getText().toString());

                    double result = double1 * double2;
                    txtResult.setText(Double.toString(result));

                    resetValues();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter stuff", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetAll();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn1.getText().toString());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn2.getText().toString());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn3.getText().toString());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn4.getText().toString());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn5.getText().toString());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn6.getText().toString());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn7.getText().toString());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn8.getText().toString());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn9.getText().toString());
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btn0.getText().toString());
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetNumber(btnDot.getText().toString());
            }
        });

    }

    protected void SetNumber(String textValue)
    {
        if (operand1.hasFocus()) {
            value1 += textValue;
            operand1.setText(value1);
        } else {
            value2 += textValue;
            operand2.setText(value2);
        }
    }
    protected double validDouble(String entry)
    {
        return Double.parseDouble(entry);
    }
    protected void resetAll(){
        value1 = value2 = "";
        operand1.setText(value1);
        operand2.setText(value2);
        txtResult.setText("0.00");
        //focus
        operand1.requestFocus();
    }
    protected void resetValues(){
        value1 = value2 = "";
        operand1.setText(value1);
        operand2.setText(value2);
        //focus
        operand1.requestFocus();
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

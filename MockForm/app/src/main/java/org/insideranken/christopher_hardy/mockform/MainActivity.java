package org.insideranken.christopher_hardy.mockform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText address;
    EditText city;
    EditText zipCode;
    Spinner state;
    RadioGroup gender;
    TextView shift;
    CheckBox shift1;
    CheckBox shift2;
    Switch settings;
    ImageButton calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        city = findViewById(R.id.city);
        zipCode = findViewById(R.id.zipCode);
        Spinner spinner = findViewById(R.id.state);
        gender = findViewById(R.id.gender);
        shift = findViewById(R.id.shift);
        shift1 = findViewById(R.id.shift1);
        shift2 = findViewById(R.id.shift2);
        settings = findViewById(R.id.settings);
        calculate = findViewById(R.id.calculate);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.states, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!name.getText().toString().isEmpty() && !address.getText().toString().isEmpty() && !city.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), name, address, city, zipCode, state, gender, shift, shift1, shift2, settings,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }}



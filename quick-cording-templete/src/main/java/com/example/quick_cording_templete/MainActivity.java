package com.example.quick_cording_templete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class
MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText in_value;


        final EditText edittext=(EditText)findViewById(R.id.edittext);
        Button btn_value=(Button)findViewById(R.id.btn_input);
        final TextView text_number=(TextView)findViewById(R.id.text_number);
        final TextView text_string=(TextView)findViewById(R.id.text_string)

        final ArrayList<String> string_arr = new ArrayList<String>();
        final ArrayList<Integer> int_arr = new ArrayList<Integer>();


        btn_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    text_number.setText(edittext.getText());
                    string_arr.add(edittext.getText());
                }catch(Exception E){
                    text_string.setText(edittext.getText());
                    int_arr.add(edittext.getText())
                }
            }
        });
    }
}

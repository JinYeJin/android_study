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
        Button btn_input=(Button)findViewById(R.id.btn_input);
        Button btn_ic=(Button)findViewById(R.id.btn_ic);
        final TextView text_number=(TextView)findViewById(R.id.text_number);
        final TextView text_string=(TextView)findViewById(R.id.text_string);

        final ArrayList<String> string_arr = new ArrayList<String>();
        final ArrayList<Integer> integer_arr = new ArrayList<Integer>();

        btn_input.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    string_arr.add(edittext.getText().toString());
                }catch(NumberFormatException e){;
                    integer_arr.add(Integer.parseInt(String.valueOf(edittext.getText())));
                }
            }
        });

        btn_ic.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                String str_arr="";
                String int_arr="";

                for(int i=0; i<string_arr.size(); i++){
                    str_arr += string_arr.get(i);
                }
                for(int i=0; i<string_arr.size(); i++){
                    int_arr += integer_arr.get(i);
                }

                text_number.setText(str_arr);
                text_number.setText(int_arr);
            }
        });
    }
}

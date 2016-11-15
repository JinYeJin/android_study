package com.example.quick_cording_05;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.LinkedList;

public class
MainActivity extends AppCompatActivity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    final LinkedList<String> string_arr = new LinkedList<String>();
    final LinkedList<Integer> integer_arr = new LinkedList<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText in_value;


        final EditText edittext = (EditText) findViewById(R.id.edittext);
        Button btn_input = (Button) findViewById(R.id.btn_input);
        Button btn_ic = (Button) findViewById(R.id.btn_ic);
        final TextView text_number = (TextView) findViewById(R.id.text_number);
        final TextView text_string = (TextView) findViewById(R.id.text_string);

        btn_input.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence textString = "String added";
                CharSequence textInt = "Integer added";
                int duration = Toast.LENGTH_SHORT;

                try {
                    integer_arr.add(Integer.parseInt(String.valueOf(edittext.getText())));
                    Toast toast = Toast.makeText(context, textInt, duration);
                    toast.show();
                } catch (NumberFormatException e) {
                    string_arr.add(edittext.getText().toString());
                    Toast toast = Toast.makeText(context, textString, duration);
                    toast.show();
                }
                edittext.setText("");
            }
        });

        btn_ic.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_arr = "";
                String int_arr = "";

                for (int i = 0; i < string_arr.size(); i++) {
                    str_arr += string_arr.get(i);
                }
                for (int i = 0; i < integer_arr.size(); i++) {
                    int_arr += integer_arr.get(i);
                }

                text_number.setText(int_arr);
                text_string.setText(str_arr);

                integer_arr.clear();
                string_arr.clear();

            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
}

package com.example.quick_cording_02;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    BinarySearch binary = new BinarySearch();
    CharSequence text;
    CharSequence answer;
    int duration = Toast.LENGTH_SHORT;

    TextView text_answer = (TextView) findViewById(R.id.text_answer);
    TextView text_counting = (TextView) findViewById(R.id.text_counting);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendUp(View view){
        binary.up();
        setText();
    }
    public void sendDown(View view){
        binary.down();
        setText();
    }

    public void sendStart(View view){
        binary.init();
        Context context = this;
        text = "Search start!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        setText();
    }

    private void setText(){
        text_answer.setText(binary.getAnswer());
        text_counting.setText(binary.getCount());
    }
}

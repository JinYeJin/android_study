package com.example.quick_cording_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BankAccount bankAccount = new BankAccount();

        Button startButton = (Button) findViewById(R.id.btn_start);
        Button clearButton = (Button) findViewById(R.id.btn_clear);
        final TextView resultText = (TextView) findViewById(R.id.view_result);

        startButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int money = 10;
                String result = "";
                final Thread depositMan = new Thread(result) {
                    public void run() {
                        resultText.post(new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 10; i++) {
                                    bankAccount.deposit(money);
                                    //res += "총합 : " + bankAccount.getBalance() + " " + money + " 만큼 입금";
                                    //resultText.setText("총합 : " + bankAccount.getBalance() + " " + money + " 만큼 입금");
                                    try {
                                        Thread.sleep((int) (Math.random() * 1000));
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });
                    }
                };
                final Thread withdrawMan = new Thread(result) {
                    public void run() {
                        resultText.post(new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 10; i++) {
                                    bankAccount.withdraw(money);
                                    resultText.setText("총합 : " + bankAccount.getBalance() + " " + money + " 만큼 출금");
                                    try {
                                        Thread.sleep((int) (Math.random() * 1000));
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });
                    }
                };
                depositMan.start();
                withdrawMan.start();
            }
        });
    }
}
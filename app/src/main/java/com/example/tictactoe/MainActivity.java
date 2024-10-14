package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
    int count=0,flag=0;
    String sb1,sb2,sb3,sb4,sb5,sb6,sb7,sb8,sb9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        reset=findViewById(R.id.reset);
    }
    public void OnClick(View view){
        Button buttonObj = (Button) view;
        count++;
        //for switching button value
        if (flag==0){
            buttonObj.setText("X");
            flag=1;
        }
        else{
            buttonObj.setText("O");
            flag=0;
        }
        //for checking wining combination
        if (count>4){
            buttonData();
            if (sb1.equals(sb2) && sb2.equals(sb3)){
                Toast.makeText(getApplicationContext(),"winner!",Toast.LENGTH_SHORT).show();
            } else if (sb4.equals(sb5) && sb5.equals(sb6))  {
                Toast.makeText(getApplicationContext(),"winner!",Toast.LENGTH_SHORT).show();
            } else if (sb7.equals(sb8) && sb8.equals(sb9)) {
                Toast.makeText(this, "Winner!", Toast.LENGTH_SHORT).show();
            } else if (sb1.equals(sb4) && sb4.equals(sb7)) {
                Toast.makeText(this, "Winner!", Toast.LENGTH_SHORT).show();
            } else if (sb3.equals(sb6) && sb6.equals(sb9)) {
                Toast.makeText(this, "Winner!", Toast.LENGTH_SHORT).show();
            } else if (sb2==sb5 && sb5==sb8) {
                Toast.makeText(this, "Winner!", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void buttonData(){
        sb1=b1.getText().toString();
        sb2=b2.getText().toString();
        sb3=b3.getText().toString();
        sb4=b4.getText().toString();
        sb5=b5.getText().toString();
        sb6=b6.getText().toString();
        sb7=b7.getText().toString();
        sb8=b8.getText().toString();
        sb9=b9.getText().toString();
    }
    public void setData(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
}
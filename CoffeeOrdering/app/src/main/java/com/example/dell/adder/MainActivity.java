package com.example.dell.adder;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int noOfCoffees;
    int totalPrice=0;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view){
        noOfCoffees++;
        display(noOfCoffees);
    }
    public void decrement(View view){
        if(noOfCoffees!=0)
            noOfCoffees--;
        display(noOfCoffees);
    }

    public void submitOrder(View view){
        CheckBox wc = (CheckBox) findViewById(R.id.whippedCream);
        CheckBox choco = (CheckBox) findViewById(R.id.chocolate);

        String whipped="";
        String chocolate="";

        if(wc.isChecked()){
            totalPrice++;
            whipped="Yes";
        } else
            whipped="No";
        if(choco.isChecked()){
            totalPrice+=2;
            chocolate="Yes";
        } else
            chocolate="No";
        totalPrice += noOfCoffees*5;

        EditText editText = (EditText) findViewById(R.id.name);
        String name=editText.getText().toString();

        msg = "Name: "+name+"\n"+"Whipped Cream: "+whipped+"\n"+
                "Chocolate: "+chocolate+"\n"+"Queantity: "+noOfCoffees+"\n"+
                "Total: "+NumberFormat.getCurrencyInstance().format(totalPrice)+"\nThank You!";
        displayMessage(msg);
//        Intent intent=new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("geo:47.6,-123.3"));
//        if(intent.resolveActivity(getPackageManager())!=null){
//            startActivity(intent);
//        }
    }

    private void displayMessage(String message) {
        TextView tp=findViewById(R.id.price);
        tp.setText(message);
    }

    private void display(int i) {
        TextView t= findViewById(R.id.quantity);
        t.setText(""+i);
    }

    public void email(View view){
        Intent intent=new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT,"Your coffee order receipt");
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
}

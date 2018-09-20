package com.example.android.justkofei.feature1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//import java.text.NumberFormat;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int qty = 0;

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String message = "Total: $" + qty*5 + "\nThank You!";
        //displayPrice(qty * 5);
        displayMessage(message);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * These methods increment and decrement the value qty
     */
    public void Incrementer(View view) {
        qty++;
        display(qty);
    }

    public void Decrementer(View view) {
        if (!(qty <= 0)) {
            qty--;
            display(qty);
        }
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        //priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        String tell = "$";
        //tell.concat(Integer.toString(number));
        priceTextView.setText(tell + number);
    }

}
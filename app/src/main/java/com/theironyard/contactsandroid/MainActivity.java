package com.theironyard.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {

    ArrayAdapter<String> name;
    ArrayAdapter<String> number;

    EditText editText;
    EditText editText2;
    ListView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (ListView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        name = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        number = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        button.setOnClickListener(this);
        textView.setOnItemLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String contactName = editText.getText().toString();
        String contactNumber = editText2.getText().toString();
        name.add(contactName);
        number.add(contactNumber);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        return false;
    }
}



        /*Create a UI that looks like the screenshot below.

        To make the two text boxes take up an even amount of space:+

        Put a LinearLayout (Horizontal) at the bottom of the app+

        Put the two text fields and button inside of it+

        Click the two text fields and set layout:width to 0 and layout:weight to 1.+

        Create variables for each of the controls in MainActivity.

        In onCreate, use findViewById to connect the variables to their respective views.

        Create an ArrayAdapter<String> and connect the listview to it.

        Implement View.OnClickListener.

        In onClick, pull the name and phone strings from the text fields,
        combine them into one string, and add them to the adapter.
        Then make it clear the text fields.

        Implement AdapterView.OnItemLongClickListener
        and make onItemLongClick remove the item that was long-clicked.*/
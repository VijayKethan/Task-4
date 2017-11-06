package com.example.vcarve_dt_14.task_4;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

/**
 * Created by VCARVE-DT-14 on 11-10-2017.
 */

public class FormActivity extends Activity {

    EditText name;
    EditText phone;
    Button btn;
    String server_url = "http://192.168.192.13/connection.php";
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_activity);

        name = (EditText)findViewById(R.id.name);
        phone = (EditText)findViewById(R.id.phone);
        btn = (Button)findViewById(R.id.btn);
        builder = new AlertDialog.Builder(FormActivity.this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


    }


}

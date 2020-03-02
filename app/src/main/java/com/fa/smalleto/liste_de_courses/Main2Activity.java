package com.fa.smalleto.liste_de_courses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button btnStore, btnGetall;
    private EditText etname, ethobby;
    //private EditText tvChild;
    private DatabaseHelper databaseHelper;
    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        databaseHelper = new DatabaseHelper(this);

        btnStore = (Button) findViewById(R.id.btnstore);
        btnGetall = (Button) findViewById(R.id.btnget);
        //etname = (EditText) findViewById(R.id.etname);
        //ethobby = (EditText) findViewById(R.id.ethobby);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        //textView = (EditText) findViewById(R.id.etname);
        //textView2 = (EditText) findViewById(R.id.ethobby);




        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // databaseHelper.addUserDetail(etname.getText().toString(), ethobby.getText().toString());

                //etname.setText("");



                Intent intent = getIntent();
                //Intent intent2 = getIntent();
                //Intent intent3 = getIntent();



                if (intent != null) {// && intent2 != null && intent3 != null) {
                    Bundle extras;
                    extras = intent.getExtras();


                    String nom = extras.getString("NOM");
                    String nom2 = extras.getString("NOM2");
                    //String nom3 = extras.getString("NOM3");
                    textView.setText(String.format("%s", nom));
                    textView2.setText(String.format("%s", nom2));

                }


                databaseHelper.addUserDetail(textView.getText().toString(), textView2.getText().toString());
               // tvChild.setText(toString());
                //tvChild.setText("");
                //ethobby.setText("");
                Toast.makeText(Main2Activity.this, "Enregistrement Réussi!", Toast.LENGTH_SHORT).show();
                btnStore.clearFocus();
                btnStore.setVisibility(View.GONE);


            }
        });



        btnGetall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this,GetAllUsersActivity.class);



                startActivity(intent);
            }
        });

    }
}

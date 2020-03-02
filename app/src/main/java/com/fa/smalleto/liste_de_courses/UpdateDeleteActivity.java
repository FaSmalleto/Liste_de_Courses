package com.fa.smalleto.liste_de_courses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateDeleteActivity extends AppCompatActivity {

    private UserModel userModel;
    private EditText etname, ethobby;
    private Button btnupdate, btndelete;
    private DatabaseHelper databaseHelper;
    private EditText tvChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete);

        Intent intent = getIntent();
        userModel = (UserModel) intent.getSerializableExtra("user");

        databaseHelper = new DatabaseHelper(this);

        etname = (EditText) findViewById(R.id.etname);
        //tvChild = (EditText) findViewById(R.id.tvChild);
        ethobby = (EditText) findViewById(R.id.ethobby);
        btndelete = (Button) findViewById(R.id.btndelete);
        btnupdate = (Button) findViewById(R.id.btnupdate);

        etname.setText(userModel.getName());
        //tvChild.setText(userModel.getTvChild());
        ethobby.setText(userModel.getHobby());

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelper.updateUser(userModel.getId(),etname.getText().toString(),ethobby.getText().toString());
                Toast.makeText(UpdateDeleteActivity.this, "Modification Réussie !", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(UpdateDeleteActivity.this,Main2Activity.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                //startActivity(intent);
            }
        });

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelper.deleteUSer(userModel.getId());
                Toast.makeText(UpdateDeleteActivity.this, "Effacement Réussi !", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(UpdateDeleteActivity.this,Main2Activity.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                //startActivity(intent);
            }
        });

    }
}

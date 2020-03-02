package com.fa.smalleto.liste_de_courses;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class CheckedActivity extends AppCompatActivity {

    protected TextView tvParent, tvChild, textViewAjout;
    private EditText name;
    private Button button;
    private Button btnEnreg;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checked);

        tvParent = findViewById(R.id.parent);
        tvChild = findViewById(R.id.child);

        for (int i = 0; i < MyCategoriesExpandableListAdapter.parentItems.size(); i++) {

            String isChecked = MyCategoriesExpandableListAdapter.parentItems.get(i).get(ConstantManager.Parameter.IS_CHECKED);

            if (isChecked.equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {
                tvParent.setText(tvParent.getText() +"*"+ MyCategoriesExpandableListAdapter.parentItems.get(i).get(ConstantManager.Parameter.CATEGORY_NAME)+"* ");


            }


            for (int j = 0; j < MyCategoriesExpandableListAdapter.childItems.get(i).size(); j++) {


                String isChildChecked = MyCategoriesExpandableListAdapter.childItems.get(i).get(j).get(ConstantManager.Parameter.IS_CHECKED);

                if (isChildChecked.equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {
                    tvChild.setText(" " + tvChild.getText() + "\n" + " " + MyCategoriesExpandableListAdapter.childItems.get(i).get(j).get(ConstantManager.Parameter.SUB_CATEGORY_NAME))  ;

                }



            }


            name = findViewById(R.id.name);
            textViewAjout = findViewById(R.id.textViewAjout);
            button = findViewById(R.id.button);

            //Toast.makeText(this, "Pour Ajouter des Artickes", Toast.LENGTH_LONG).show();

           /* Toast toast= Toast.makeText(getApplicationContext(),
                    "Pour Ajouter des Artickes \n Ecrire dans la Zone de Texte \n Puis Valider", Toast.LENGTH_LONG);
            toast.setDuration(10 duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0);

            toast.show();*/
            /*final Toast toast = Toast.makeText(getApplicationContext(), "This message will disappear in half a second", Toast.LENGTH_LONG);
            toast.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            }, 300000);*/

            final Toast toast = Toast.makeText(getBaseContext(), "POUR AJOUTER DES ARTICLES\nECRIRE DANS LA ZONE DE TEXTE\nPUIS VALIDER",Toast.LENGTH_SHORT);
            toast.show();
            new CountDownTimer(5000, 1000)
            {
                public void onTick(long millisUntilFinished) {toast.show();}
                public void onFinish() {toast.cancel();}
            }.start();
        }



    }



    public void onClickListener(View view) {
        boolean clicked = (button).isClickable();

        if (clicked) {
            //name.setTextColor(0xFF00FF00);
            //textView.setText("aa");
            textViewAjout.setText(" " + "\n" + name.getText().toString());

            name.clearFocus();
            name.setVisibility(View.GONE);
            return;
        }
    }
    public  void  onClickListener2(View view) {


            Intent intent = new Intent(CheckedActivity.this,Main2Activity.class);
            intent.putExtra("NOM", tvChild.getText().toString() + "");
            intent.putExtra("NOM2", textViewAjout.getText().toString() + "");
            startActivity(intent);
            return;
        }





}




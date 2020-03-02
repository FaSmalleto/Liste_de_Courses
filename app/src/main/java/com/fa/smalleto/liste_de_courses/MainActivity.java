package com.fa.smalleto.liste_de_courses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import com.fa.smalleto.liste_de_courses.Model.DataItem;
import com.fa.smalleto.liste_de_courses.Model.SubCategoryItem;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ExpandableListView lvCategory;

    private ArrayList<DataItem> arCategory;
    private ArrayList<SubCategoryItem> arSubCategory;
    private ArrayList<ArrayList<SubCategoryItem>> arSubCategoryFinal;

    private ArrayList<HashMap<String, String>> parentItems;
    private ArrayList<ArrayList<HashMap<String, String>>> childItems;
    private MyCategoriesExpandableListAdapter myCategoriesExpandableListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CheckedActivity.class);
                startActivity(intent);
            }
        });

        setupReferences();
    }

    private void setupReferences() {

        lvCategory = findViewById(R.id.lvCategory);
        arCategory = new ArrayList<>();
        arSubCategory = new ArrayList<>();
        parentItems = new ArrayList<>();
        childItems = new ArrayList<>();

        DataItem dataItem = new DataItem();
        dataItem.setCategoryId("1");
        dataItem.setCategoryName("BOULANGERIE");

        arSubCategory = new ArrayList<>();
        for(int i = 1; i < 2; i++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(i));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Pain Complet");

            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(i));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Pain aux Céréales");

            arSubCategory.add(subCategoryItem2);

            SubCategoryItem subCategoryItem3 = new SubCategoryItem();
            subCategoryItem3.setCategoryId(String.valueOf(i));
            subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem3.setSubCategoryName("Baguettes");

            arSubCategory.add(subCategoryItem3);

        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("2");
        dataItem.setCategoryName("PRODUITS SURGELES");
        arSubCategory = new ArrayList<>();
        for(int j = 1; j < 2; j++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(j));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Pizza Surgelée");
            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(j));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Frittes Surgelées");
            arSubCategory.add(subCategoryItem2);

            SubCategoryItem subCategoryItem3 = new SubCategoryItem();
            subCategoryItem3.setCategoryId(String.valueOf(j));
            subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem3.setSubCategoryName("Légumes Surgelés");
            arSubCategory.add(subCategoryItem3);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("3");
        dataItem.setCategoryName("LAITAGES");
        arSubCategory = new ArrayList<>();
        for(int k = 1; k < 2; k++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(k));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Yaourts");
            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(k));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Beurre");
            arSubCategory.add(subCategoryItem2);

            SubCategoryItem subCategoryItem3 = new SubCategoryItem();
            subCategoryItem3.setCategoryId(String.valueOf(k));
            subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem3.setSubCategoryName("Fromage");
            arSubCategory.add(subCategoryItem3);
        }

        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);



        dataItem = new DataItem();
        dataItem.setCategoryId("4");
        dataItem.setCategoryName("PETIT DEJ");
        arSubCategory = new ArrayList<>();
        for(int k = 1; k < 2; k++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(k));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Brioche");
            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(k));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Crêpes");
            arSubCategory.add(subCategoryItem2);
        }

        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);


        dataItem = new DataItem();
        dataItem.setCategoryId("5");
        dataItem.setCategoryName("PRODUITS FRAIS");
        arSubCategory = new ArrayList<>();
        for(int j = 1; j < 2; j++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(j));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Salade");
            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(j));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Pommes de Terre");
            arSubCategory.add(subCategoryItem2);

            SubCategoryItem subCategoryItem3 = new SubCategoryItem();
            subCategoryItem3.setCategoryId(String.valueOf(j));
            subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem3.setSubCategoryName("Betteraves");
            arSubCategory.add(subCategoryItem3);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);


        dataItem = new DataItem();
        dataItem.setCategoryId("6");
        dataItem.setCategoryName("TRAITEUR");
        arSubCategory = new ArrayList<>();
        for(int j = 1; j < 2; j++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(j));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Entrées");
            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(j));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Plat Principal");
            arSubCategory.add(subCategoryItem2);

            SubCategoryItem subCategoryItem3 = new SubCategoryItem();
            subCategoryItem3.setCategoryId(String.valueOf(j));
            subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem3.setSubCategoryName("Pizza");
            arSubCategory.add(subCategoryItem3);


        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);



        dataItem = new DataItem();
        dataItem.setCategoryId("");
        dataItem.setCategoryName("BOUCHERIE");
        arSubCategory = new ArrayList<>();
        for(int j = 1; j < 2; j++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(j));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Boeuf");
            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(j));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Poulet");
            arSubCategory.add(subCategoryItem2);

            SubCategoryItem subCategoryItem3 = new SubCategoryItem();
            subCategoryItem3.setCategoryId(String.valueOf(j));
            subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem3.setSubCategoryName("Porc");
            arSubCategory.add(subCategoryItem3);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("8");
        dataItem.setCategoryName("EPICERIE");
        arSubCategory = new ArrayList<>();
        for(int j = 1; j < 2; j++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(j));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Café");
            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(j));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Conserves");
            arSubCategory.add(subCategoryItem2);

            SubCategoryItem subCategoryItem3 = new SubCategoryItem();
            subCategoryItem3.setCategoryId(String.valueOf(j));
            subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem3.setSubCategoryName("Sauces");
            arSubCategory.add(subCategoryItem3);


        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);

        dataItem = new DataItem();
        dataItem.setCategoryId("9");
        dataItem.setCategoryName("BOISSONS");
        arSubCategory = new ArrayList<>();
        for(int j = 1; j < 2; j++) {

            SubCategoryItem subCategoryItem = new SubCategoryItem();
            subCategoryItem.setCategoryId(String.valueOf(j));
            subCategoryItem.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem.setSubCategoryName("Eau");
            arSubCategory.add(subCategoryItem);

            SubCategoryItem subCategoryItem2 = new SubCategoryItem();
            subCategoryItem2.setCategoryId(String.valueOf(j));
            subCategoryItem2.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem2.setSubCategoryName("Jus de Fruit");
            arSubCategory.add(subCategoryItem2);

            SubCategoryItem subCategoryItem3 = new SubCategoryItem();
            subCategoryItem3.setCategoryId(String.valueOf(j));
            subCategoryItem3.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            subCategoryItem3.setSubCategoryName("Vin");
            arSubCategory.add(subCategoryItem3);
        }
        dataItem.setSubCategory(arSubCategory);
        arCategory.add(dataItem);


        Log.d("TAG", "setupReferences: "+arCategory.size());

        for(DataItem data : arCategory){
//                        Log.i("Item id",item.id);
            ArrayList<HashMap<String, String>> childArrayList =new ArrayList<HashMap<String, String>>();
            HashMap<String, String> mapParent = new HashMap<String, String>();

            mapParent.put(ConstantManager.Parameter.CATEGORY_ID,data.getCategoryId());
            mapParent.put(ConstantManager.Parameter.CATEGORY_NAME,data.getCategoryName());

            int countIsChecked = 0;
            for(SubCategoryItem subCategoryItem : data.getSubCategory()) {

                HashMap<String, String> mapChild = new HashMap<String, String>();
                mapChild.put(ConstantManager.Parameter.SUB_ID,subCategoryItem.getSubId());
                mapChild.put(ConstantManager.Parameter.SUB_CATEGORY_NAME,subCategoryItem.getSubCategoryName());
                mapChild.put(ConstantManager.Parameter.CATEGORY_ID,subCategoryItem.getCategoryId());
                mapChild.put(ConstantManager.Parameter.IS_CHECKED,subCategoryItem.getIsChecked());

                if(subCategoryItem.getIsChecked().equalsIgnoreCase(ConstantManager.CHECK_BOX_CHECKED_TRUE)) {

                    countIsChecked++;
                }
                childArrayList.add(mapChild);
            }

            if(countIsChecked == data.getSubCategory().size()) {

                data.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_TRUE);
            }else {
                data.setIsChecked(ConstantManager.CHECK_BOX_CHECKED_FALSE);
            }

            mapParent.put(ConstantManager.Parameter.IS_CHECKED,data.getIsChecked());
            childItems.add(childArrayList);
            parentItems.add(mapParent);

        }

        ConstantManager.parentItems = parentItems;
        ConstantManager.childItems = childItems;

        myCategoriesExpandableListAdapter = new MyCategoriesExpandableListAdapter(this,parentItems,childItems,false);
        lvCategory.setAdapter(myCategoriesExpandableListAdapter);
    }
}


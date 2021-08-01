package com.example.cit_assigmnet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText shoename;
    Button searchBtn;

    ArrayList<Shoe> shoeList;

    TextView mName, mPrice;
    ImageView shoeImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shoeList = new ArrayList<>();
        shoeList.add(new Shoe("PUMA", "5000 BDT ", R.drawable.puma));
        shoeList.add(new Shoe("BATA", "4000 BDT ", R.drawable.bata));
        shoeList.add(new Shoe("Lotto", "1500 BDT ", R.drawable.loto));
        shoeList.add(new Shoe("APEX", "6000 BDT ", R.drawable.apex));

        shoename = findViewById(R.id.shoename);
        searchBtn = findViewById(R.id.carSearchBtn);

        mName = findViewById(R.id.mName);
        mPrice = findViewById(R.id.mPrice);
        shoeImage = findViewById(R.id.shoeimg);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = shoename.getText().toString().toLowerCase();

                for (Shoe shoe : shoeList) {

                    String sName = shoe.getName().toLowerCase();

                    if (sName.equals(name)) {

                        mName.setText(shoe.getName());
                        mPrice.setText(shoe.getPrice());
                        shoeImage.setImageResource(shoe.getImageId());


                    }


                }


            }
        });


    }
    }


package com.hfad.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //This is the second important change

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onClickFindBeer(View view)
    {
         TextView brands = (TextView)findViewById(R.id.brands);

         Spinner color = (Spinner)findViewById(R.id.color);

         String beertype = String.valueOf(color.getSelectedItem());

        BeerExpert expert = new BeerExpert();
        List<String> brandslist = expert.getBrands(beertype);

        String output = "";

        for(int i = 0; i < brandslist.size(); i++)
        {
            output = output + "\n" + brandslist.get(i);

        }

        brands.setText(output);


    }
}

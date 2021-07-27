package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.ui.login.Carpark;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity2 extends AppCompatActivity {
    private Button searchButton;
    private EditText edttxt_from;
    private String destin;
    private ArrayList<Carpark> carparks = new ArrayList<Carpark>();
    private static HttpURLConnection con;
    private String carpark1 = null;
    private String carpark2 = null;
    private String carpark3 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        searchButton = (Button) findViewById(R.id.search_button1);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //for the reading
                BufferedReader reader;
                String line;
                StringBuffer responseContent;
                URL url;
                //taking in input
                //TextInputLayout userInput = (TextInputLayout) findViewById(R.id.textInputEditText);
                //String destin = edttxt_from.getText().toString();
                TextInputEditText userInputRaw = findViewById(R.id.textInputEditText);
                String destin = userInputRaw.getText().toString();
                destin = destin.replace(" ", "+");

                //carparks has list of nus carparks
                initialiseCarparks();

                for (int i = 0; i < carparks.size(); i++) {
                    responseContent = new StringBuffer();
                    //coordinates of source
                    String source = Double.toString(carparks.get(i).getLatitude()) + "," +
                            Double.toString(carparks.get(i).getLongitude());

                    try {
                        url = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" +
                                source + "&destinations=" + destin + "&mode=walking" + "&key=" + "AIzaSyCR6sfBb4y7NBbUD3GUrSeqXWrfS33i3yg");
                        //System.out.println(url);
                        con = (HttpURLConnection) url.openConnection();
                        con.setRequestMethod("GET");
                        int status = con.getResponseCode();

                        if (status > 299) {
                            reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                            while ((line = reader.readLine()) != null) {
                                responseContent.append(line);
                            }
                            reader.close();
                        } else {
                            reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                            while ((line = reader.readLine()) != null) {
                                responseContent.append(line);
                            }
                            reader.close();
                        }

                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        con.disconnect();
                    }
                    // Store distance carpark object
                    //System.out.println(parse(String.valueOf(responseContent)));
                    carparks.get(i).setDistance(parse(String.valueOf(responseContent)));
                }

                // Find shortest 3
                Collections.sort(carparks, (x, y) -> Integer.compare(x.getDistance(),y.getDistance()));
                //return shortest 3
                carpark1 = carparks.get(0).getCarparkName();
                carpark2 = carparks.get(1).getCarparkName();
                carpark3 = carparks.get(2).getCarparkName();

                openSearchPage();
            }
        });
    }

    public int parse(String responseBody) {
        try {
            JSONObject obj = new JSONObject(responseBody);
            int distance = obj.getJSONArray("rows").
                    getJSONObject(0).
                    getJSONArray("elements").
                    getJSONObject(0).
                    getJSONObject("distance").
                    getInt("value");
            return distance;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public ArrayList<Carpark> addCarpark(ArrayList<Carpark> carpark, String carparkName,
                                         Double latitude, Double longitude) {
        Carpark someCarpark = new Carpark(carparkName, latitude, longitude);
        carpark.add(someCarpark);
        return carpark;
    }

    public void initialiseCarparks() {
        addCarpark(carparks, "1", 1.2975677078116878, 103.77015586657782);
        addCarpark(carparks, "2", 1.2998405672261002, 103.7723873563701);
        addCarpark(carparks, "2a", 1.3007301747509783, 103.7716317531538);
        addCarpark(carparks, "2b", 1.29992867522376, 103.77015471254435);
        addCarpark(carparks, "3", 1.3018442250774958, 103.77311780716984);
        addCarpark(carparks, "3a", 1.301722552224046, 103.7736381978458);
        addCarpark(carparks, "4", 1.300521195077713, 103.77372105477296);
        addCarpark(carparks,"5",1.300227019376883, 103.77475329750692);
        addCarpark(carparks,"10",1.2977958141168282, 103.78129395477842);
        addCarpark(carparks,"10a", 1.292226134238065, 103.78205157688579);
        addCarpark(carparks,"10b",1.2913043259776442, 103.7814760166348);
        addCarpark(carparks, "11", 1.2946989420200672, 103.77523030712143);
        addCarpark(carparks, "12", 1.292662684540365, 103.77466863306309);
        addCarpark(carparks, "12a", 1.2919510654623043, 103.77684973810733);
        addCarpark(carparks, "12b", 1.2926395005794848, 103.775659456393);
        addCarpark(carparks, "15", 1.293444697502716, 103.77126939331738);
        addCarpark(carparks, "16", 1.2955946922735562, 103.77111654396923);
        addCarpark(carparks,"src",1.3045556168327332, 103.77207348497254);
    }


    public void openSearchPage() {
        Intent intent = new Intent(this, Search_result.class);
        intent.putExtra("carpark1", carpark1);
        intent.putExtra("carpark2", carpark2);
        intent.putExtra("carpark3", carpark3);
        startActivity(intent);
    }
}



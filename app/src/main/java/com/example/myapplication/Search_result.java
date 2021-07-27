package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search_result extends AppCompatActivity {
    private Button firstcarparkbutton;
    private Button secondcarparkbutton;
    private Button thirdcarparkbutton;
    private String carpark1 = null;
    private String carpark2 = null;
    private String carpark3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        Intent b = getIntent();
        if(b != null){
            carpark1 = b.getStringExtra("carpark1").toString();
            carpark2 = b.getStringExtra("carpark2").toString();
            carpark3 = b.getStringExtra("carpark3").toString();
            System.out.println(carpark1);
            System.out.println(carpark2);
            System.out.println(carpark3);
        }

        firstcarparkbutton = (Button) findViewById(R.id.firstcarpark);
        firstcarparkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (carpark1.equals("1")) {
                    openCarpark1Page();
                }
                else if ( carpark1.equals("2")) {
                    openCarpark2Page();
                }
                else if ( carpark1.equals("2a")) {
                    openCarpark2aPage();
                }
                else if ( carpark1.equals("2b")) {
                    openCarpark2bPage();
                }
                else if ( carpark1.equals("3")) {
                    openCarpark3Page();
                }
                else if ( carpark1.equals("3a")) {
                    openCarpark3aPage();
                }
                else if ( carpark1.equals("4")) {
                    openCarpark4Page();
                }
                else if ( carpark1.equals("5")) {
                    openCarpark5Page();
                }
                else if ( carpark1.equals("10")) {
                    openCarpark10Page();
                }
                else if ( carpark1.equals("10a")) {
                    openCarpark10aPage();
                }
                else if ( carpark1.equals("10b")) {
                    openCarpark10bPage();
                }
                else if ( carpark1.equals("11")) {
                    openCarpark11Page();
                }
                else if ( carpark1.equals("12")) {
                    openCarpark12Page();
                }
                else if ( carpark1.equals("12a")) {
                    openCarpark12aPage();
                }
                else if ( carpark1.equals("12b")) {
                    openCarpark12bPage();
                }
                else if ( carpark1.equals("15")) {
                    openCarpark15Page();
                }
                else if ( carpark1.equals("16")) {
                    openCarpark16Page();
                }
                else if ( carpark1.equals("src")) {
                    openCarparksrcPage();
                }
                else {
                    openCarpark1Page();
                }
            }
        });

        secondcarparkbutton = (Button) findViewById(R.id.secondcarpark);
        secondcarparkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (carpark2.equals("1")) {
                    openCarpark1Page();
                }
                else if ( carpark2.equals("2")) {
                    openCarpark2Page();
                }
                else if ( carpark2.equals("2a")) {
                    openCarpark2aPage();
                }
                else if ( carpark2.equals("2b")) {
                    openCarpark2bPage();
                }
                else if ( carpark2.equals("3")) {
                    openCarpark3Page();
                }
                else if ( carpark2.equals("3a")) {
                    openCarpark3aPage();
                }
                else if ( carpark2.equals("4")) {
                    openCarpark4Page();
                }
                else if ( carpark2.equals("5")) {
                    openCarpark5Page();
                }
                else if ( carpark2.equals("10")) {
                    openCarpark10Page();
                }
                else if ( carpark2.equals("10a")) {
                    openCarpark10aPage();
                }
                else if ( carpark2.equals("10b")) {
                    openCarpark10bPage();
                }
                else if ( carpark2.equals("11")) {
                    openCarpark11Page();
                }
                else if ( carpark2.equals("12")) {
                    openCarpark12Page();
                }
                else if ( carpark2.equals("12a")) {
                    openCarpark12aPage();
                }
                else if ( carpark2.equals("12b")) {
                    openCarpark12bPage();
                }
                else if ( carpark2.equals("15")) {
                    openCarpark15Page();
                }
                else if ( carpark2.equals("16")) {
                    openCarpark16Page();
                }
                else if ( carpark2.equals("src")) {
                    openCarparksrcPage();
                }
                else {
                    openCarpark1Page();
                }
            }
        });

        thirdcarparkbutton = (Button) findViewById(R.id.thirdcarpark);
        thirdcarparkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (carpark3.equals("1")) {
                    openCarpark1Page();
                }
                else if ( carpark3.equals("2")) {
                    openCarpark2Page();
                }
                else if ( carpark3.equals("2a")) {
                    openCarpark2aPage();
                }
                else if ( carpark3.equals("2b")) {
                    openCarpark2bPage();
                }
                else if ( carpark3.equals("3")) {
                    openCarpark3Page();
                }
                else if ( carpark3.equals("3a")) {
                    openCarpark3aPage();
                }
                else if ( carpark3.equals("4")) {
                    openCarpark4Page();
                }
                else if ( carpark3.equals("5")) {
                    openCarpark5Page();
                }
                else if ( carpark3.equals("10")) {
                    openCarpark10Page();
                }
                else if ( carpark3.equals("10a")) {
                    openCarpark10aPage();
                }
                else if ( carpark3.equals("10b")) {
                    openCarpark10bPage();
                }
                else if ( carpark3.equals("11")) {
                    openCarpark11Page();
                }
                else if ( carpark3.equals("12")) {
                    openCarpark12Page();
                }
                else if ( carpark3.equals("12a")) {
                    openCarpark12aPage();
                }
                else if ( carpark3.equals("12b")) {
                    openCarpark12bPage();
                }
                else if ( carpark3.equals("15")) {
                    openCarpark15Page();
                }
                else if ( carpark3.equals("16")) {
                    openCarpark16Page();
                }
                else if ( carpark3.equals("src")) {
                    openCarparksrcPage();
                }
                else {
                    openCarpark1Page();
                }
            }
        });
    }

    public void openCarpark1Page() {
        Intent intent = new Intent(this, Carpark1.class);
        startActivity(intent);
    }
    public void openCarpark2Page() {
        Intent intent = new Intent(this, Carpark2.class);
        startActivity(intent);
    }
    public void openCarpark2aPage() {
        Intent intent = new Intent(this, Carpark2a.class);
        startActivity(intent);
    }
    public void openCarpark2bPage() {
        Intent intent = new Intent(this, Carpark2b.class);
        startActivity(intent);
    }
    public void openCarpark3Page() {
        Intent intent = new Intent(this, Carpark3.class);
        startActivity(intent);
    }
    public void openCarpark3aPage() {
        Intent intent = new Intent(this, Carpark3a.class);
        startActivity(intent);
    }
    public void openCarpark4Page() {
        Intent intent = new Intent(this, Carpark4.class);
        startActivity(intent);
    }
    public void openCarpark5Page() {
        Intent intent = new Intent(this, Carpark5.class);
        startActivity(intent);
    }
    public void openCarpark10Page() {
        Intent intent = new Intent(this, Carpark10.class);
        startActivity(intent);
    }
    public void openCarpark10aPage() {
        Intent intent = new Intent(this, Carpark10a.class);
        startActivity(intent);
    }
    public void openCarpark10bPage() {
        Intent intent = new Intent(this, Carpark10b.class);
        startActivity(intent);
    }
    public void openCarpark11Page() {
        Intent intent = new Intent(this, Carpark11.class);
        startActivity(intent);
    }
    public void openCarpark12Page() {
        Intent intent = new Intent(this, Carpark12.class);
        startActivity(intent);
    }
    public void openCarpark12aPage() {
        Intent intent = new Intent(this, Carpark12a.class);
        startActivity(intent);
    }
    public void openCarpark12bPage() {
        Intent intent = new Intent(this, Carpark12b.class);
        startActivity(intent);
    }
    public void openCarpark15Page() {
        Intent intent = new Intent(this, Carpark15.class);
        startActivity(intent);
    }
    public void openCarpark16Page() {
        Intent intent = new Intent(this, Carpark16.class);
        startActivity(intent);
    }
    public void openCarparksrcPage() {
        Intent intent = new Intent(this, Carparksrc.class);
        startActivity(intent);
    }


/*
    public void openCarpark1Page() {
        System.out.println(carpark1 == "1");
        if (carpark1 == "1") {
            Intent intent = new Intent(this, Carpark1.class);
            startActivity(intent);
        }
        else if ( carpark1 == "2") {
            Intent intent = new Intent(this, Carpark2.class);
            startActivity(intent);
        }
        else if ( carpark1 == "2a") {
            Intent intent = new Intent(this, Carpark2a.class);
            startActivity(intent);
        }
        else if ( carpark1== "2b") {
            Intent intent = new Intent(this, Carpark2b.class);
            startActivity(intent);
        }
        else if ( carpark1== "3") {
            Intent intent = new Intent(this, Carpark3.class);
            startActivity(intent);
        }
        else if ( carpark1== "3a") {
            Intent intent = new Intent(this, Carpark3a.class);
            startActivity(intent);
        }
        else if ( carpark1 == "4") {
            Intent intent = new Intent(this, Carpark4.class);
            startActivity(intent);
        }
        else if ( carpark1 == "5") {
            Intent intent = new Intent(this, Carpark5.class);
            startActivity(intent);
        }
        else if ( carpark1 == "10") {
            Intent intent = new Intent(this, Carpark10.class);
            startActivity(intent);
        }
        else if ( carpark1 == "10b") {
            Intent intent = new Intent(this, Carpark10b.class);
            startActivity(intent);
        }
        else if ( carpark1 == "11") {
            Intent intent = new Intent(this, Carpark11.class);
            startActivity(intent);
        }
        else if ( carpark1== "12") {
            Intent intent = new Intent(this, Carpark12.class);
            startActivity(intent);
        }
        else if ( carpark1 == "12a") {
            Intent intent = new Intent(this, Carpark12a.class);
            startActivity(intent);
        }
        else if ( carpark1 == "12b") {
            Intent intent = new Intent(this, Carpark12b.class);
            startActivity(intent);
        }
        else if ( carpark1 == "15") {
            Intent intent = new Intent(this, Carpark15.class);
            startActivity(intent);
        }
        else if ( carpark1 == "16") {
            Intent intent = new Intent(this, Carpark16.class);
            startActivity(intent);
        }
        else if ( carpark1 == "src") {
            Intent intent = new Intent(this, Carparksrc.class);
            startActivity(intent);
        }

        else {
            Intent intent = new Intent(this, Carpark1.class);
            startActivity(intent);
        }
    }

    public void openCarpark2Page() {
        if (carpark2 == "1") {
            Intent intent = new Intent(this, Carpark1.class);
            startActivity(intent);
        }
        else if (carpark2 == "2") {
            Intent intent = new Intent(this, Carpark2.class);
            startActivity(intent);
        }
        else if ( carpark2 == "2a") {
            Intent intent = new Intent(this, Carpark2a.class);
            startActivity(intent);
        }
        else if ( carpark2 == "2b") {
            Intent intent = new Intent(this, Carpark2b.class);
            startActivity(intent);
        }
        else if ( carpark2 == "3") {
            Intent intent = new Intent(this, Carpark3.class);
            startActivity(intent);
        }
        else if ( carpark2 == "3a") {
            Intent intent = new Intent(this, Carpark3a.class);
            startActivity(intent);
        }
        else if ( carpark2 == "4") {
            Intent intent = new Intent(this, Carpark4.class);
            startActivity(intent);
        }
        else if ( carpark2 == "5") {
            Intent intent = new Intent(this, Carpark5.class);
            startActivity(intent);
        }
        else if ( carpark2 == "10") {
            Intent intent = new Intent(this, Carpark10.class);
            startActivity(intent);
        }
        else if ( carpark2 == "10b") {
            Intent intent = new Intent(this, Carpark10b.class);
            startActivity(intent);
        }
        else if ( carpark2 == "11") {
            Intent intent = new Intent(this, Carpark11.class);
            startActivity(intent);
        }
        else if ( carpark2 == "12") {
            Intent intent = new Intent(this, Carpark12.class);
            startActivity(intent);
        }
        else if ( carpark2 == "12a") {
            Intent intent = new Intent(this, Carpark12a.class);
            startActivity(intent);
        }
        else if ( carpark2 == "12b") {
            Intent intent = new Intent(this, Carpark12b.class);
            startActivity(intent);
        }
        else if ( carpark2 == "15") {
            Intent intent = new Intent(this, Carpark15.class);
            startActivity(intent);
        }
        else if ( carpark2 == "16") {
            Intent intent = new Intent(this, Carpark16.class);
            startActivity(intent);
        }
        else if ( carpark2 == "src") {
            Intent intent = new Intent(this, Carparksrc.class);
            startActivity(intent);
        }

        else {
            Intent intent = new Intent(this, Carpark2.class);
            startActivity(intent);
        }
    }

    public void openCarpark3Page() {
        if ( carpark3 == "1") {
            Intent intent = new Intent(this, Carpark1.class);
            startActivity(intent);
        }
        else if ( carpark3 == "2") {
            Intent intent = new Intent(this, Carpark2.class);
            startActivity(intent);
        }
        else if ( carpark3 == "2a") {
            Intent intent = new Intent(this, Carpark2a.class);
            startActivity(intent);
        }
        else if ( carpark3 == "2b") {
            Intent intent = new Intent(this, Carpark2b.class);
            startActivity(intent);
        }
        else if ( carpark3 == "3") {
            Intent intent = new Intent(this, Carpark3.class);
            startActivity(intent);
        }
        else if ( carpark3 == "3a") {
            Intent intent = new Intent(this, Carpark3a.class);
            startActivity(intent);
        }
        else if ( carpark3 == "4") {
            Intent intent = new Intent(this, Carpark4.class);
            startActivity(intent);
        }
        else if ( carpark3 == "5") {
            Intent intent = new Intent(this, Carpark5.class);
            startActivity(intent);
        }
        else if ( carpark3 == "10") {
            Intent intent = new Intent(this, Carpark10.class);
            startActivity(intent);
        }
        else if ( carpark3 == "10b") {
            Intent intent = new Intent(this, Carpark10b.class);
            startActivity(intent);
        }
        else if ( carpark3 == "11") {
            Intent intent = new Intent(this, Carpark11.class);
            startActivity(intent);
        }
        else if ( carpark3 == "12") {
            Intent intent = new Intent(this, Carpark12.class);
            startActivity(intent);
        }
        else if ( carpark3 == "12a") {
            Intent intent = new Intent(this, Carpark12a.class);
            startActivity(intent);
        }
        else if ( carpark3 == "12b") {
            Intent intent = new Intent(this, Carpark12b.class);
            startActivity(intent);
        }
        else if ( carpark3 == "15") {
            Intent intent = new Intent(this, Carpark15.class);
            startActivity(intent);
        }
        else if ( carpark3 == "16") {
            Intent intent = new Intent(this, Carpark16.class);
            startActivity(intent);
        }
        else if ( carpark3 == "src") {
            Intent intent = new Intent(this, Carparksrc.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, Carpark3.class);
            startActivity(intent);
        }
    }*/
}
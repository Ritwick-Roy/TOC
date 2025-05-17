package com.example.toc_thaparonaclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    private ImageButton herupa;
    private ImageButton moodle;
    private ImageButton contacts;
    private ImageButton webkiosk;
    private ImageButton cgpa;
    private ImageButton mess;
    private ImageButton tt;
    private Button about;
    private ImageButton nearby;
    private ImageButton society;
    private ImageButton settings;
    private ImageButton hostel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        herupa=findViewById(R.id.myherupa);
        herupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                funherupa();
            }
        });
        moodle=findViewById(R.id.moodle);
        moodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                funmoodle();
            }
        });
        contacts=findViewById(R.id.contacts);
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funcontacts();
            }
        });
        webkiosk=findViewById(R.id.webkiosk);
        webkiosk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funwebkiosk();
            }
        });
        cgpa=findViewById(R.id.cgpacalculator);
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funcgpa();
            }
        });
        mess=findViewById(R.id.mess);
        mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funmess();
            }
        });
        tt=findViewById(R.id.time_table);
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funtt();
            }
        });
        Button about = findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                funabout();
            }
        });
        nearby=findViewById(R.id.nearby_places);
        nearby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funnearby();
            }
        });
        society=findViewById(R.id.society);
        society.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funsociety();
            }
        });
        settings=findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funsettings();
            }
        });
        hostel=findViewById(R.id.hostel);
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funhostel();
            }
        });
    }

    private void funhostel() {
        Toast.makeText(this, "Hostel Information...", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Hostel.class);
        startActivity(intent);
    }

    private void funsettings() {
        Toast.makeText(this, "Opening Settings...", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }

    private void funsociety() {
        Toast.makeText(this, "Opening Link...", Toast.LENGTH_LONG).show();
        Uri her=Uri.parse("https://www.thapar.edu/students/pages/student-societies");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, her);
        startActivity(launchBrowser);
    }

    private void funnearby() {
        Toast.makeText(this, "Some Nearby Places for you to visit.", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Nearby.class);
        startActivity(intent);
    }

    private void funabout() {
        Intent intent=new Intent(this,About.class);
        startActivity(intent);
    }

    private void funtt() {
        Toast.makeText(this, "Opening Time-Table", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Timetable.class);
        startActivity(intent);
    }

    private void funmess() {
        Toast.makeText(this, "Opening Mess menu", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Mess.class);
        startActivity(intent);
    }

    private void funcgpa() {
        Toast.makeText(this, "Opening CGPA Calculator", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Cgpacalculator.class);
        startActivity(intent);
    }

    private void funwebkiosk() {
        Toast.makeText(this, "Opening Web Kiosk....", Toast.LENGTH_LONG).show();
        Uri her=Uri.parse("https://webkiosk.thapar.edu/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, her);
        startActivity(launchBrowser);
    }

    private void funcontacts() {
        Toast.makeText(this, "Important Contacts", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Numbers.class);
        startActivity(intent);
    }

    private void funherupa() {
        Toast.makeText(this, "Opening My Herupa.....", Toast.LENGTH_LONG).show();
        Uri her=Uri.parse("https://myherupa.com/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, her);
        startActivity(launchBrowser);
    }
    private void funmoodle() {
        Toast.makeText(this, "Opening Thapar LMS.....", Toast.LENGTH_LONG).show();
        Uri her=Uri.parse("https://lms.thapar.edu/moodle/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, her);
        startActivity(launchBrowser);
    }

//    public static void buttonEffect(View button){
//        button.setOnTouchListener(new View.OnTouchListener() {
//
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN: {
//                        v.getBackground().setColorFilter(0xeff9800, PorterDuff.Mode.SRC_ATOP);
//                        v.invalidate();
//                        break;
//                    }
//                    case MotionEvent.ACTION_UP: {
//                        v.getBackground().clearColorFilter();
//                        v.invalidate();
//                        break;
//                    }
//                }
//                return false;
//            }
//        });
//    }
}





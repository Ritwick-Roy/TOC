package com.example.toc_thaparonaclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import java.io.File;
import com.pdftron.pdf.config.ViewerConfig;
import com.pdftron.pdf.controls.DocumentActivity;

public class Hostel extends AppCompatActivity {
    private Button button;
    private Button rules;
    private Button circ;
    private Button fees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostel);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funbutton();
            }
        });
        rules=findViewById(R.id.button2);
        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funrules();
            }
        });
        circ=findViewById(R.id.button3);
        circ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funcirc();
            }
        });
        fees=findViewById(R.id.button4);
        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                funfees();
            }
        });

    }

    private void funcirc() {
        ViewerConfig config = new ViewerConfig.Builder().openUrlCachePath(this.getCacheDir().getAbsolutePath()).build();
        final Uri fileLink = Uri.parse("https://www.thapar.edu/images/pdf/Hostel%20Facilities.pdf");
        DocumentActivity.openDocument(this, fileLink, config);
    }

    private void funfees() {
        ViewerConfig config = new ViewerConfig.Builder().openUrlCachePath(this.getCacheDir().getAbsolutePath()).build();
        final Uri fileLink = Uri.parse("https://www.thapar.edu/upload/files/Hostel_Fee_Circular_for_Odd_Semester_2019-20(2).pdf");
        DocumentActivity.openDocument(this, fileLink, config);
    }
    private void funrules() {
        ViewerConfig config = new ViewerConfig.Builder().openUrlCachePath(this.getCacheDir().getAbsolutePath()).build();
        final Uri fileLink = Uri.parse("http://bvec.in/pdf/hostel_rules_regulations.pdf");
        DocumentActivity.openDocument(this, fileLink, config);
    }
    private void funbutton() {
        Intent intent=new Intent(this,Studentstable.class);
        startActivity(intent);
    }
}
package de.emrij.pla;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class aufgaben extends AppCompatActivity {
    Button l1,l2,l3;
    TextView q;
    Random rn = new Random();
    int m;
    int a;
    int f;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.aufgaben);
        super.onCreate(savedInstanceState);
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        q = findViewById(R.id.q);
        onWuerfel();

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(l1.getText().toString().contains(f+"")){
                    Toast.makeText(aufgaben.this, "Korrekt!", Toast.LENGTH_SHORT).show();
                    onWuerfel();
                }else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(aufgaben.this);
                    ad.setTitle("Leider falsch!");
                    ad.setMessage("Die Lösung wäre: " +f+"\n\nVersuche es erneut!!");
                    ad.setPositiveButton("Ok, wiederhole", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            onWuerfel();
                            dialogInterface.cancel();
                        }
                    });
                    ad.show();
                }
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(l2.getText().toString().contains(f+"")){
                    Toast.makeText(aufgaben.this, "Korrekt!", Toast.LENGTH_SHORT).show();
                    onWuerfel();
                }else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(aufgaben.this);
                    ad.setTitle("Leider falsch!");
                    ad.setMessage("Die Lösung wäre: " +f+"\n\nVersuche es erneut!!");
                    ad.setPositiveButton("Ok, wiederhole", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            onWuerfel();
                            dialogInterface.cancel();
                        }
                    });
                    ad.show();
                }
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(l3.getText().toString().contains(f+"")){
                    Toast.makeText(aufgaben.this, "Korrekt!", Toast.LENGTH_SHORT).show();
                    onWuerfel();
                }else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(aufgaben.this);
                    ad.setTitle("Leider falsch!");
                    ad.setMessage("Die Lösung wäre: " +f+"\n\nVersuche es erneut!!");
                    ad.setPositiveButton("Ok, wiederhole", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            onWuerfel();
                            dialogInterface.cancel();
                        }
                    });
                    ad.show();
                }
            }
        });

    }

    @SuppressLint("SetTextI18n")
    public void onWuerfel(){
        m = rn.nextInt(10)+1;
        a = rn.nextInt(10)+1;
        f = m*a;

        q.setText("M="+m+" A="+a+" Wie groß ist F?");

        int w1 = rn.nextInt(100)+1;
        int w2 = rn.nextInt(100)+1;
        if(w1 == f){
            w1++;
        }
        if(w2 == f){
            w2++;
        }
        int whichButton = rn.nextInt(3)+1;
        if(whichButton == 1){
            l1.setText("F="+f);
            l2.setText("F="+w1);
            l3.setText("F="+w2);
        } else if(whichButton == 2){
            l2.setText("F="+f);
            l1.setText("F="+w2);
            l3.setText("F="+w1);
        } else if(whichButton == 3){
            l3.setText("F="+f);
            l2.setText("F="+w1);
            l1.setText("F="+w2);
        }


    }
}

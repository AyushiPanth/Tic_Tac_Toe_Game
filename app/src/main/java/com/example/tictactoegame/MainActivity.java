package com.example.tictactoegame;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    AppCompatButton a,b,c,d,e,f,g,h,i,reset;
    String win;
    String count="0";
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reset=findViewById(R.id.reset);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");
                e.setText("");
                f.setText("");
                g.setText("");
                h.setText("");
                i.setText("");
                a.setClickable(true);
                b.setClickable(true);
                c.setClickable(true);
                d.setClickable(true);
                e.setClickable(true);
                f.setClickable(true);
                g.setClickable(true);
                h.setClickable(true);
                i.setClickable(true);
                win="no";


            }
        });







        a=findViewById(R.id.A);
        b=findViewById(R.id.B);
        c=findViewById(R.id.C);
        d=findViewById(R.id.D);
        e=findViewById(R.id.E);
        f=findViewById(R.id.F);
        g=findViewById(R.id.G);
        h=findViewById(R.id.H);
        i=findViewById(R.id.I);




        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               checker(a);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker(b);

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker(c);

            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker(d);

            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker(e);

            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker(f);

            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker(g);

            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker(h);

            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checker(i);

            }
        });








    }
    public void checker(AppCompatButton z)
    {




        if(count.equals("0"))
        {


            String st="x";
            z.setText(st);

            z.setTextSize(70);

            count="1";
            Toast.makeText(this, "Player 2 Turn", Toast.LENGTH_SHORT).show();
            z.setClickable(false);
            if(a.getText().equals(b.getText()) && b.getText().equals(c.getText()) && a.getText().equals(st) && b.getText().equals(st) && c.getText().equals(st))
            {
                win= a.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);


            }
            if(d.getText().equals(e.getText()) && e.getText().equals(f.getText()) && d.getText().equals(st) && e.getText().equals(st) && f.getText().equals(st))
            {
                win=d.getText().toString();

                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(g.getText().equals(h.getText()) && h.getText().equals(i.getText()) && g.getText().equals(st) && h.getText().equals(st) && i.getText().equals(st))
            {
                win= g.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);
            }
            if(a.getText().equals(d.getText()) && d.getText().equals(g.getText()) && a.getText().equals(st) && d.getText().equals(st) && g.getText().equals(st))
            {
                win= a.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(b.getText().equals(e.getText()) && e.getText().equals(h.getText()) && b.getText().equals(st) && e.getText().equals(st) && h.getText().equals(st))
            {
                win=b.getText().toString();

                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(c.getText().equals(f.getText()) && f.getText().equals(i.getText()) && c.getText().equals(st) && f.getText().equals(st) && i.getText().equals(st))
            {
                win= c.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);
            }
            if(a.getText().equals(e.getText()) && e.getText().equals(i.getText()) && a.getText().equals(st) && e.getText().equals(st) && i.getText().equals(st))
            {
                win= a.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(c.getText().equals(e.getText()) && e.getText().equals(g.getText()) && c.getText().equals(st) && e.getText().equals(st) && g.getText().equals(st))
            {
                win=d.getText().toString();

                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }









        }
        else if(count.equals("1"))
        {
            String st="o";
            z.setText(st);
            z.setTextSize(70);
            count="0";
            z.setClickable(false);
            Toast.makeText(this, "Player 1 Turn ", Toast.LENGTH_SHORT).show();
            if(a.getText().equals(b.getText()) && b.getText().equals(c.getText()) && a.getText().equals(st) && b.getText().equals(st) && c.getText().equals(st))
            {
                win= a.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(d.getText().equals(e.getText()) && e.getText().equals(f.getText()) && d.getText().equals(st) && e.getText().equals(st) && f.getText().equals(st))
            {
                win=d.getText().toString();

                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(g.getText().equals(h.getText()) && h.getText().equals(i.getText()) && g.getText().equals(st) && h.getText().equals(st) && i.getText().equals(st))
            {
                win= g.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);
            }

            if(a.getText().equals(d.getText()) && d.getText().equals(g.getText()) && a.getText().equals(st) && d.getText().equals(st) && g.getText().equals(st))
            {
                win= a.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(b.getText().equals(e.getText()) && e.getText().equals(h.getText()) && b.getText().equals(st) && e.getText().equals(st) && h.getText().equals(st))
            {
                win=b.getText().toString();

                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(c.getText().equals(f.getText()) && f.getText().equals(i.getText()) && c.getText().equals(st) && f.getText().equals(st) && i.getText().equals(st))
            {
                win= c.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);
            }
            if(a.getText().equals(e.getText()) && e.getText().equals(i.getText()) && a.getText().equals(st) && e.getText().equals(st) && i.getText().equals(st))
            {
                win= a.getText().toString();
                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }
            if(c.getText().equals(e.getText()) && e.getText().equals(g.getText()) && c.getText().equals(st) && e.getText().equals(st) && g.getText().equals(st))
            {
                win=d.getText().toString();

                Toast.makeText(this, win+" is winner", Toast.LENGTH_SHORT).show();
                a.setClickable(false);
                b.setClickable(false);
                c.setClickable(false);
                d.setClickable(false);
                e.setClickable(false);
                f.setClickable(false);
                g.setClickable(false);
                h.setClickable(false);
                i.setClickable(false);

            }



        }
    }
}

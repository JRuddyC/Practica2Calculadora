package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView pantalla;
    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,suma,resta,mult,div,elev,ap,close,res,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla=findViewById(R.id.pantalla);

        uno=findViewById(R.id.uno);
        dos=findViewById(R.id.dos);
        tres=findViewById(R.id.tres);
        cuatro=findViewById(R.id.cuatro);
        cinco=findViewById(R.id.cinco);
        seis=findViewById(R.id.seis);
        siete=findViewById(R.id.siete);
        ocho=findViewById(R.id.ocho);
        nueve=findViewById(R.id.nueve);
        cero=findViewById(R.id.cero);
        suma=findViewById(R.id.suma);
        resta=findViewById(R.id.resta);
        mult=findViewById(R.id.multiplicacion);
        div=findViewById(R.id.division);
        elev=findViewById(R.id.elevado);
        ap=findViewById(R.id.apertura);
        close=findViewById(R.id.cierre);
        reset=findViewById(R.id.reset);
        res=findViewById(R.id.igual);

        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        cero.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
        elev.setOnClickListener(this);
        ap.setOnClickListener(this);
        close.setOnClickListener(this);
        reset.setOnClickListener(this);
        res.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.uno:break;
            case R.id.dos:break;
            case R.id.tres:break;
            case R.id.cuatro:break;
            case R.id.cinco:break;
            case R.id.seis:break;
            case R.id.siete:break;
            case R.id.ocho:break;
            case R.id.nueve:break;
            case R.id.cero:break;
            case R.id.suma:break;
            case R.id.resta:break;
            case R.id.multiplicacion:break;
            case R.id.division:break;
            case R.id.elevado:break;
            case R.id.apertura:break;
            case R.id.cierre:break;
            case R.id.reset:break;
            case R.id.igual:break;
        }
    }
}

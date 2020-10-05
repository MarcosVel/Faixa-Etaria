package com.example.appfaixaetaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtFaixaEtaria;
    Button btnVerificarFaixaEtaria;
    TextView tvResultadoFaixaEtaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verificarFaixaEtaria(View v) {
        edtFaixaEtaria = (EditText)findViewById(R.id.txtIdade);
        tvResultadoFaixaEtaria = (TextView)findViewById(R.id.txtResultadoFaixaEtaria);
        Integer idade = Integer.parseInt(edtFaixaEtaria.getText().toString());
            // Estrutura de decisão
        if ((idade >= 0) && (idade <= 12)) {
            tvResultadoFaixaEtaria.setText("A idade dessa pessoa é de uma criança!");
        }
        else if ((idade > 12) && (idade < 18)) {
            tvResultadoFaixaEtaria.setText("A idade dessa pessoa é de um adolescente!");
        }
        else {
            tvResultadoFaixaEtaria.setText("A idade dessa pessoa é de um adulto!");
        }

    }
}
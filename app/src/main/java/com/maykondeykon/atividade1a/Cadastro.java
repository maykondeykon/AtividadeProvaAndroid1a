package com.maykondeykon.atividade1a;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String[] unidades = {"caixa", "lata", "litro"};
        ArrayAdapter<String> unidadesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, unidades);
        Spinner listaUnidades = (Spinner) findViewById(R.id.cbUnProd);
        listaUnidades.setAdapter(unidadesAdapter);

    }

    public void verificaClique(View v){
        if (R.id.btnSalvarProd == v.getId()){
            TextView nome = (TextView) findViewById(R.id.txtNomeProd);
             TextView desc = (TextView) findViewById(R.id.txtDescProd);
            Spinner un = (Spinner) findViewById(R.id.cbUnProd);
            RadioButton perec = (RadioButton) findViewById(R.id.rdPerecivelProd);
            CheckBox promo = (CheckBox) findViewById(R.id.checkPromoProd);
            TextView lim = (TextView) findViewById(R.id.txtLimEstProd);
            CheckBox refr = (CheckBox) findViewById(R.id.checkRefrigProd);

            Estoque estoque = new Estoque();
            estoque.setNome(nome.getText().toString());
            estoque.setDescricao(desc.getText().toString());
            estoque.setUnidade(un.getSelectedItem().toString());
            estoque.setPerecivel(perec.isChecked());
            estoque.setPromocao(promo.isChecked());
            estoque.setLimite(lim.getText().toString());
            estoque.setRefrigerado(refr.isChecked());

            //Toast.makeText(this, estoque.getNome().toString(), Toast.LENGTH_SHORT).show();

            Intent it = new Intent(this, Listar.class);
            Bundle params = new Bundle();
            params.putSerializable("estoque",estoque);
            it.putExtras(params);
            startActivity(it);

        }
    }

}

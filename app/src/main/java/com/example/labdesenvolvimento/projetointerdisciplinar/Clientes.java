package com.example.labdesenvolvimento.projetointerdisciplinar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Aurelio on 31/03/2017.
 */

public class Clientes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clientes);
    }

    public void openCadastro_Cliente(View v)
    {
        Intent intent = new Intent(getApplicationContext(),Cadastro_Cliente.class);
        startActivity(intent);
    }
    public void VoltaMenu(View v)
    {
        Intent intent = new Intent(getApplicationContext(),Menu.class);
        startActivity(intent);
    }
}

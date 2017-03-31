package com.example.labdesenvolvimento.projetointerdisciplinar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Aurelio on 31/03/2017.
 */

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void openClientes(View v)
    {
        Intent intent = new Intent(getApplicationContext(),Clientes.class);
        startActivity(intent);
    }
    public void openAgenda (View v)
    {
        Intent intent = new Intent(getApplicationContext(),Agenda.class);
        startActivity(intent);
    }

    public void VoltaMain(View v)
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}

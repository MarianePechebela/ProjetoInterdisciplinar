package com.example.labdesenvolvimento.projetointerdisciplinar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.AccessibleObject;

/**
 * Created by Aurelio on 31/03/2017.
 */

public class Cadastro_Cliente extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_cliente);
    }

    public void VoltaCliente(View v)
    {
        Intent intent = new Intent(getApplication(),Clientes.class);
        startActivity(intent);
    }
}

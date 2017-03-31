package com.example.labdesenvolvimento.projetointerdisciplinar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Aurelio on 31/03/2017.
 */

public class Agenda extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agenda);
    }

    public void openCadastro_Agenda(View v)
    {
        Intent intent = new Intent(getApplicationContext(),Cadastro_Agenda.class);
        startActivity(intent);
    }
    public void VoltaMenu(View v)
    {
        Intent intent = new Intent(getApplication(),Menu.class);
        startActivity(intent);
    }
}

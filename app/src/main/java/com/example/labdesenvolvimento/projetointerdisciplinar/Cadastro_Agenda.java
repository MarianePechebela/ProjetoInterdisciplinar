package com.example.labdesenvolvimento.projetointerdisciplinar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Aurelio on 31/03/2017.
 */

public class Cadastro_Agenda extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_agenda);
    }

    public void VoltaAgenda(View v)
    {
        Intent intent = new Intent(getApplication(),Agenda.class);
        startActivity(intent);
    }
}

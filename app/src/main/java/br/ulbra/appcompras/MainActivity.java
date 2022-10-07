package br.ulbra.appcompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {


    CheckBox cbArroz, cbLeite, cbCarne, cbFeijao;
    Button btTotal;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbArroz = (CheckBox) findViewById(R.id.cbArroz);
        cbLeite = (CheckBox) findViewById(R.id.cbLeite);
        cbCarne = (CheckBox) findViewById(R.id.cbCarne);
        cbFeijao = (CheckBox) findViewById(R.id.cbFeijao);
        Button btTotal = (Button) findViewById(R.id.btTotal);
        btTotal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (cbArroz.isChecked()) {
                    total += 2.69;
                }
                if (cbLeite.isChecked()) {
                    total += 5.00;
                }
                if (cbCarne.isChecked()) {
                    total += 9.7;
                }
                if (cbFeijao.isChecked()) {
                    total += 2.70;
                }
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Valor total da compra: " +String.valueOf(total));
                dialogo.setNeutralButton("OK",null);
                dialogo.show();
            }
        });
    }
}

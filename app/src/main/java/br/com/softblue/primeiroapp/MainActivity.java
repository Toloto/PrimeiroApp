package br.com.softblue.primeiroapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.textView);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void click(View view){
        Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_LONG).show();
    }

    /*public void clique(View view){
        //Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_LONG).show();
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView2);

        Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_LONG).show();
        textView.setText(editText.getText());
    }
*/
    //Codigo do Botão Entrar na Tela Home
    public void botaosair(View view){
        System.exit(0);
    }

    //Função Acessar Layout Pesquisas
    public void layout_pesquisas(View view){
        setContentView(R.layout.layout_pesquisas);
    }

    //Função Voltar para Home
    public void btn_voltarHome(View view){
        setContentView(R.layout.activity_main);
    }

    //Função Voltar para Menu Pesquisas
    public void btn_voltarPesq(View view){
        setContentView(R.layout.layout_pesquisas);
    }

    //Função Voltar para Menu Pesquisas Matricula
    public void btn_pesqMatricula(View view){
        setContentView(R.layout.layout_pesmatric);
    }
}

package com.example.demetrius.espetinhohome;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular;
    private Spinner spListacarne;
    private Spinner spListaFrango;
    private Spinner spListaCoracao;
    private Spinner spListaMisto;


    private EditText etCarne;
    private int carne;
    private int frango;
    private int coracao;
    private int misto;
    private int pao;
    private EditText etFrango;
    private EditText etCoracao;
    private EditText etMisto;
    private EditText etPao;
    private double carnepreco=0;
    private double frangopreco=0;
    private double mistopreco=0;
    private double paoprecopreco=0;
    private double coracaopreco=0;
    private double total = 0;


    private Button btnVisualizar;
    private Button btnOkCarne;
    private Button btnOkFrango;
    private Button btnOkCoracao;
    private Button btnOkMisto;
    private Button btnOkPao;
    private ListView lvEspetos;
    private Espeto p;
    private ArrayList<Espeto>espetos;
    EspetosAdapter espetosAdapter;
    private  TextView tvTipo;
    private  TextView tvQuantidade;
    private  ImageView ivEspeto;
    private String item;
    private Usuario usuario;
    private EditText tvvalor;
    private ArrayList respostas;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnOkCarne=(Button)findViewById(R.id.btnOkCarne);
        btnOkFrango=(Button)findViewById(R.id.btnOkFrango);
        btnOkCoracao=(Button)findViewById(R.id.btnOkCoracao);
        btnOkMisto=(Button)findViewById(R.id.btnOkMisto);
        btnOkPao=(Button)findViewById(R.id.btnOkPao);
        btnVisualizar=(Button)findViewById(R.id.btnVisualizar);
       lvEspetos=(ListView)findViewById(R.id.lvEspetos);
        spListacarne=(Spinner)findViewById(R.id.spListaCarne);
        spListaFrango=(Spinner)findViewById(R.id.spListaFrango);
        spListaCoracao=(Spinner)findViewById(R.id.spListaCoracao);
        spListaMisto=(Spinner)findViewById(R.id.spListaMisto);
        etCarne=(EditText) findViewById(R.id.etCarne);
        etFrango = (EditText) findViewById(R.id.etFrango);

        tvTipo=(TextView)findViewById(R.id.tvTipo);
        tvQuantidade=(TextView)findViewById(R.id.tvQuantidade);

        final EditText etMisto = (EditText) findViewById(R.id.etMisto);
        final EditText etCoracao = (EditText) findViewById(R.id.etCoracao);
        final EditText etPao = (EditText) findViewById(R.id.etPao);

        espetos=new ArrayList<Espeto>();
        espetosAdapter= new EspetosAdapter(this,espetos);
        lvEspetos.setAdapter(espetosAdapter);




        btnOkCarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carne=Integer.parseInt(etCarne.getText().toString());

                    if (carne>0){
                        p = new Espeto();
                        p.setTipo(item = (String) spListacarne.getSelectedItem());
                        p.setQuantdade(Integer.parseInt(etCarne.getText().toString()));
                        espetos.add(p);
                        espetosAdapter.notifyDataSetChanged();
                        p.setEspeto(R.drawable.icone_carne);
                        Toast.makeText(getBaseContext(), "Esse é seu pedido de carne!", Toast.LENGTH_SHORT).show();

                      }



            }});


        btnOkFrango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frango=Integer.parseInt(etFrango.getText().toString());
                    if (frango>0){
                    p = new Espeto();
                    p.setTipo(item = (String) spListaFrango.getSelectedItem());
                    p.setQuantdade(Integer.parseInt(etFrango.getText().toString()));
                    espetos.add(p);
                    espetosAdapter.notifyDataSetChanged();
                    p.setEspeto(R.drawable.icone_frango);
                    Toast.makeText(getBaseContext(), "Esse é seu pedido de frango!", Toast.LENGTH_SHORT).show();}

                }

        });

        btnOkCoracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coracao=Integer.parseInt(etCoracao.getText().toString());
                if (coracao>0) {
                    p = new Espeto();
                    p.setTipo(item = (String) spListaCoracao.getSelectedItem());
                    p.setQuantdade(Integer.parseInt(etCoracao.getText().toString()));
                    espetos.add(p);
                    espetosAdapter.notifyDataSetChanged();
                    p.setEspeto(R.drawable.icone_coracao);
                    Toast.makeText(getBaseContext(), "Esse é seu pedido de coração!", Toast.LENGTH_SHORT).show();}

            }
        });

        btnOkMisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                misto=Integer.parseInt(etMisto.getText().toString());
                if (misto>0) {
                    p = new Espeto();
                    p.setTipo(item = (String) spListaMisto.getSelectedItem());
                    p.setQuantdade(Integer.parseInt(etMisto.getText().toString()));
                    espetos.add(p);
                    espetosAdapter.notifyDataSetChanged();
                    p.setEspeto(R.drawable.icone_misto);
                    Toast.makeText(getBaseContext(), "Esse é seu pedido de misto!", Toast.LENGTH_SHORT).show();}

            }
        });

        btnOkPao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pao=Integer.parseInt(etPao.getText().toString());
                if (pao>0) {
                    p = new Espeto();
                    p.setTipo(etPao.getText().toString());
                    p.setQuantdade(Integer.parseInt(etCoracao.getText().toString()));
                    espetos.add(p);
                    espetosAdapter.notifyDataSetChanged();
                    p.setEspeto(R.drawable.icone_pao);
                    Toast.makeText(getBaseContext(), "Esse é seu pedido de pão!", Toast.LENGTH_SHORT).show();}

            }
        });





                spListacarne.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if (position==0){
                            carnepreco = Double.parseDouble(etCarne.getText().toString()) * 4.00;
                        }
                        else if (position==1){
                            carnepreco = Double.parseDouble(etCarne.getText().toString()) * 2.00;

                        }
                    }


                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                spListaFrango.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if (position==0){
                            frangopreco = Double.parseDouble(etFrango.getText().toString()) * 3.50;
                        }else {
                            frangopreco = Double.parseDouble(etFrango.getText().toString()) * 1.75;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                spListaMisto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if (position==0){
                            mistopreco = Double.parseDouble(etMisto.getText().toString()) * 3.00;
                        }else {
                            mistopreco = Double.parseDouble(etMisto.getText().toString()) * 1.50;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

                spListaCoracao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        if (position==0){
                            coracaopreco = Double.parseDouble(etCoracao.getText().toString()) * 4.00;
                        }else {
                            coracaopreco = Double.parseDouble(etCoracao.getText().toString()) * 2.00;
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });



        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total = carnepreco + frangopreco +  mistopreco +coracaopreco + paoprecopreco;
                paoprecopreco = Double.parseDouble(etPao.getText().toString()) * 0.80;
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Valor a pagar");
                dialog.setMessage("R$ " + total);
                dialog.setIcon(R.mipmap.ic_launcher);
                dialog.setNeutralButton("OK", null);
                dialog.show();
            }
        });


        lvEspetos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                            @Override
                            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                                Espeto pAux=espetosAdapter.getItem(position);
                               espetosAdapter.remove(pAux);
                                espetosAdapter.notifyDataSetChanged();
                                return true;
                            }
                        });
        btnVisualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usuario=new Usuario();
                usuario.setTotal((String) spListacarne.getSelectedItem());
                usuario.setQuantidade(Integer.parseInt(etCarne.getText().toString()));
                usuario.setTotal2((String) spListaFrango.getSelectedItem());
                usuario.setQuantidade2(Integer.parseInt(etFrango.getText().toString()));
                usuario.setTotal3((String) spListaCoracao.getSelectedItem());
                usuario.setQuantidade3(Integer.parseInt(etCoracao.getText().toString()));
                usuario.setTotal4((String) spListaMisto.getSelectedItem());
                usuario.setQuantidade4(Integer.parseInt(etMisto.getText().toString()));
                usuario.setTotal5("Pão");
                usuario.setQuantidade5(Integer.parseInt(etPao.getText().toString()));
                Intent it=new Intent(MainActivity.this,Main3Activity.class);
                it.putExtra("valor", (String) spListacarne.getSelectedItem());
                it.putExtra("quantidade",etCarne.getText().toString());

                String totalC=String.valueOf(carnepreco);
                String totalE=String.valueOf(frangopreco);
                String totalF=String.valueOf(coracaopreco);
                String totalG=String.valueOf(mistopreco);
                String totalH=String.valueOf(paoprecopreco);

                it.putExtra("valor2", (String) spListaFrango.getSelectedItem());
                it.putExtra("quantidade2",etFrango.getText().toString());
                it.putExtra("valor3", (String) spListaCoracao.getSelectedItem());
                it.putExtra("quantidade3",etCoracao.getText().toString());
                it.putExtra("valor4", (String) spListaMisto.getSelectedItem());
                it.putExtra("quantidade4",etMisto.getText().toString());
                it.putExtra("valor","Pão");
                it.putExtra("quantidade",etPao.getText().toString());
                it.putExtra("user",usuario);
                String totalD = String.valueOf(total);
                it.putExtra("valorPagamento",totalD);
                it.putExtra("valorUni1",totalC);
                it.putExtra("valorUni2",totalE);
                it.putExtra("valorUni3",totalF);
                it.putExtra("valorUni4",totalG);
                it.putExtra("valorUni5",totalH);
                startActivity(it);

            }
        });


    }
}
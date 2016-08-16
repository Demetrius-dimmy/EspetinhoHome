package com.example.demetrius.espetinhohome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private TextView tvvalor;
    private TextView tvQuantidade;
    private TextView tvValorUni1;
    private TextView tvValorUni2;
    private TextView tvValorUni3;
    private TextView tvValorUni4;
    private TextView tvValorUni5;
    private TextView tvPagamento;
    private TextView tvvalor2;
    private TextView tvQuantidade2;
    private TextView tvvalor3;
    private TextView tvQuantidade3;
    private TextView tvvalor4;
    private TextView tvQuantidade4;
    private TextView tvvalor5;
    private TextView tvQuantidade5;
    private Usuario usuario;
    private int valorv;

    public Main3Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvvalor=(TextView)findViewById(R.id.tvvalor);
        tvQuantidade=(TextView)findViewById(R.id.tvQuantidade);
        tvvalor2=(TextView)findViewById(R.id.tvvalor2);
        tvQuantidade2=(TextView)findViewById(R.id.tvQuantidade2);
        tvvalor3=(TextView)findViewById(R.id.tvvalor3);
        tvQuantidade3=(TextView)findViewById(R.id.tvQuantidade3);
        tvvalor4=(TextView)findViewById(R.id.tvvalor4);
        tvQuantidade4=(TextView)findViewById(R.id.tvQuantidade4);
        tvvalor5=(TextView)findViewById(R.id.tvvalor5);
        tvQuantidade5=(TextView)findViewById(R.id.tvQuantidade5);
        tvValorUni1=(TextView)findViewById(R.id.tvValorUni1);
        tvValorUni2=(TextView)findViewById(R.id.tvValorUni2);
        tvValorUni3=(TextView)findViewById(R.id.tvValorUni3);
        tvValorUni4=(TextView)findViewById(R.id.tvValorUni4);
        tvValorUni5=(TextView)findViewById(R.id.tvValorUni5);
        tvPagamento=(TextView)findViewById(R.id.tvPagamento);
        usuario=new Usuario();

        Bundle bundle=getIntent().getExtras();
        usuario=(Usuario)bundle.getSerializable("user");

        usuario.getTotal();

        String valor=getIntent().getStringExtra("tot");

        String valorUni1= (getIntent().getStringExtra("valorUni1"));
        String valorUni2=getIntent().getStringExtra("valorUni2");
        String valorUni3= (getIntent().getStringExtra("valorUni3"));
        String valorUni4=getIntent().getStringExtra("valorUni4");
        String valorUni5= (getIntent().getStringExtra("valorUni5"));
        String valorPagamento=getIntent().getStringExtra("valorPagamento");

        String quantidade4= (getIntent().getStringExtra("quantidade4"));
        String valor5=getIntent().getStringExtra("valor5");
        String quantidade5= (getIntent().getStringExtra("quantidade5"));

         valorv= Integer.parseInt(valorUni1);


        if (valorv>0) {
            tvvalor.setText("Espeto selecionado:" + usuario.getTotal());
        }
        tvQuantidade.setText("Quantidade selecionada:"+usuario.getQuantidade());
        tvvalor2.setText("Espeto selecionado:"+usuario.getTotal2());
        tvValorUni1.setText("Valor á pagar: "+valorUni1+"R$");
        tvValorUni2.setText("Valor á pagar: "+valorUni2+"R$");
        tvValorUni3.setText("Valor á pagar: "+valorUni3+"R$");
        tvValorUni4.setText("Valor a pagar: "+valorUni4+"R$");
        tvValorUni5.setText("Valor á pagar: "+valorUni5+"R$");
        tvPagamento.setText("Total a pagar: "+valorPagamento+"R$");

        tvQuantidade2.setText("Quantidade selecionada:"+usuario.getQuantidade2());
        tvvalor3.setText("Espeto selecionado:"+usuario.getTotal3());
        tvQuantidade3.setText("Quantidade selecionada:"+usuario.getQuantidade3());
        tvvalor4.setText("Espeto selecionado:"+usuario.getTotal4());
        tvQuantidade4.setText("Quantidade selecionada:"+usuario.getQuantidade4());
        tvvalor5.setText("Espeto selecionado:"+usuario.getTotal5());
        tvQuantidade5.setText("Quantidade selecionada:"+usuario.getQuantidade5());





    }


}

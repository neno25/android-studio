package com.examples.neno.utsapiserver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MoveWithObject extends AppCompatActivity {
    private TextView jadwal;
    private TextView waktu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        TextView jadwal = (TextView) findViewById(R.id.jadwal);
        TextView waktu = (TextView) findViewById(R.id.waktu);
        String jadwalsholat = getIntent().getStringExtra("jadwal");
        String waktusholat = getIntent().getStringExtra("waktu");

        jadwal.setText("NAMA : " + jadwalsholat);
        waktu.setText("NIM : " + waktusholat );
    }

    private String kota;
    private String tanggal;
    private String waktusholat;

    public MoveWithObject(String kota,String tanggal,String waktusholat){
        this.kota=kota;
        this.tanggal=tanggal;
        this.waktusholat=waktusholat;
    }
    public String getKota() {

        return kota;
    }
    public void setKota(String kota){
        this.kota=kota;
    }
    public String getTanggal() {
        return kota;
    }
    public void setTanggal(String tanggal){
        this.tanggal=tanggal;
    }
    public String getWaktusholat() {
        return waktusholat;
    }
}


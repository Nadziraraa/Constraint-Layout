package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ClassNama {
   private String Nama;

   //inisialisasi objek
    public ClassNama(String nama)
    {
        this.Nama=nama;
    }

    //membuat method getName untuk mengembalikkan nilai ke variabel nama
    public  String getName()
    {
        return this.Nama;
    }
}
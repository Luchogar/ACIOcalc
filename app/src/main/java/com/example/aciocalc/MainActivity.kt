package com.example.aciocalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        fun Calc(v: View){
            val n1=findViewById<EditText>(R.id.eT1N1)
            val n2=findViewById<EditText>(R.id.eT2N2)
            val res=findViewById<TextView>(R.id.result)
            val nume1:Float
            val nume2:Float
            val result:Float
            if (TextUtils.isEmpty(n1.text.toString())){
                n1.error="Ingresa un número"
                return
            }else{
                nume1=n1.text.toString().toFloat()
            }
            if (TextUtils.isEmpty(n2.text.toString())){
                n2.error="Ingresa un numero"
                return
            }else{
                nume2=n2.text.toString().toFloat()
            }
            when(v.id){
                R.id.B1S->{
                    result=nume1+nume2
                    res.text=result.toString()
                }
                R.id.B2R->{
                    result=nume1-nume2
                    res.text=result.toString()
                }
                R.id.B3M->{
                    result=nume1*nume2
                    res.text=result.toString()
                }
                R.id.B4D->{
                    if (nume2==0.0F){
                        Toast.makeText(this,"No se puede dividir por cero",Toast.LENGTH_SHORT).show()
                    }else{
                        result=nume1/nume2
                        res.text=result.toString()
                    }
                }
            }
        }
    }


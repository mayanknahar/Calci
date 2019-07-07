package com.marcos.calci

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numEvent(view:View){
        if(isNewOp==true){
            t1.setText("")
        }
        isNewOp=false
        val bSelect=view as Button
        var bSelectValue:String=t1.text.toString()
        when(bSelect.id){
            b0.id->{
                bSelectValue+="0"
            }
            b1.id->{
                bSelectValue+="1"
            }
            b2.id->{
                bSelectValue+="2"
            }
            b3.id->{
                bSelectValue+="3"
            }
            b4.id->{
                bSelectValue+="4"
            }
            b5.id->{
                bSelectValue+="5"
            }
            b6.id->{
                bSelectValue+="6"
            }
            b7.id->{
                bSelectValue+="7"
            }
            b8.id->{
                bSelectValue+="8"
            }
            b9.id->{
                bSelectValue+="9"
            }
            bPoint.id->{
                bSelectValue+="."
            }
            bSign.id->{
                bSelectValue="-"+bSelectValue
            }
        }
        t1.setText(bSelectValue)
    }
var op=""
var oldValue=""
var isNewOp=true
    fun opEvent(view:View) {
        val bSelect = view as Button

        when (bSelect.id) {
            bDiv.id -> {
             op="/"
            }
            bMul.id -> {
               op="*"
            }
            bAdd.id -> {
                op="+"
            }
            bSub.id -> {
               op="-"
            }

        }
        oldValue=t1.text.toString()
        isNewOp=true
    }

    fun eqEvent(view:View){
        val newNum=t1.text.toString()
        var finalNum:Double?=null
        when(op){
            "*"->{
                finalNum=oldValue.toDouble()*newNum.toDouble()
            }
            "/"->{
                finalNum=oldValue.toDouble()/newNum.toDouble()
            }
            "+"->{
                finalNum=oldValue.toDouble()+newNum.toDouble()
            }
            "-"->{
                finalNum=oldValue.toDouble()-newNum.toDouble()
            }

        }
        t1.setText(finalNum.toString())
        isNewOp=true
    }

    fun allClear(view:View){
       t1.setText(" ")
        isNewOp=true
        }

    fun Percent(view:View){
        val number:Double=t1.text.toString().toDouble()/100
        t1.setText(number.toString())
        isNewOp=true
    }

}

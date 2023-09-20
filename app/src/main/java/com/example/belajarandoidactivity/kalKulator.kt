package com.example.belajarandoidactivity

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class kalKulator : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kal_kulator)

    var inputAngka1:EditText = findViewById(R.id.inputAngka1)
    var inputAnka2:EditText = findViewById(R.id.inputAngka2)
    val hasil:TextView = findViewById(R.id.hasilNya)
    val buttonTambah:Button = findViewById(R.id.buttonTambah)
        val buttonKurang:Button = findViewById(R.id.buttonKurang)
     val buttonPersen:Button = findViewById(R.id.buttonPersen)
     val buttonBagi:Button = findViewById(R.id.buttonBagi)
      val buttonKali:Button = findViewById(R.id.buttonKali)
        val buttonClear:Button = findViewById(R.id.buttonClear)

        val builder: AlertDialog.Builder = AlertDialog.Builder(this@kalKulator)

      buttonTambah.setOnClickListener {
          var angka1:Int = inputAngka1.text.toString().toInt()
          var angka2:Int = inputAnka2.text.toString().toInt()
          var hasilTambah:Int = angka1 + angka2
//          untuk menampilkan hasilnya(Object) pada Edittext
          hasil.setText(hasilTambah.toString())


      }

        buttonKurang.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAnka2.text.toString().toInt()
            var hasilKurang:Int = angka1 - angka2
//          untuk menampilkan hasilnya(Object) pada Edittext
            hasil.setText(hasilKurang.toString())


        }

        buttonPersen.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAnka2.text.toString().toInt()
            var hasilPersen:Int = angka1 % angka2
//          untuk menampilkan hasilnya(Object) pada Edittext
            hasil.setText(hasilPersen.toString())

        }

        buttonKali.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAnka2.text.toString().toInt()
            var hasilKali:Int = angka1 * angka2
//          untuk menampilkan hasilnya(Object) pada Edittext
            hasil.setText(hasilKali.toString())
        }

        buttonBagi.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAnka2.text.toString().toInt()
            var hasilBagi:Int = angka1 / angka2
//          untuk menampilkan hasilnya(Object) pada Edittext
            hasil.setText(hasilBagi.toString())
        }

        buttonClear.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAnka2.text.toString().toInt()
            val hasilClear:Int = 0
//          untuk menampilkan hasilnya(Object) pada Edittext
            hasil.setText(hasilClear.toString())
        }

        buttonClear.setOnClickListener {
            builder.setTitle("Perhatian!")
            builder.setTitle("U sure bout that? ")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener{dialog,which->
                inputAngka1.setText("")
                inputAnka2.setText("")
                hasil.text = "0"

            })

            builder.setNegativeButton("No", DialogInterface.OnClickListener{dialog, which->})
            builder.setIcon(R.drawable.baseline_info_24)
            val alertDialog:AlertDialog = builder.create()
            alertDialog.show()

        }



















    }


}
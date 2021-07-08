package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var aPerson: Person = Person("ali","123456","ali@gmail.com","123 jalan abc")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.person = aPerson
        binding.tvDisplayName.text = aPerson.name
        binding.tvDisplayNRIC.text = aPerson.nric
        binding.tvDisplayEmail.text = aPerson.email
        binding.tvDisplayAddress.text = aPerson.address


        binding.btnUpdate.setOnClickListener(){
            aPerson.name = "LKK"
            aPerson.nric = "67890"
            aPerson.email = "asdf@gmail.com"
            aPerson.address = "jalan qwer"
            binding.invalidateAll()
        }
        /*
        var tvName: TextView = findViewById<TextView>(R.id.tvName)
        var tvIC: TextView = findViewById<TextView>(R.id.tvNRIC)
        var tvEmail: TextView = findViewById<TextView>(R.id.tvEmail)
        var tvAddress: TextView = findViewById<TextView>(R.id.tvAddress)
        */

    }
}
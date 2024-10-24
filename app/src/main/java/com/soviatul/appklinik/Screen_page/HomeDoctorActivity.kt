package com.soviatul.appklinik.Screen_page

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.soviatul.appklinik.R
import com.soviatul.appklinik.adapter.AdapterListDoctor
import com.soviatul.appklinik.adapter.AdpaterMenuIcon
import com.soviatul.appklinik.model.ModelIcon
import com.soviatul.appklinik.model.ModelListIcon

class HomeDoctorActivity : AppCompatActivity() {
    private lateinit var rv_list_doctor : RecyclerView
    private var homeDoctorAdapter : AdapterListDoctor? = null
    private lateinit var  menuItem :RecyclerView
    private var MenudoctorAdapter : AdpaterMenuIcon? = null
    //array data doctor
    private var doctorlist = mutableListOf<ModelListIcon>()
    private var itemMenuList = mutableListOf<ModelIcon>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_doctor)

        rv_list_doctor = findViewById(R.id.rv_list_doctor)
        menuItem = findViewById(R.id.rv_listmenu)
        itemMenuList = ArrayList()
        doctorlist = ArrayList()
        homeDoctorAdapter = AdapterListDoctor(this, doctorlist)
        MenudoctorAdapter = AdpaterMenuIcon(itemMenuList)



        var layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,1)
        rv_list_doctor!!.layoutManager = layoutManager
        rv_list_doctor!!.adapter = homeDoctorAdapter

        var layoutManager2 : RecyclerView.LayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        menuItem!!.layoutManager = layoutManager2
        menuItem!!.adapter = MenudoctorAdapter
        //bikin data dumy
        prepareDataDoctors()
        prepareDataMenu()



    }

    private fun prepareDataMenu() {
        var itemMenu = ModelIcon (
            R.drawable.icon_heart,
            "Heart",



            )
        itemMenuList.add(itemMenu)

        itemMenu = ModelIcon (
            R.drawable.icontooth,
            "Dentis"


        )
        itemMenuList.add(itemMenu)

        itemMenu = ModelIcon (
            R.drawable.icon_eye,
            "Epilogi"


        )
        itemMenuList.add(itemMenu)
        MenudoctorAdapter!!.notifyDataSetChanged()




    }

    private fun prepareDataDoctors() {
        var itemDoctor = ModelListIcon (
            "Soviatul Qhoziyah",
            R.drawable.dokter1,
            "Dentist",
            "100",
            "5.0",
            "23 Nov 2024",
            "4.00pm"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListIcon (
            "Haura Adisty",
            R.drawable.dokter2,
            "Ahli beda",
            "98",
            "5.0",
            "20 Oct 2024",
            "6.00am"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListIcon (
            "Nazira Hidayatullah",
            R.drawable.dokter3,
            "Ahli gizi",
            "90",
            "4.0",
            "01 marc 2024",
            "8.00am"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListIcon (
            "Shalu Safitri Arzuf",
            R.drawable.dokter4,
            "Dokter umum",
            "99",
            "4.9",
            "07 augst 2024",
            "10.00am"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListIcon (
            "Chelsi dan Zhahira",
            R.drawable.dokter5,
            "Dokter gigi",
            "97",
            "4.8",
            "18 feb 2024",
            "12.00am"

        )
        doctorlist.add(itemDoctor)

        itemDoctor = ModelListIcon (
            "Hanifah",
            R.drawable.dokter6,
            "Dokter kandungan",
            "99",
            "4.9",
            "09 may 2024",
            "09.30am"

        )
        doctorlist.add(itemDoctor)


        homeDoctorAdapter!!.notifyDataSetChanged()






    }
}
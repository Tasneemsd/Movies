package com.example.moviesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    lateinit var list:ArrayList<MovieData>
    lateinit var adapter:MoviesAdapter

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.rec)
        populateData()
        adapter=MoviesAdapter(list)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=LinearLayoutManager(this)

    }

    private fun populateData() {
        list=ArrayList<MovieData>()
        list.add(MovieData("AlaaModalaindi","Nani",R.drawable.alaa))
        list.add(MovieData("Baahubali","Prabhas",R.drawable.bahu))
        list.add(MovieData("Chandramukhi","Rajni",R.drawable.chan))
        list.add(MovieData("Dasara","Nani",R.drawable.das))
        list.add(MovieData("EEga","Nani",R.drawable.eega))
        list.add(MovieData("Fidaa","Varun",R.drawable.fidaa))
        list.add(MovieData("GangLeader","Nani",R.drawable.gang))
        list.add(MovieData("Hi nanna"," Nani",R.drawable.hi))
        list.add(MovieData("Nenu local","Nani",R.drawable.loc))
        list.add(MovieData("MCA","Nani",R.drawable.mca))











    }

}

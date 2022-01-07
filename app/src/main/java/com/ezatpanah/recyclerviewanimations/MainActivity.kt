package com.ezatpanah.recyclerviewanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ezatpanah.recyclerviewanimations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var nameList : MutableList<SampleModel> = mutableListOf()
    private lateinit var sampleAdapter: SampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()


        sampleAdapter= SampleAdapter(nameList)
        binding.apply {
            recyclerView.apply {
                layoutManager=LinearLayoutManager(this@MainActivity)
                adapter=sampleAdapter

            }
        }


    }


    private fun loadData(){
        nameList.add(SampleModel(1,"Reyhaneh"))
        nameList.add(SampleModel(2,"Emad"))
        nameList.add(SampleModel(3,"zahra"))
        nameList.add(SampleModel(4,"pejman"))
        nameList.add(SampleModel(5,"sara"))
        nameList.add(SampleModel(6,"nariman"))
        nameList.add(SampleModel(7,"hamide"))
        nameList.add(SampleModel(8,"farshad"))
        nameList.add(SampleModel(9,"simin"))
        nameList.add(SampleModel(10,"ali"))
        nameList.add(SampleModel(11,"fateme"))
        nameList.add(SampleModel(12,"reza"))
        nameList.add(SampleModel(13,"Reyhaneh"))
        nameList.add(SampleModel(14,"Emad"))
        nameList.add(SampleModel(15,"zahra"))
        nameList.add(SampleModel(16,"pejman"))
        nameList.add(SampleModel(17,"sara"))
        nameList.add(SampleModel(18,"nariman"))
        nameList.add(SampleModel(19,"hamide"))
        nameList.add(SampleModel(20,"farshad"))
        nameList.add(SampleModel(21,"simin"))
        nameList.add(SampleModel(22,"ali"))
        nameList.add(SampleModel(23,"fateme"))
        nameList.add(SampleModel(24,"reza"))
    }
}
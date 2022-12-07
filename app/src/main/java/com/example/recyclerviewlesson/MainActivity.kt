package com.example.recyclerviewlesson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlesson.adapter.UserAdapter
import com.example.recyclerviewlesson.databinding.ActivityMainBinding
import com.example.recyclerviewlesson.model.UserModel

class MainActivity : AppCompatActivity() {
    lateinit var adapter: UserAdapter
    lateinit var recyclerView: RecyclerView
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        recyclerView = binding.recView
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        adapter.setList(users())
    }
    fun users(): ArrayList<UserModel>{
        val userList = ArrayList<UserModel>()
        val user1 = UserModel("Батыр","Раимов")
        val user2 = UserModel("Батыр","Раимов")
        val user3 = UserModel("Батыр","Раимов")
        val user4 = UserModel("Батыр","Раимов")
        val user5 = UserModel("Батыр","Раимов")
        val user6 = UserModel("Батыр","Раимов")
        val user7 = UserModel("Батыр","Раимов")
        val user8 = UserModel("Батыр","Раимов")
        val user9 = UserModel("Батыр","Раимов")
        val user10 = UserModel("Батыр","Раимов")
        userList.add(user1)
        userList.add(user2)
        userList.add(user3)
        userList.add(user4)
        userList.add(user5)
        userList.add(user6)
        userList.add(user7)
        userList.add(user8)
        userList.add(user9)
        userList.add(user10)
        return userList
    }
}
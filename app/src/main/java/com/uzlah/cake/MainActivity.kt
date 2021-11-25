package com.uzlah.cake

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.uzlah.cake.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    private var list = arrayListOf<Cake>()
    private var title = "Mode List"

    private lateinit var adapter: ListCakeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        Rv_main.setHasFixedSize(true)
        list.addAll(CakeData.listData)
        addRecyclerViewList()
    }

    private fun addRecyclerViewList() {
        Rv_main.layoutManager = LinearLayoutManager(this)
        val listCakeAdapter = ListCakeAdapter(list)
        mainBinding.RvMain.layoutManager = LinearLayoutManager(this)
        Rv_main.adapter = listCakeAdapter

        listCakeAdapter.setOnClickCallback(object : ListCakeAdapter.OnItemClickCallBack{
            override fun onItemClicked(cakes: Cake) {
                setSelectedUsers(cakes)
            }
        })
    }

    private fun setSelectedUsers(users: Cake) {
        val intentDetail = Intent(this@MainActivity, DetailActivity::class.java)
        intentDetail.putExtra(DetailActivity.EXTRA_USER, users)
        startActivity(intentDetail)
    }

    companion object{
        fun getLaunchService(from : Context)= Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

        private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.action_profile ->{
                intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
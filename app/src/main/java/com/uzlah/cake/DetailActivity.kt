package com.uzlah.cake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.uzlah.cake.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var detailBinding: ActivityDetailBinding
    private lateinit var cakes: Cake

    companion object {
        const val USER_DATA = "user_data"
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setContentView(detailBinding.root)
        cakes = intent.getParcelableExtra<Cake>(EXTRA_USER) as Cake

        showDetail()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun showDetail() {
        detailBinding.apply {
            Glide.with(this.root).load(cakes.photo).into(IvItemDetail)
            TvItemDetail.text = cakes.name
            TvPrice.text = cakes.price
            TvDesc.text = cakes.desc
        }
    }
}
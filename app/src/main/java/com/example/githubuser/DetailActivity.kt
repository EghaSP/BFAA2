package com.example.githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val tvDataReceiverImg: ImageView = findViewById(R.id.img_photo)
        val tvDataReceiverUsername:TextView = findViewById(R.id.tv_username)
        val tvDataReceiverName:TextView = findViewById(R.id.tv_name)
        val tvDataReceiverLocation:TextView = findViewById(R.id.tv_location)
        val tvDataReceiverRepository:TextView = findViewById(R.id.tv_repository)
        val tvDataReceiverCompany:TextView = findViewById(R.id.tv_company)
        val tvDataReceiverFollowers:TextView = findViewById(R.id.tv_followers)
        val tvDataReceiverFollowing:TextView = findViewById(R.id.tv_following)

        val usergit = intent.getParcelableExtra<User>("EXTRA_USER") as User

        val photo = usergit.avatar
        val username = usergit.username
        val name = usergit.name
        val location = usergit.location
        val repository = usergit.repository
        val company = usergit.company
        val followers = usergit.followers
        val following = usergit.following

        tvDataReceiverImg.setImageResource(photo)
        tvDataReceiverUsername.text = username
        tvDataReceiverName.text = name
        tvDataReceiverLocation.text = location
        tvDataReceiverRepository.text = repository
        tvDataReceiverCompany.text = company
        tvDataReceiverFollowers.text = followers
        tvDataReceiverFollowing.text = following
    }
}
package com.route.facebooktimeline.kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.route.facebooktimeline.R
import com.route.facebooktimeline.kotlin.adapters.PostsAdapter
import com.route.facebooktimeline.kotlin.models.PostDM

class MainActivity : AppCompatActivity() {
    lateinit var  postRecyclerView : RecyclerView
    private var adapter = PostsAdapter(
        listOf(
            PostDM("1", "John Doe", "Hello, this is my first post!", "10:00 AM"),
            PostDM("2", "Jane Smith", "Good morning everyone!", "10:05 AM"),
            PostDM("3", "Alice Johnson", "Loving the new timeline feature!", "10:10 AM"),
            PostDM("4", "Bob Brown", "Just had a great lunch!", "10:15 AM"),
            PostDM("5", "Charlie White", "Can't wait for the weekend!", "10:20 AM"),
            PostDM("6", "Diana Green", "Check out my new profile picture!", "10:25 AM"),
            PostDM("7", "Ethan Black", "Feeling grateful today.", "10:30 AM"),

        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        postRecyclerView = findViewById(R.id.TimeLineRecyclerView)
        postRecyclerView.adapter= adapter
    }
}
package com.route.facebooktimeline.kotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.route.facebooktimeline.R
import com.route.facebooktimeline.kotlin.models.PostDM

class PostsAdapter( private val posts: List<PostDM>  ) : androidx.recyclerview.widget.RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post = posts[position]
        holder.userNameTextView.text = post.userName
        holder.postContentTextView.text = post.postText
        holder.postTimeTextView.text = post.postTime
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    class PostViewHolder(private val  view : View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view) {
        val userNameTextView: TextView = view.findViewById(R.id.userName)
        val postContentTextView: TextView = view.findViewById(R.id.postText)
        val postTimeTextView: TextView = view.findViewById(R.id.timeStamp)

    }
}
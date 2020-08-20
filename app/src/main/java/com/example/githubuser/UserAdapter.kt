package com.eghasp.listusergit

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.githubuser.DetailActivity
import com.example.githubuser.R
import com.example.githubuser.User
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.item_list.view.*


class UserAdapter(private val listUser: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       // holder.bind(listUser[position])
        val usergit = listUser[position]
        Glide.with(holder.itemView.context)
            .load(usergit.avatar)
            .apply(RequestOptions().override(55, 55))
            .into(holder.img_photo)
        holder.txtUsername.text = usergit.username
        holder.txtName.text = usergit.name
        holder.txtLocation.text = usergit.location
        holder.txtRepository.text = usergit.repository
        holder.txtCompany.text = usergit.company
        holder.txtFollowers.text = usergit.followers
        holder.txtFollowing.text = usergit.following
        //holder.itemView.setOnClickListener (object :View.OnClickListener{
          //  override fun onClick(view: View) {
            //    onItemClickCallback.onItemClicked(listUser[holder.adapterPosition])
            //}
        //})

    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img_photo: ImageView = itemView.findViewById(R.id.img_photo)
        val txtUsername: TextView = itemView.findViewById(R.id.tv_username)
        val txtName: TextView = itemView.findViewById(R.id.tv_name)
        val txtLocation: TextView = itemView.findViewById(R.id.tv_location)
        val txtRepository: TextView = itemView.findViewById(R.id.tv_repository)
        val txtCompany: TextView = itemView.findViewById(R.id.tv_company)
        val txtFollowers: TextView = itemView.findViewById(R.id.tv_followers)
        val txtFollowing: TextView = itemView.findViewById(R.id.tv_following)


    }

    //interface OnItemClickCallback {
    //    fun onItemClicked(data: User)
    //}
}



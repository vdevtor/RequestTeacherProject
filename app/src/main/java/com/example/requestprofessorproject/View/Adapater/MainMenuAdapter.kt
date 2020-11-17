package com.example.requestprofessorproject.View.Adapater

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.requestprofessorproject.R
import com.example.requestprofessorproject.View.Activity.MainMenuActivity
import com.example.requestprofessorproject.View.Fragment.ShowInformationFragment
import com.example.requestprofessorproject.model.Bussiness.User
import kotlinx.android.synthetic.main.mode_tela_mainmenu.*
import kotlinx.android.synthetic.main.mode_tela_mainmenu.view.*

class MainMenuAdapter(
        public val userlist: List<User>,
        private val onItemClicked: (Int) -> Unit
) : RecyclerView.Adapter<MainMenuAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mode_tela_mainmenu, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(userlist[position], onItemClicked)


    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User, onItemClicked: (Int) -> Unit) = with(itemView) {
            Glide.with(itemView.context).load(user.imgBackgroundUser).into(ivMainItemBackground)
            Glide.with(itemView.context).load(user.imgAvatarUser).into(ivMainItemAvatar)

            nomeMainemenu.text = user.nome
            getfullinfo.text = user.fullInfo
            tvEspecialidade.text = user.esoecialidade

            expandbtn2.setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)


                if (expande.visibility == View.VISIBLE) {
                    expande.visibility = View.GONE
                    expandbtn.visibility = View.VISIBLE
                } else {
                }
            }


            expandbtn.setOnClickListener {
                onItemClicked(this@ViewHolder.adapterPosition)
                if (expande.visibility == View.GONE) {
                    expande.visibility = View.VISIBLE
                    expandbtn.visibility = View.GONE
                } else {
                }
            }


           ivMainItemAvatar.setOnClickListener {
              onItemClicked(this@ViewHolder.adapterPosition).apply {

              }


            }
        }
    }

}
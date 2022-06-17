package com.snotshot.codebusters.adapters

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.snotshot.codebusters.R
import com.snotshot.codebusters.codeSource.DB
import com.snotshot.codebusters.models.University

//class UniversitiesAdapter
//    (private val mContext: Context, private val mArrayList: ArrayList<University>) :
//    RecyclerView.Adapter<UniversitiesAdapter.ViewHolder>()
//{
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.university_item, parent, false)
//        return ViewHolder(view)
//    }
//    private lateinit var storageRef: StorageReference
//
//    @SuppressLint("SetTextI18n")
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val currentChat = mArrayList[position]
//
//        val db = DB()
//        val database = db.connectDB()
//        val path = "universities"
//        database.child(path).addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                val university = dataSnapshot.getValue<University>()
//            }
//            override fun onCancelled(databaseError: DatabaseError) {
//                Log.w(ContentValues.TAG, "loadPost:onCancelled", databaseError.toException())
//            }
//        })
//
//        val message = currentChat.last_message
//        if (message != null) {
//            if(message.sender == currentChat.contact_uid)
//                holder.last_message.text = message.text
//            else
//                holder.last_message.text = "You: " + message.text
//            holder.lastMessageTime.text = message.time
//        }
//
//        holder.itemView.setOnClickListener{val intent = Intent(mContext, ChatActivity::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//            intent.putExtra("uid", currentChat.contact_uid.toString())
//            intent.putExtra("chat_uid", currentChat.chat_uid.toString())
//            mContext.startActivity(intent)
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return mArrayList.size
//    }
//
//    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val contact_name: TextView = itemView.findViewById(R.id.contact_name_id)
//        val last_message: TextView = itemView.findViewById(R.id.last_message_id)
//        val progressBar: ProgressBar = itemView.findViewById(R.id.name_loading_bar)
//        val lastMessageTime: TextView = itemView.findViewById(R.id.last_message_time_id)
//        val profileImage: CircleImageView = itemView.findViewById(R.id.profile_image)
//
//    }
//
//    companion object {
//        // setting the TAG for debugging purposes
//        private const val TAG = "ChatAdapter"
//    }
//}
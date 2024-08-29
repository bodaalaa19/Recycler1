//package com.example.recyclerproject
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
// class UserAdapter(val users:List<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
//class UserViewHolder(val row:View):RecyclerView.ViewHolder(row){
////create objects to text views
//    val tvName=row.findViewById<TextView>(R.id.name)
//    val tvEmail=row.findViewById<TextView>(R.id.email)
//
//}
//
//     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
//         //convert xml file to view object and pass it to viewHolder
//         //محفوظه
//         val layout=LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
//    return UserViewHolder(layout)
//     }
//
//     override fun getItemCount(): Int {
//         return users.size
//     }
//
//     override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
//         //bind data in views
//         val user=users.get(position)
//         holder.tvName.text=user.name
//         holder.tvEmail.text=user.email
//
//     }
// }
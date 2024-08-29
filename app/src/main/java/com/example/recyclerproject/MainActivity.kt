package com.example.recyclerproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.recyclerproject.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
val Binding:ActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
Binding.appbar.materialAppbar.setOnMenuItemClickListener {
 when(it.itemId){
     R.id.Notification-> {
         Toast.makeText(this, getString(R.string.notification_clicked), Toast.LENGTH_SHORT).show()
     true

     }else->false
 } }
Binding.appbar.materialAppbar.setNavigationOnClickListener { Binding.drawer.open() }
        Binding.navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.reviews->{
                    Toast.makeText(this, getString(R.string.reviews_clicked), Toast.LENGTH_SHORT).show()
                    Binding.drawer.close()
                    true}
                R.id.favorite->{
                    Toast.makeText(this, getString(R.string.favorite_clicked), Toast.LENGTH_SHORT).show()
                    Binding.drawer.close()
                true}
R.id.search->{
    Toast.makeText(this, getString(R.string.search_clicked), Toast.LENGTH_SHORT).show()
    Binding.drawer.close()
true}
                R.id.profile->{
                    Toast.makeText(this, getString(R.string.profile_clicked), Toast.LENGTH_SHORT).show()
                    Binding.drawer.close()
                true}
                R.id.settings->{
                    Toast.makeText(this, getString(R.string.settings_clicked), Toast.LENGTH_SHORT).show()
                    Binding.drawer.close()
                true}
                else->false

            }

        }
        val books = mutableListOf<Book>(
          Book("One Hundred Years of Solitide","by Gabriel Marquez",R.drawable.solitude,3.5),
            Book("Terra Nostra","by carlos fuentes",R.drawable.nostra,4.0),
            Book("Angels & Demons","by Dan Brown",R.drawable.angels,4.5),
            Book("The Sword Thief","by Peter Thief",R.drawable.sword,5.0),
            Book("Inferno","by Dan Brown",R.drawable.nostra,1.0),
            Book("Bloodline","by James Rollins",R.drawable.blood,2.5),
            Book("The House of the Spirits","by Isabel Allende",R.drawable.spirits,3.0),
            Book("Tje Hummingbird's Daughter","byLuis Alberto Urrea",R.drawable.humming,1.5)

        )
        val bookAdapter=BooksAdapter(books)
        Binding.rvBooks.adapter=bookAdapter
       // val userAdapter=UserAdapter(users)
      //  Binding.rvUsers.layoutManager=LinearLayoutManager(this)
        //Binding.rvUsers.adapter=userAdapter
    }}

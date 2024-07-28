package com.freedman.makesomethingrandom

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.freedman.makesomethingrandom.databinding.ActivityPlayGamesBinding

class PlayGamesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayGamesBinding
    val myGamesArray: ArrayList<String> = arrayListOf("Fun Game 1", "Fun Game 2")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlayGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this, "Choose your GAME", Toast.LENGTH_LONG).show()
        createAdapter()

        whatDidYouClick()

    }

    inner class ExampleListener : OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            TODO("Not yet implemented")
        }
    }


    private fun whatDidYouClick() {
        val listener = OnItemClickListener { parent, view, position, id -> TODO("Not yet implemented") }
        val listener2 = object : OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                TODO("Not yet implemented")
            }

        }
        val listener3 = ExampleListener()

        binding.listViewGames.onItemClickListener = OnItemClickListener{ parent, view, position, id -> TODO("Not yet implemented") }
        binding.listViewGames.onItemClickListener = listener3


            Toast.makeText(this, "You selected ${myGamesArray[i]}", Toast.LENGTH_LONG).show()


            when (i) {
                1 -> {} //send to game 1 Activity
                2 -> {} //send to game 2 Activity
            }
            //Log.e ("check ME", " "  + myGamesArray[i] )
        }

    }

        /*{
            Log.e("check ME", binding.listViewGames.selectedItemId.toString())
        }*/



    private fun createAdapter() {
        val myGameArrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, myGamesArray)
        binding.listViewGames.adapter = myGameArrayAdapter
    }

    /*private fun GamesWeCanPlay() {
myGamesArray.add(2,"HELLO")
    }*/
}


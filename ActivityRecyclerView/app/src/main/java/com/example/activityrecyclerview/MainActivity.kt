package com.example.activityrecyclerview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()
    }


    private fun setUpRecyclerView() {
        var mRecyclerView : RecyclerView = findViewById<RecyclerView>(R.id.recycleView)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = GridLayoutManager(this, 2)
        mRecyclerView.adapter = RecyclerAdapter(getMovies())
    }

    data class Movie(
        var image : String,
        var title : String,
        var director : String
    )

    fun getMovies() : MutableList<Movie> {
        var movies : MutableList<Movie> = ArrayList()
        movies.add(Movie("https://cintilatio.com/wp-content/uploads/2021/12/Drive-Destacada.jpg","Literally Me", "Ryan Gosling"))
        movies.add(Movie("https://www.mubis.es/media/users/6291/104207/mi-critica-de-interstellar-original.jpg","Interstellar", "Christopher Nolan"))
        movies.add(Movie("https://imagenes.heraldo.es/files/image_990_v3/files/fp/uploads/imagenes/2023/07/20/cillian-murphy-en-el-papel-de-j-robert-oppenheimer-durante-la-ultima-pelicula-del-director-christopher-nolan.r_d.2179-1604.jpeg","Oppenheimer", "Christopher Nolan"))
        movies.add(Movie("https://www.elprat.cat/sites/default/files/styles/image_principal_large/public/patrimonicultural_cinecapri_elgatobotas.jpg?itok=pToKhJTT","El Gato con Botas: El Último Deseo", "Joel Crawford"))

        return movies
    }
}
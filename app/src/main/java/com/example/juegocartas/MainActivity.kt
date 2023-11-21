package com.example.juegocartas

import Adapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    private lateinit var categoryFruits: MenuItem
    private lateinit var recyclerView: RecyclerView
    private lateinit var categories: List<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 4)




        val categoryAnimals = Category(CategoryType.ANIMALS, "Animals", createAnimalItems())
        val categoryFood = Category(CategoryType.FOOD, "Food", createFoodItems())
        val categoryOther = Category(CategoryType.OTHER, "Other", createOtherItems())

        categories = listOf(categoryAnimals, categoryFood, categoryOther)

        loadCategory(CategoryType.ANIMALS)
    }

    private fun createAnimalItems(): List<Item> {
        return arrayListOf(
            Item(1, "Bear", R.drawable.bear_svgrepo_com, CategoryType.ANIMALS),
            Item(2, "Bird", R.drawable.bird_svgrepo_com, CategoryType.ANIMALS),
            Item(3, "Camel", R.drawable.camel_svgrepo_com, CategoryType.ANIMALS),
            Item(4, "Cat", R.drawable.cat_with_wry_smile_svgrepo_com, CategoryType.ANIMALS),
            Item(5, "Crocodile", R.drawable.crocodile_svgrepo_com, CategoryType.ANIMALS),
            Item(6, "Dog", R.drawable.dog_face_svgrepo_com, CategoryType.ANIMALS),
            Item(7, "Dolphin", R.drawable.dolphin_svgrepo_com, CategoryType.ANIMALS),
            Item(8, "Lion", R.drawable.lion_svgrepo_com, CategoryType.ANIMALS),
            Item(9, "Mouse", R.drawable.mouse_svgrepo_com, CategoryType.ANIMALS)
        )
    }

    private fun createFoodItems(): List<Item> {
        return arrayListOf(
            Item(
                10,
                "Banana",
                R.drawable.banana_blackbarry_blackberries_svgrepo_com,
                CategoryType.FOOD
            ),
            Item(11, "Cherries", R.drawable.cerejas_cherries_cherry_svgrepo_com, CategoryType.FOOD),
            Item(12, "Cupcake", R.drawable.cupcake_svgrepo_com, CategoryType.FOOD),
            Item(13, "Donut", R.drawable.donut_svgrepo_com, CategoryType.FOOD),
            Item(
                14,
                "Watermelon",
                R.drawable.fruit_melancia_watermelon_svgrepo_com,
                CategoryType.FOOD
            ),
            Item(15, "Hamburger", R.drawable.hamburger_svgrepo_com, CategoryType.FOOD),
            Item(16, "Orange", R.drawable.orange_svgrepo_com, CategoryType.FOOD),
            Item(17, "Pizza", R.drawable.pizza_svgrepo_com, CategoryType.FOOD)
        )
    }

    private fun createOtherItems(): List<Item> {
        return arrayListOf(
            Item(18, "Cancel", R.drawable.baseline_cancel_24, CategoryType.OTHER),
            Item(19, "Navigation", R.drawable.baseline_navigation_24, CategoryType.OTHER),
            Item(20, "Restart", R.drawable.baseline_restart_alt_24, CategoryType.OTHER),
            Item(21, "Background", R.drawable.ic_launcher_background, CategoryType.OTHER),
            Item(22, "Foreground", R.drawable.ic_launcher_foreground, CategoryType.OTHER),
            Item(23, "Poker", R.drawable.poker_svgrepo_com, CategoryType.OTHER)
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menucartas, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val categoryType = when (item.itemId) {
            R.id.categoryAnimals -> CategoryType.ANIMALS
            R.id.categoryFruits -> CategoryType.FOOD
            R.id.categoryTransports -> CategoryType.OTHER
            else -> return super.onOptionsItemSelected(item)
        }

        loadCategory(categoryType)
        return true
    }


    private fun loadCategory(categoryType: CategoryType) {
        val selectedCategory = categories.find { it.type == categoryType }

        if (selectedCategory != null) {
            val data = selectedCategory.items
            Log.d("LoadCategory", "Category: ${selectedCategory.name}, Items: ${data.size}")
            val adapter = Adapter(this, data)
            recyclerView.adapter = adapter
            adapter.notifyDataSetChanged()
        }
        else{
            Log.d("Error", "No se detecta  la categoria")
        }
    }

}

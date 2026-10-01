package com.example.computerandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variable entière pour le compteur initialisée à 0
    private var compteur: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Récupération des composants graphiques
        val textViewCompteur = findViewById<TextView>(R.id.textViewCompteur)
        val buttonIncrementer = findViewById<Button>(R.id.buttonIncrementer)
        val buttonDecrementer = findViewById<Button>(R.id.buttonDecrementer)
        val buttonReinitialiser = findViewById<Button>(R.id.buttonReinitialiser)

        // Clic sur le bouton +
        buttonIncrementer.setOnClickListener {
            compteur++
            textViewCompteur.text = compteur.toString()
        }

        // Clic sur le bouton -
        buttonDecrementer.setOnClickListener {
            compteur--
            textViewCompteur.text = compteur.toString()
        }

        // Clic sur le bouton Réinitialiser
        buttonReinitialiser.setOnClickListener {
            compteur = 0
            textViewCompteur.text = compteur.toString()
        }
    }
}
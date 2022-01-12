package com.example.collapsingtoolbarapp.data

import com.example.collapsingtoolbarapp.R
import com.example.collapsingtoolbarapp.model.Resources

class Datasource {

    fun loadResources(): List<Resources> {
        return listOf<Resources>(
            Resources(R.string.title1, R.string.affirmation1, R.drawable.image1),
            Resources(R.string.title2, R.string.affirmation2, R.drawable.image2),
            Resources(R.string.title3, R.string.affirmation3, R.drawable.image3),
            Resources(R.string.title4, R.string.affirmation4, R.drawable.image4),
            Resources(R.string.title5, R.string.affirmation5, R.drawable.image5),
            Resources(R.string.title6, R.string.affirmation6, R.drawable.image6),
            Resources(R.string.title7, R.string.affirmation7, R.drawable.image7),
            Resources(R.string.title8, R.string.affirmation8, R.drawable.image8),
            Resources(R.string.title9, R.string.affirmation9, R.drawable.image9),
            Resources(R.string.title10, R.string.affirmation10, R.drawable.image10)
        )
    }
}
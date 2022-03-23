package com.fernandocejas.sample.features.movies

import android.text.Editable
import android.text.TextWatcher
import java.util.regex.Pattern

class MovieValidator : TextWatcher {

    internal var isValid = false

    override fun afterTextChanged(editableText: Editable) {
        isValid = isValidMovie(editableText)
    }

    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) = Unit

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) = Unit

    companion object {

        /**
         * Email validation pattern.
         */
        private val MOVIE_PATTERN = Pattern.compile("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*\$")

        /**
         * Validates if the given input is a valid email address.
         *
         * @param email    The email to validate.
         * @return `true`  if the input is a valid email, `false` otherwise.
         */
        fun isValidMovie(movie: CharSequence?): Boolean {
            return movie != null && MOVIE_PATTERN.matcher(movie).matches()
        }
    }
}
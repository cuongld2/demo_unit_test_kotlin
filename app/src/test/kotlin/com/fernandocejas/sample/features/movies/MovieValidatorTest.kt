package com.fernandocejas.sample.features.movies


import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test

class MovieValidatorTest {

    @Test fun movieValidator_CorrectCase() {
        assertTrue(MovieValidator.isValidMovie("The lord of the rings"))
    }

    @Test fun movieValidator_FailCase() {
        assertFalse(MovieValidator.isValidMovie("name@email"))
    }

}
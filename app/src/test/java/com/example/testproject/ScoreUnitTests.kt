package com.example.testproject

import org.junit.Assert.assertEquals
import org.junit.Test

class ScoreUnitTests {

    @Test
    fun whenIncrementingScore_shouldIncrementCurrentScore() {
        val score = Score()
        score.increment()
        assertEquals(
            "Current score should have been 1",
            1,
            score.current)
    }

    @Test
    fun whenIncrementingScore_aboveHighScore_shouldAlsoIncrementHighScore() {
        val score = Score()
        score.increment()
        assertEquals(1, score.highest)
    }
    @Test
    fun whenIncrementingScore_belowHighScore_shouldNotIncrementHighScore() {
        val score = Score(10)
        score.increment()
        assertEquals(10, score.highest)
    }
}
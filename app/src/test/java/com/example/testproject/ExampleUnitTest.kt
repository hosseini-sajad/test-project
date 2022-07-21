package com.example.testproject

import com.nhaarman.mockitokotlin2.*
import org.junit.Test

import org.junit.Assert.*
import org.mockito.ArgumentMatchers.anyString

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun whenAnswering_shouldDelegateToQuestion() {
        // 1
        val question = mock<Question>()
        val game = Game(listOf(question))
        // 2
        game.answer(question, "OPTION")
        // 3
        verify(question, times(1)).answer(eq("OPTION"))
    }

    @Test
    fun whenAnsweringCorrectly_shouldIncrementCurrentScore() {
        val question = mock<Question>()
        whenever(question.answer(anyString())).thenReturn(true)

        val score = mock<Score>()

        val game = Game(listOf(question), score)

        game.answer(question,"OPTION")
//        assertEquals(1, game.currentScore)
        verify(score).increment()
    }

    @Test
    fun whenAnsweringIncorrectly_shouldNotIncrementCurrentScore() {
        val question = mock<Question>()
        whenever(question.answer(anyString())).thenReturn(false)
        val score = mock<Score>()
        val game = Game(listOf(question), score)

        game.answer(question, "OPTION")
//        assertEquals(0, game.currentScore)
        verify(score, never()).increment()
    }

    /*@Test
    fun whenIncrementingScore_shouldIncrementCurrentScore() {
        val game = Game(emptyList(), 0)
        game.incrementScore()
        assertEquals(
            "Current score should have been 1",
            1,
            game.currentScore)
    }

    @Test
    fun whenIncrementingScore_aboveHighScore_shouldAlsoIncrementHighScore() {
        val game = Game(emptyList(), 0)
        game.incrementScore()
        assertEquals(1, game.highestScore)
    }

    @Test
    fun whenIncrementingScore_belowHighScore_shouldNotIncrementHighScore() {
        val game = Game(emptyList(), 10)
        game.incrementScore()

        assertEquals(10, game.highestScore)
    }*/
}
package com.example.testproject

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.testproject", appContext.packageName)
    }

    /*@Test
    fun whenIncrementScore_shouldIncrementCurrentScore() {
        val game = Game()
        game.incrementScore()
        assertEquals(1, game.currentScore)
    }

    @Test
    fun whenIncrementingScore_aboveHighScore_shouldAlsoIncrementHighScore() {
        val game = Game(10)
        game.incrementScore()
        assertEquals(10, game.highScore)
    }

    @Test
    fun whenCreatingQuestion_shouldNotHaveAnsweredOption() {
        val question = Question("CORRECT", "INCORRECT")
        val result = question.answer("CORRECT")
        assertTrue(result)
    }*/
}
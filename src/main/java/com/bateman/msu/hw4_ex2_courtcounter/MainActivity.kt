package com.bateman.msu.hw4_ex2_courtcounter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bateman.msu.hw4_ex2_courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    private val mainActivityViewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayForTeamA(mainActivityViewModel.getScoreTeamA())
        displayForTeamB(mainActivityViewModel.getScoreTeamA())
    }
    fun addOneForTeamA(v: View?) {
        mainActivityViewModel.setScoreTeamA(mainActivityViewModel.getScoreTeamA() + 1)
        displayForTeamA(mainActivityViewModel.getScoreTeamA())
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        mainActivityViewModel.setScoreTeamA(mainActivityViewModel.getScoreTeamA() + 2)
        displayForTeamA(mainActivityViewModel.getScoreTeamA())
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        mainActivityViewModel.setScoreTeamA(mainActivityViewModel.getScoreTeamA()+3)
        displayForTeamA(mainActivityViewModel.getScoreTeamA())
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        mainActivityViewModel.setScoreTeamB(mainActivityViewModel.getScoreTeamB()+1)
        displayForTeamB(mainActivityViewModel.getScoreTeamB())
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        mainActivityViewModel.setScoreTeamB(mainActivityViewModel.getScoreTeamB() + 2)
        displayForTeamB(mainActivityViewModel.getScoreTeamB())
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        mainActivityViewModel.setScoreTeamB(mainActivityViewModel.getScoreTeamB() +3)
        displayForTeamB(mainActivityViewModel.getScoreTeamB())
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        mainActivityViewModel.setScoreTeamA(0)
        mainActivityViewModel.setScoreTeamA(0)
        displayForTeamA(mainActivityViewModel.getScoreTeamA())
        displayForTeamB(mainActivityViewModel.getScoreTeamA())
    }


    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = mainActivityViewModel.getScoreTeamA().toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = mainActivityViewModel.getScoreTeamB().toString()
    }
}

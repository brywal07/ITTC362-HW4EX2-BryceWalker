package com.bateman.msu.hw4_ex2_courtcounter

import android.view.View
import androidx.lifecycle.ViewModel


class MainActivityViewModel : ViewModel(){
    private var scoreTeamA = 0
    private var scoreTeamB = 0


    fun getScoreTeamA():Int{
        return scoreTeamA
    }

    fun setScoreTeamA(score: Int){
       scoreTeamA = score
    }

    fun getScoreTeamB():Int{
        return scoreTeamB
    }

    fun setScoreTeamB(score: Int){
        scoreTeamB = score
    }



}
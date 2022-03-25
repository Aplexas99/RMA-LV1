package Checkers

import Models.Die

interface Checker {
    fun check(mutableList: MutableList<Die>);
}
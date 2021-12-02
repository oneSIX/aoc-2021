package com.onesix.advent2021

/**
 * Advent of Code 2021, Day 2 - Dive!
 * Problem description: https://adventofcode.com/2021/day/2
 * TLDR: This one builds off yesterday; now we've got a submarine that can move down or forward.
 * The puzzle input looks kinda like this:
 *
 * forward 5
 * down 5
 * forward 8
 * up 3
 * down 8
 * forward 2
 *
 */
class Day02(private val input: List<String>) {

    fun solvePart1(data: List<String> = input): Int {

        var down = 0
        var forward = 0

        data.forEach {
            val inp = it.split(" ")
            val (command, intensity) = inp
            when(command) {
                "forward" -> {
                    forward += intensity.toInt()
                }
                "down" -> {
                    down += intensity.toInt()
                }
                "up" -> {
                    down -= intensity.toInt()
                }
            }
        }

        return down * forward
    }
}
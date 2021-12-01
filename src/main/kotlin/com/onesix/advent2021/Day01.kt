package com.onesix.advent2021


/**
 *  Advent of Code 2021, Day 1 - Sonar Sweep
 *  Problem description: https://adventofcode.com/2021/day/1
 *  TLDR: Each line in the input is a Sonar depth measurement, the task for part1 is to
 *  count the number of times a depth measurement increases from the previous measurement.
 */
class Day01(val input: List<Int>) {

    fun solvePart1(): Int {
        var count = -1
        input.forEachIndexed { index, i ->
            // if i > index[i-1] increment
            if (count == -1) {
                count += 1
                return@forEachIndexed
            }
            // this pass is higher than the previous
            if (i > input[index - 1]) count += 1
        }

        return count
    }


}
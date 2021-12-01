package com.onesix.advent2021


/**
 *  Advent of Code 2021, Day 1 - Sonar Sweep
 *  Problem description: https://adventofcode.com/2021/day/1
 *  TLDR: Each line in the input is a Sonar depth measurement, the task for part1 is to
 *  count the number of times a depth measurement increases from the previous measurement.
 */
class Day01(private val input: List<Int>) {

    fun solvePart1(data: List<Int> = input): Int {
        var count = -1
        data.forEachIndexed { index, i ->
            // if i > index[i-1] increment
            if (count == -1) {
                count += 1
                return@forEachIndexed
            }
            // this pass is higher than the previous
            if (i > data[index - 1]) count += 1
        }

        return count
    }

    /**
     * Same input at the first part
     * ...count the number of times the sum of measurements in this sliding window increases from the previous sum.
     * So, compare A with B, then compare B with C, then C with D, and so on.
     * Stop when there aren't enough measurements left to create a new three-measurement sum.
     *
     * https://adventofcode.com/2021/day/1#part2
     */
    fun solvePart2(): Int =
        solvePart1(input.windowed(3).map { it.sum() })
}
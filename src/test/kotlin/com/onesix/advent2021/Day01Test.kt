package com.onesix.advent2021

import com.onesix.advent2021.Resources.resourceAsListOfInt
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Day 1")
class Day01Test {

    private val input = listOf(
        199,
        200,
        208,
        210,
        200,
        207,
        240,
        269,
        260,
        263
    )

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Matches example`() {
            // Act
            val answer = Day01(input).solvePart1()

            // Assert
            assertThat(answer).isEqualTo(7)
        }

        @Test
        fun `Actual answer`() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01.txt")).solvePart1()

            // Assert
            assertThat(answer).isEqualTo(1_400)
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Matches example`() {
            // Act
            val answer = Day01(input).solvePart2()

            // Assert
            assertThat(answer).isEqualTo(5)
        }

        @Test
        fun `Actual answer`() {
            // Act
            val answer = Day01(resourceAsListOfInt("day01.txt")).solvePart2()

            // Assert
            assertThat(answer).isEqualTo(1429)
        }
    }
}
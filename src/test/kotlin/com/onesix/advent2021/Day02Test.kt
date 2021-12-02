package com.onesix.advent2021

import com.onesix.advent2021.Resources.resourceAsList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Day 2")
class Day02Test {

    private val input = listOf(
        "forward 5",
        "down 5",
        "forward 8",
        "up 3",
        "down 8",
        "forward 2"
    )

    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Matches example`() {
            val answer = Day02(input).solvePart1()
            assertThat(answer).isEqualTo(150)
        }

        @Test
        fun `Actual answer`() {
            // Act
            val answer = Day02(resourceAsList("day02.txt")).solvePart1()

            // Assert
            assertThat(answer).isEqualTo(1989014)
        }
    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Matches example`() {
            val answer = Day02(input).solvePart2()
            assertThat(answer).isEqualTo(900)
        }

        @Test
        fun `Actual answer`() {
            // Act
            val answer = Day02(resourceAsList("day02.txt")).solvePart2()

            // Assert
            assertThat(answer).isEqualTo(1989014)
        }
    }
}
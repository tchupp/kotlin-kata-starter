package com.popehutch

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.Test

class StringCalculatorTest {

    val stringCalculator = StringCalculator

    @Test
    fun add_Returns0_ForEmptyString() {
        val sum = this.stringCalculator.add("")

        assertThat(sum).isEqualTo(0)
    }

    @Test
    fun add_ReturnsValue_ForSingleValueString() {
        val sum1 = this.stringCalculator.add("1")

        assertThat(sum1).isEqualTo(1)

        val sum2 = this.stringCalculator.add("24")

        assertThat(sum2).isEqualTo(24)
    }

    @Test
    fun add_Returns0_ForNonNumericString() {
        val sum1 = this.stringCalculator.add("1b")

        assertThat(sum1).isEqualTo(0)

        val sum2 = this.stringCalculator.add("89d")

        assertThat(sum2).isEqualTo(0)
    }
}
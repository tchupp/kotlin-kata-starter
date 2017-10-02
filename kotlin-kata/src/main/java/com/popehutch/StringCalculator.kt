package com.popehutch

typealias NumberInput = String

object StringCalculator {

    private val convert: (String) -> Int? = { it.toIntOrNull() }

    fun add(numbers: NumberInput): Int {
        return convert(numbers) ?: 0
    }
}

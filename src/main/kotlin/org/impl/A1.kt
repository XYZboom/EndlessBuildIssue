package org.impl

import org.A0
import org.GenType

class A: A0() {
    fun func(): GenType {
        val list = listOf(this::func1, this::func2)
        return selectFirst(list)
    }
}

fun <T> selectFirst(l: List<T>): T {
    return l.first()
}
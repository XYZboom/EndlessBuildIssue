package org

import org.foo.A1
import org.foo.B1

open class A0 {
    fun func1(a: A1, b: String): B1? {
        return null
    }

    fun func1(a: A1, b: String, c: String): B1? {
        return null
    }

    fun func2(a: A1, b: String): B1? {
        return null
    }
}


package ch6

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/* 
 * Created with passion and love
 *    for project FunctionalKotlin
 *        by Jatzuk on 04.07.2019
 *                                            *_____*
 *                                           *_*****_*
 *                                          *_(O)_(O)_*
 *                                         **____V____**
 *                                         **_________**
 *                                         **_________**
 *                                          *_________*
 *                                           ***___***
 */

abstract class MakeEven(initialValue: Int) : ReadWriteProperty<Any?, Int> {
    private var value = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>) = value

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        val oldValue = value
        val wasEven = value % 2 == 0
        this.value = if (wasEven) value else value + 1
        afterAssignmentCall(property, oldValue, value, wasEven)
    }

    abstract fun afterAssignmentCall(
        property: KProperty<*>,
        oldValue: Int,
        newValue: Int,
        wasEven: Boolean
    )
}

inline fun makeEven(
    initialValue: Int,
    crossinline onAssignment: (property: KProperty<*>, oldValue: Int, newValue: Int, wasEven: Boolean) -> Unit
): ReadWriteProperty<Any?, Int> = object : MakeEven(initialValue) {
    override fun afterAssignmentCall(
        property: KProperty<*>,
        oldValue: Int,
        newValue: Int,
        wasEven: Boolean
    ) = onAssignment(property, oldValue, newValue, wasEven)
}

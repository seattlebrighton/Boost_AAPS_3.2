package info.nightscout.androidaps.database.entities

import androidx.annotation.StringRes

sealed class XXXValueWithUnit {

    object UNKNOWN : XXXValueWithUnit() // formerly None used as fallback

    data class SimpleString(val value: String) : XXXValueWithUnit() // formerly one usage of None

    data class SimpleInt(val value: Int) : XXXValueWithUnit() // formerly one usage of None

    class Mgdl(val value: Double) : XXXValueWithUnit()

    class Mmoll(val value: Double) : XXXValueWithUnit()

    class Timestamp(val value: Long) : XXXValueWithUnit()

    class Insulin(val value: Double) : XXXValueWithUnit()

    class UnitPerHour(val value: Double) : XXXValueWithUnit()

    class Gram(val value: Int) : XXXValueWithUnit()

    class Minute(val value: Int) : XXXValueWithUnit()

    class Hour(val value: Int) : XXXValueWithUnit()

    class Percent(val value: Int) : XXXValueWithUnit()

    class TherapyEvent(val value: String) : XXXValueWithUnit()

    class TherapyEventType(val value: info.nightscout.androidaps.database.entities.TherapyEvent.Type) : XXXValueWithUnit()

    class TherapyEventMeterType(val value: info.nightscout.androidaps.database.entities.TherapyEvent.MeterType) : XXXValueWithUnit()

    class TherapyEventTTReason(val value: TemporaryTarget.Reason) : XXXValueWithUnit()



    class StringResource(@StringRes val value: Int, val params : List<XXXValueWithUnit> = listOf()) : XXXValueWithUnit()

    companion object {

        fun fromGlucoseUnit(value: Double, string: String): XXXValueWithUnit? = when (string) {
            "mg/dl", "mgdl" -> Mgdl(value)
            "mmol", "mmol/l" -> Mmoll(value)
            else             -> null
        }
    }
}

/***
 * Idea: Leverage sealed classes for units
 * Advantage: it is clear what type of data a Unit contains. Still we are exhaustive on when
 *
 * The condition "condition" that is used to check if an item should be logged can be replaced by .takeIf { condition }.
 * The value then would not have to be handled but the logging could simply discard null value.
 */

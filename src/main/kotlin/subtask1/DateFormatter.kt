package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            date.format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru")))
        } catch (e: Exception) {
            "No such day exists"
        }
    }
}

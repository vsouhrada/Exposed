package org.jetbrains.exposed.sql.tests.mssql

import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.Table
import org.junit.Test

/**
 * @author vsouhrada
 */

object MssqlTests {

  init {

  }

  @Test fun createTableStatement() {
    Database.connect(
            url = "",
            driver = "",
            user = "",
            password = "")



  }

  object DWMCustomerCountHourlyTable : Table("AA_EXP") {

    val businessUnitId = varchar("ID_BSN_UN", 32).primaryKey()
    val hourOfDay = integer("HOUR_OF_DAY").primaryKey()
    val dayOfWeek = integer("DAY_OF_WEEK").primaryKey()
    val weekOfYear = integer("WEEK").primaryKey()
    val dayOfMonth = integer("DAY_OF_MONTH").primaryKey()
    val month = integer("MONTH").primaryKey()
    val year = integer("YEAR").primaryKey()
    var count = integer("COUNT")

  }

}

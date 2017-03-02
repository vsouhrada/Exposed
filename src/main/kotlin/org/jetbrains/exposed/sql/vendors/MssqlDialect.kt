package org.jetbrains.exposed.sql.vendors

internal object MssqlDialect : VendorDialect("jtds") {

  override fun shortAutoincType(): String = "INT identity(1,1)"

  override fun longAutoincType(): String = "INT identity(1,1)"

  override fun createTableStatement(): String {
    return buildString { "CREATE TABLE" }
  }

  // TODO - Limit


}
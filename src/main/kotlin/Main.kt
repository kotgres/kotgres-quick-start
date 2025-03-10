package io.kotgres

import io.kotgres.dsl.deleteFrom
import io.kotgres.dsl.operators.*


fun main() {
    val sql = deleteFrom("users")
        .where("age" greater 100)
        .orWhere("was_deleted" eq false)
        .toSql(true)
    println(sql)
}
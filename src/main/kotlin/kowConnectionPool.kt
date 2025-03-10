package io.kotgres

import io.kotgres.orm.connection.KotgresConnectionPool
import io.kotgres.orm.connection.KotgresConnectionPoolConfig


val kowConnectionPool = KotgresConnectionPool.build(
    KotgresConnectionPoolConfig(
        "0.0.0.0", // host
        "kotgres", // database name
        54333, // port
        "kotgres", // username
        "kotgres", // password
    ),
)
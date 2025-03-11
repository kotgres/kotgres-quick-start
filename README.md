# Kotgres Quick Start

This repository contains an example project that uses Kostgres to connect to a Postgres database.

## Pre-requisites

If you don't have docker, please install it [here](https://docs.docker.com/desktop/) first.

Then run the docker container using `docker compose up -d`.

## Running the project

Just open the `src/main/kotlin` folder, right click on Main.kt and click on `Run 'MainKt'`!

If all is well, you should see the following output:
```
New user has id 1
There are 1 users in the database
```

Congratulations 🎉 You have successfully created a Kotlin application that uses Kotgres to connect to a PostgreSQL database!

## Next steps

Feel free to play around with `userDao` to learn more about what you can do! Here is a list of some methods you can try:
- `userDao.update`: to update entities
- `userDao.delete`: to delete entities by passing the entity
- `userDao.deleteById`: to delete entities by passing the id
- `userDao.getByPrimaryKey`: to get an entity by its primary key
- `userDao.runSelect` && `userDao.selectQuery`: to run complex select queries returning an entity

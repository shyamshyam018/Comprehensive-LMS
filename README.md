# Library Management Console MVP

A Java console application for managing a small library catalog, members, and loans. The current version stores data in memory, so all records reset when the program exits.

## Requirements

- JDK 21 or newer
- Maven

## Run

```sh
mvn compile
java -cp target/classes com.example.library.Main
```

## Features

- Add and list books.
- Search titles and authors, without case sensitivity.
- Register and list members; email addresses are normalized and unique.
- Borrow and return books, with a 14-day loan period.
- View loan history.

## Structure

- `model`: immutable book, member, and loan data.
- `repository`: storage interfaces that the service depends on.
- `repository.inmemory`: current in-memory implementations.
- `service`: library rules, independent of the console.
- `console`: prompts, input parsing, and output formatting.
- `Main`: constructs the in-memory app and starts the console.

The console is single-threaded and in-memory storage is temporary. Persistence, automated tests, and concurrent access are future milestones.

# db-engines

![](https://github.com/t-izbassar/db-engines/workflows/Scala%20CI/badge.svg)

Exploration of how database engines work by trying to implement low-level details from simplest ones.
The main goal is to learn functional programming concepts as well as how databases are working in
the inside. This is completely experimental and only for learning purposes.

## Key-value file storage with in-memory hash index

Plan to start from the simplest storage engine possible: log-structured storage.
It will store keys and values in file and will retrieve information with the
help of hash-index, which will be initially stored in-memory. Also I plan to
add support for compacting and merging files, after some storage size will exceed
configured amount.

## License

Licensed under [Apache 2.0](LICENSE).

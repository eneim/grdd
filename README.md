# grdd - A Gradle Drivent Development project.

For a java project which includes both unit test and behavior test code, it is better to have the source code and tasks for testing separated. This Project is the very simple projcet which aim to support that.

## Run test

- unit test by JUnit

```groovy
./gradlew test
```

- behavior test by cucumber

```groovy
./gradlew cucumber
```

## TODO

- [x] Extends ```jar``` task to be able to package dependencies in jar file.

- [x] Add CI script.

## LICENSE

> Apache 2.0

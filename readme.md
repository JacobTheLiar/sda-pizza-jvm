# SDA - JVM

projekt utworzony na potrzeby zrobienia zadań dodatkowych zleconych przez trenera na potrzeby wyjasnień z JVM


## kompilowanie projektu z wiersza poleceń

``` 
$ javac -d bin -cp ./src src/main/java/sda_pizza_jvm/*.java
javac: directory not found: bin
Usage: javac <options> <source files>
use -help for a list of possible options

```

wywołało błąd należy utworzyć nowy folder

```
mkdir bin
```

następne wywołanie przeszło bez błędów

```
$ javac -d bin -cp ./src src/main/java/sda_pizza_jvm/*.java
```
 
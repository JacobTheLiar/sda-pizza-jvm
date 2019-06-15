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

## uruchamianie aplikacji w konsoli

```
$ java -cp ./bin sda_pizza_jvm.App
``` 

i po uruchomieniu
```
meal list:
  1.  Pizza Swojska         19,99un
  2.  Pizza Farmerska       23,99un
  3.  Pizza Boczek          15,99un
  4.  Pizza Margherita      11,99un
  5.  Pizza Meat            25,99un


Summary of 0 items in price 0,00un

Select your pizza: >
```
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

Summary of 0 items @ price 0,00un

Select your pizza: >
```

## pakowanie do jednego pliku

```
$ jar cvf pizzaApp.jar -C bin/ .
added manifest
adding: sda_pizza_jvm/(in = 0) (out= 0)(stored 0%)
adding: sda_pizza_jvm/App.class(in = 339) (out= 260)(deflated 23%)
adding: sda_pizza_jvm/ChosenSummary.class(in = 1109) (out= 666)(deflated 39%)
adding: sda_pizza_jvm/Input.class(in = 728) (out= 484)(deflated 33%)
adding: sda_pizza_jvm/Meal.class(in = 169) (out= 147)(deflated 13%)
adding: sda_pizza_jvm/MealPrinter.class(in = 1120) (out= 663)(deflated 40%)
adding: sda_pizza_jvm/Pizza.class(in = 944) (out= 538)(deflated 43%)
adding: sda_pizza_jvm/Restaurant.class(in = 1745) (out= 1035)(deflated 40%)
```

## uruchamianie jar'a w konsoli

```
$ java -cp pizzaApp.jar sda_pizza_jvm.App
```

## informacje o pliku MANIFEST.MF

tworzymy folder META-INF

```
mkdir META-INF
cd META-INF
```

a w nim tworzymy plik MANIFEST.MF

```
touch MANIFEST.MF
```

i wypełniamy zawartością

```
Main-Class: sda_pizza_jvm.App
```

## kompilowanie z nowym manifestem

```
cd META-INF
```

uruchamiamy

```
$ jar cvfm pizzaAppMF.jar MANIFEST.MF -C ../bin/ .
added manifest
adding: sda_pizza_jvm/(in = 0) (out= 0)(stored 0%)
adding: sda_pizza_jvm/App.class(in = 339) (out= 260)(deflated 23%)
adding: sda_pizza_jvm/ChosenSummary.class(in = 1109) (out= 666)(deflated 39%)
adding: sda_pizza_jvm/Input.class(in = 728) (out= 484)(deflated 33%)
adding: sda_pizza_jvm/Meal.class(in = 169) (out= 147)(deflated 13%)
adding: sda_pizza_jvm/MealPrinter.class(in = 1120) (out= 663)(deflated 40%)
adding: sda_pizza_jvm/Pizza.class(in = 944) (out= 538)(deflated 43%)
adding: sda_pizza_jvm/Restaurant.class(in = 1745) (out= 1035)(deflated 40%)
```

## uruchamianie z nowym manifestem

```
$ java -jar pizzaAppMF.jar
```


# Java GUI 

Dieses Projekt enthält eine einfache Java GUI-Anwendung, die es ermöglicht, Text in ein Textfeld einzugeben und diesen Text in eine Textdatei zu schreiben.

## Voraussetzungen

- Java JDK 8 oder höher
- Apache Maven (optional)

## Projektstruktur

- `src/`: Enthält den Quellcode des Projekts.
- `lib/`: Enthält die Bibliotheken, die vom Projekt verwendet werden.
- `bin/`: Enthält die kompilierten Klassen des Projekts.

## Anwendung starten

Um die Anwendung zu starten, navigieren Sie zum Stammverzeichnis des Projekts und führen Sie den folgenden Befehl aus:

```sh
javac -d bin -sourcepath src src/main.java
java -cp bin main
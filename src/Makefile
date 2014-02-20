all: sources packages

sources: ANSIConsole

packages: sources ANSIConsole_jar

ANSIConsole: de/malte_bublitz/util/ANSIConsole.java
	@echo "[JAVAC] de.malte_bublitz.util.ANSIConsole"
	@javac de/malte_bublitz/util/ANSIConsole.java

ANSIConsole_jar: ANSIConsole
	@echo "[JAR]   ANSIConsole.jar"
	@jar cf ../bin/ANSIConsole.jar de/malte_bublitz/util/ANSIConsole.class

clean:
	find . -iname "*.class" -exec rm -f '{}' \;

clean-all: clean
	rm -f ../bin/*.jar

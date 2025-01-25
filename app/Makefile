ifeq ($(OS),Windows_NT)
  GRADLEW=.\gradlew
  BIN_APP=.\build\install\app\bin\app
else
  GRADLEW=./gradlew
  BIN_APP=./build/install/app/bin/app
endif

clean: # Очистить дистрибутив
	$(GRADLEW) clean

build: clean # Собрать дистрибутив
	$(GRADLEW) installDist

run-dist: build # Запустить дистрибутив
	$(BIN_APP)

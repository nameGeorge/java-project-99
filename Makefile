.DEFAULT_GOAL := build-run

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

start-prod:
	./gradlew bootRun

#install:
#	./gradlew installDist
#run-dist:
#	./build/install/app/bin/app

#run:
#	./gradlew run

lint:
	./gradlew checkstyleMain checkstyleTest

test:
	./gradlew test

report:
	./gradlew jacocoTestCoverage jacocoTestReport

build-run: build run

.PHONY: build
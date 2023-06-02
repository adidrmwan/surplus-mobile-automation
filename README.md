# AUTOMATION TESTING - JAVA

System Under Test:
1. Android

Features:
1. Cucumber
2. Appium for Android

## Prerequisites
* [JDK 11](https://docs.oracle.com/en/java/javase/11/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)
* [Git](https://git-scm.com/downloads)
* [Intellij IDEA](https://www.jetbrains.com/idea/download/)
* [Gradle](https://gradle.org/install/)
* [Appium Desktop](https://github.com/appium/appium-desktop)
* [Android Studio](https://developer.android.com/studio)
* [Virtual Device](https://developer.android.com/studio/run/managing-avds)
* [ADB](https://developer.android.com/studio/command-line/adb)

## Getting started
1. Clone the repository
2. Start android emulator or connect with real device

## Intellij Plugin
### Cucumber for Java
Add IntelliJ Cucumber for Java plugin:

* Open `Preferences` (⌘ + ,)
* Go to `Plugins > Marketplace`
* Search for `Cucumber for Java` and Install

### Lombok Plugin
Add IntelliJ Cucumber for Java plugin:
* Open `Preferences` (⌘ + ,)
* Go to `Plugins > Marketplace`
* Search for `Lombok` and Install

## Running the Test

* To execute Android Test cases
  > ./gradlew clean cucumber --tags @Android generateCucumberReports

## Report
* Find the reporting file on `build/customreport/overview-features.html`
* Open the reporting file in browser

## Sample Result

https://github.com/adidrmwan/surplus-mobile-automation/assets/22820270/317d1e09-8727-4268-92a8-b630d8f22dc2

## Documentations
* https://appium.io/docs/en/about-appium/getting-started/?lang=en
* https://www.guru99.com/introduction-to-appium.html

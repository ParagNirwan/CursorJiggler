# Cursor Jiggler

A small Java Swing desktop utility that moves the mouse cursor at a configurable interval. It can be useful for keeping a computer awake during long-running tasks when that behavior is permitted.

## Features

- Simple Swing interface
- Configurable cursor movement interval (from 5 seconds up to 5 minutes)
- An `OFF` option to stop cursor movement

## Requirements

- Java Development Kit (JDK)
- A graphical desktop environment

## Run

Open the project in an IDE such as IntelliJ IDEA and run `CursorJiggler.java`. The icon is loaded from the classpath so it can work from a packaged JAR when the asset is included as a resource.

## Notes

Cursor movement can interrupt other work. Use this utility only where permitted, and do not use it to bypass workplace attendance, activity-monitoring, or security policies.
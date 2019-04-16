# ASSIGNMENT 3

## Details

**Author:** [Lex](github.com/lexvonbon)
**Version:** 1.0
**Date:** 2019-03-10


## Requirements
* Apache Ant
* JDK 11


## Build Instructions
 1. Run `ant compile` in the main directory or optionally:
   - `ant problem`_&lt;`int`&gt;_ where _int_ is the problem number
 2. _`cd`_ into `build` directory

### _Alternative_
 1. _`cd`_ into `src` directory
 2. Run `javac -d ..\build -cp . *.java`
 4. Run `cp MyClass.txt ..\build\MyClass.txt`
 5. _`cd`_ into `..\build` directory

## Test Instructions
  To test:
  - _`cd`_ into `build` directory
  - Run `java -jar Quiz.jar` OR if built without ANT: `java Quiz`

## Cleaning Instructions
 1. _`cd`_ into the main directory
 2. Run either of these commands:
    - `ant clean`
    - `rmdir build`

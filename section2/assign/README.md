# ASSIGNMENT 2

## Details

**Author:** [Lex](github.com/lexvonbon)
**Version:** 1.0
**Date:** 2019-03-10


## Requirements
* Apache Ant
* JDK 11


## Build Instructions
 1. Run `ant compile` in the main directory
 2. _`cd`_ into `build` directory

### _Alternative_
 1. _`cd`_ into `src` directory
 2. Run `javac -d ..\build -cp . *.java`
 3. _`cd`_ into `..\build` directory


## Test Instructions
  To test each module:
  - Run `java SumAndAverage`
  - Run `java Curfew`
  - Run `java LargestInt`

## Cleaning Instructions
 1. _`cd`_ into the main directory
 2. Run either of these commands:
    - `ant clean`
    - `rmdir build`